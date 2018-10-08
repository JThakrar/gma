
import org.apache.spark.SparkConf
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.IntegerType
import org.apache.spark.sql.{Column, DataFrame, SparkSession}

/**
  * Main runner for measure computation.
  * Given a valid measure label, this Spark program computes its LACE score.
  * Currently the program is designed for "local" execution - i.e. No HDFS, S3, etc.
  * However, due to the use of Spark, it is trivial to change batch and streaming
  * data sources of different types.
  *
  * Data (sample data) is assumed to be located in a data directory represented
  * by the value of the environment variable DATA_DIR.
  */
object Run {

  def main(args: Array[String]): Unit = {

    if (args.length == 0) {
      println(usage)
      System.exit(0)
    }

    val measure = args(0).toUpperCase

    if (!Measure.measures.contains(measure)) {
      println(s"${args(0)} is an invalid measure. Should be one of the following: ${Measure.measures.mkString(", ")}")
      System.exit(1)
    }

    val appHome = System.getenv("APP_HOME")

    val conf = new SparkConf()

    val sparkSession = SparkSession.builder().config(conf).getOrCreate()

    import sparkSession.implicits._

    val dataDir = System.getenv("DATA_DIR")
    if (dataDir.isEmpty) {
      println(missingDataDir)
      System.exit(1)
    }

    // Using textFile over csv for full/better control over data parsing.
    // Downside is that we need to parse each row to drop just ONE single header
    val data = sparkSession.read.textFile(dataDir).filter(!_.startsWith("encounter_id"))
    val encounters = data.map(Encounter(_))

    val encountersForMeasure = encounters.filter(e => e.diagnosisCodeMatchesMeasure(measure))

    val denominator = encountersForMeasure.count
    val laceScores = encountersForMeasure.map(e => e.laceScore(measure))
    val numerator = laceScores.filter(score => score > 9).count
    val score = if (denominator == 0) 0 else numerator*1.0/denominator*1.0

    println(printScore(measure, score))

  }

  def usage: String = {
    s"""
       |
       |Usage: computeMeasure <measure>
       |
       |<measure> can be one of ${Measure.measures.mkString(", ")} (case-insensitive)
       |
     """.stripMargin
  }

  def missingDataDir: String = {
    s"""
       |
       |It seems that environment variable DATA_DIR is not defined.
       |
       |Please ensure that you are running this Spark application
       |correctly using the shell script computeMeasure.
       |
     """.stripMargin
  }

  def printScore(measure: String, score: Double): String = {
    s"""
       |
       |
       |
       |============================================================================================
       |Score for measure ${measure} = ${score}
       |============================================================================================
       |
       |
       |
     """.stripMargin
  }
}