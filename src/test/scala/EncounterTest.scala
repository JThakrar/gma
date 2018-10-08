
import org.scalatest._

/**
  * Ensure that an Encounter record can be created correctly.
  */
class EncounterTest extends FunSuite {

  val line1 = s"""2278392,8222157,Caucasian,Female,67,4,3,2,410.11,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,No,Yes,No,No,No,No,No,No,No,No,No,No,No,Yes,Yes,No,No,No,No,No,No,No,No,No,No,No,Yes,No,No,No,No,Yes,No,No,No,No,No,No,Yes,Yes,No,No"""
  val encounter1 = Encounter(line1)

  val expectedLaceScoresForEncounter1 = Seq(10, 13, 10, 11, 11, 12)
  val measureAndLaceScorePairs = Measure.measures.zip(expectedLaceScoresForEncounter1)

  val expectedComorbidityScoresForEncounter1 = Seq(0, 3, 0, 1, 1, 2)
  val measureAndComorbidityScorePairs = Measure.measures.zip(expectedComorbidityScoresForEncounter1)

  val line2 = line1.replaceAll("No", "Yes")
  val encounter2 = Encounter(line2)

  val line3 = line1.replaceAll("Yes", "No")
  val encounter3 = Encounter(line3)

  test(s"Testing comorbidityPoints for each measure when all columns are 1") {
    for (measure <- Measure.measures) {
      val morbidities = Measure.comorbidity(measure)
      val sum = encounter2.comorbidityPoints(measure)
      //    val sum = encounter.comorbidityPoints(morbidities)
      assert(sum == Measure.comorbidity(measure).length)
    }
  }

  test(s"Testing comorbidityPoints for each measure when all columns are 0") {
    for (measure <- Measure.measures) {
      val morbidities = Measure.comorbidity(measure)
      val sum = encounter3.comorbidityPoints(measure)
      //    val sum = encounter.comorbidityPoints(morbidities)
      assert(sum == 0)
    }
  }

  test("Testing length of stay points for an arbitrary record") {
    assert(encounter1.lengthOfStayPoints == 4)
  }

  test("Testing acute admission points for an arbitrary record") {
    assert(encounter1.acuteAdmissionsPoints == 3)
  }

  test("Testing comorbidity points for an arbitrary record for each measure") {
    for (pair <- measureAndComorbidityScorePairs) {
      assert(encounter1.comorbidityPoints(pair._1) == pair._2, s"Comorbidity points mismatch for ${pair._1}")
    }
  }

  test("Testing ED visit points for arbitrary record") {
    assert(encounter1.acuteAdmissionsPoints == 3)
  }

  test("Testing LACE Score computation for an arbitrary record for each measure") {
    for (pair <- measureAndLaceScorePairs) {
      assert(encounter1.laceScore(pair._1) == pair._2, s"LACE score mismatch for ${pair._1}")
    }
  }

}
