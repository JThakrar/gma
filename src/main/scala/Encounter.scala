
/**
  * Represents an encounter record. Note that ideally would have
  * liked to retain the morbidity field names the same as in the
  * input data, but due to special characters, had to do some rework.
  * Additionally, converted to Java/Scala-esq camelCase convention.
  *
  * Based on the current data, the Encounter record is organized
  * such that the first 9 fields are non-morbidity and the remaining
  * 73 are all morbidity fields.
  * Additions of new morbidity/non-morbidity fields should adhere
  * to the same convention - i.e. all non-morbidity columns
  * before the morbidity columns.
  * @param encounterId
  * @param patientNbr
  * @param race
  * @param gender
  * @param age
  * @param lengthOfStay
  * @param edVisits
  * @param inpatientVisits
  * @param diagnosisCode
  * @param historyOfPtca
  * @param historyOfCabg
  * @param congestiveHeartFailure
  * @param acuteCoronarySyndrome
  * @param anteriorMyocardialInfarction
  * @param otherLocationOfMyocardialInfarction
  * @param anginaPectorisOldMyocardialInfarction
  * @param coronaryAtherosclerosis
  * @param valvulArorrheumaticHeartDisease
  * @param specifiedArrhythmias
  * @param historyOfInfection
  * @param metaStaticCancerOrAcuteLeukemia
  * @param cancer
  * @param diabetesMellitusOrDmComplications
  * @param proteinCalorieMalnutrition
  * @param disordersOfFluidElectrolyteAcidBase
  * @param ironDeficiencyOrOtherAnemiasAndBloodDisease
  * @param dementiaOrOtherSpecifiedBrainDisorders
  * @param hemiPlegiaParaplegiaParalysisFunctionalDisability
  * @param stroke
  * @param CerebroVascularDisease
  * @param vascularOrCirculatoryDisease
  * @param chronicObstructivePulmonaryDisease
  * @param asthma
  * @param pneumonia
  * @param endStageRenalDiseaseOrDialysis
  * @param renalFailure
  * @param otherUrinaryTractDisorders
  * @param decubitusUlcerOrChronicSkinUlcer
  * @param lungUpperDigestiveTractandOtherSevereCancers
  * @param lymphaticHeadAndNeckBrainAndOtherMajorCancersBreastColorectalAndOtherCancersAndTumorsOtherRespiratoryAndHeartNeoplasms
  * @param otherDigestiveAndUrinaryNeoplasms
  * @param OtherEndocrineMetabolicNutritionalDisorders
  * @param pancreaticDisease
  * @param pepticUlcerHemorrhageOtherSpecifiedGastroIntestinalDisorders
  * @param otherGastroIntestinalDisorders
  * @param severeHematologicalDisorders
  * @param drugAlcoholInducedDependencePsychosis
  * @param majorPsychiatricDisorders
  * @param depression
  * @param anxietyDisorders
  * @param otherPsychiatricDisorders
  * @param quadriplegiaParaplegiaParalysisFunctionalDisability
  * @param polyneuropathy
  * @param hypertensiveHeartAndRenalDiseaseOrEncephalopathy
  * @param cellulitisLocalSkinInfection
  * @param vertebralFractures
  * @param liverAndBiliaryDisease
  * @param fibrosisOfLungAndOtherChronicLungDisorders
  * @param nephritis
  * @param endstageLiverDisease
  * @param seizureDisordersAndConvulsions
  * @param chronicHeartFailure
  * @param coronaryAtherosclerosisOrAnginaCerebrovascularDisease
  * @param dialysisStatus
  * @param septicemiaShock
  * @param cardioRespiratoryFailureOrCardioRespiratoryShock
  * @param rheumatoidArthritisAndInflammatoryConnectiveTissueDisease
  * @param respiratorDependenceTracheostomyStatus
  * @param transplants
  * @param coagulationDefectsAndOtherSpecifiedHematologicalDisorders
  * @param hipFractureDislocation
  * @param pleuralEffusionPneumothorax
  * @param urinaryTractInfection
  * @param otherInjuries
  * @param skeletalDeformities
  * @param postTraumaticOsteoArthritis
  * @param morbidObesity
  * @param hypertension
  * @param majorSymptomsAbnormalities
  * @param historyOfMechanicalVentilation
  * @param sleepApnea
  * @param otherAndUnspecifiedHeartDisease
  */
case class Encounter(
                      encounterId: Long,
                      patientNbr: Long,
                      race: String,
                      gender: String,
                      age: Int,
                      lengthOfStay: Int,
                      edVisits: Int,
                      inpatientVisits: Int,
                      diagnosisCode: String,
                      historyOfPtca: Int,
                      historyOfCabg: Int,
                      congestiveHeartFailure: Int,
                      acuteCoronarySyndrome: Int,
                      anteriorMyocardialInfarction: Int,
                      otherLocationOfMyocardialInfarction: Int,
                      anginaPectorisOldMyocardialInfarction: Int,
                      coronaryAtherosclerosis: Int,
                      valvulArorrheumaticHeartDisease: Int,
                      specifiedArrhythmias: Int,
                      historyOfInfection: Int,
                      metaStaticCancerOrAcuteLeukemia: Int,
                      cancer: Int,
                      diabetesMellitusOrDmComplications: Int,
                      proteinCalorieMalnutrition: Int,
                      disordersOfFluidElectrolyteAcidBase: Int,
                      ironDeficiencyOrOtherAnemiasAndBloodDisease: Int,
                      dementiaOrOtherSpecifiedBrainDisorders: Int,
                      hemiPlegiaParaplegiaParalysisFunctionalDisability: Int,
                      stroke: Int,
                      CerebroVascularDisease: Int,
                      vascularOrCirculatoryDisease: Int,
                      chronicObstructivePulmonaryDisease: Int,
                      asthma: Int,
                      pneumonia: Int,
                      endStageRenalDiseaseOrDialysis: Int,
                      renalFailure: Int,
                      otherUrinaryTractDisorders: Int,
                      decubitusUlcerOrChronicSkinUlcer: Int,
                      lungUpperDigestiveTractandOtherSevereCancers: Int,
                      lymphaticHeadAndNeckBrainAndOtherMajorCancersBreastColorectalAndOtherCancersAndTumorsOtherRespiratoryAndHeartNeoplasms: Int,
                      otherDigestiveAndUrinaryNeoplasms: Int,
                      OtherEndocrineMetabolicNutritionalDisorders: Int,
                      pancreaticDisease: Int,
                      pepticUlcerHemorrhageOtherSpecifiedGastroIntestinalDisorders: Int,
                      otherGastroIntestinalDisorders: Int,
                      severeHematologicalDisorders: Int,
                      drugAlcoholInducedDependencePsychosis: Int,
                      majorPsychiatricDisorders: Int,
                      depression: Int,
                      anxietyDisorders: Int,
                      otherPsychiatricDisorders: Int,
                      quadriplegiaParaplegiaParalysisFunctionalDisability: Int,
                      polyneuropathy: Int,
                      hypertensiveHeartAndRenalDiseaseOrEncephalopathy: Int,
                      cellulitisLocalSkinInfection: Int,
                      vertebralFractures: Int,
                      liverAndBiliaryDisease: Int,
                      fibrosisOfLungAndOtherChronicLungDisorders: Int,
                      nephritis: Int,
                      endstageLiverDisease: Int,
                      seizureDisordersAndConvulsions: Int,
                      chronicHeartFailure: Int,
                      coronaryAtherosclerosisOrAnginaCerebrovascularDisease: Int,
                      dialysisStatus: Int,
                      septicemiaShock: Int,
                      cardioRespiratoryFailureOrCardioRespiratoryShock: Int,
                      rheumatoidArthritisAndInflammatoryConnectiveTissueDisease: Int,
                      respiratorDependenceTracheostomyStatus: Int,
                      transplants: Int,
                      coagulationDefectsAndOtherSpecifiedHematologicalDisorders: Int,
                      hipFractureDislocation: Int,
                      pleuralEffusionPneumothorax: Int,
                      urinaryTractInfection: Int,
                      otherInjuries: Int,
                      skeletalDeformities: Int,
                      postTraumaticOsteoArthritis: Int,
                      morbidObesity: Int,
                      hypertension: Int,
                      majorSymptomsAbnormalities: Int,
                      historyOfMechanicalVentilation: Int,
                      sleepApnea: Int,
                      otherAndUnspecifiedHeartDisease: Int
                    ) {

  /**
    * Calculates points for length of stay.
    * @return
    */
  def lengthOfStayPoints: Int = {
    if (lengthOfStay < 0)
      return 0
    else {

    }
    return lengthOfStay match {
      case 0 => 0
      case 1 => 1
      case 2 => 2
      case 3 => 3
      case 4 | 5 | 6 => 4
      case 7 | 8 | 9 | 10 | 11 | 12 | 13 => 5
      case _ => 7
    }
  }

  /**
    * If any inpatient_visits (i.e. value > 0), then 3 points else 0
    * @return
    */
  def acuteAdmissionsPoints: Int = {
    if (inpatientVisits > 0) 3 else 0
  }

  /**
    * Add up the yes/no (i.e 1/0) columns corresponding to the
    * morbidity columns for a given measure
    * @param measure
    * @return
    */
  def comorbidityPoints(measure: String): Int = {
    val morbidities = Measure.comorbidity(measure)
    morbidities.
      map(m => this.productElement(m.id).toString.toInt).
      reduce(_ + _)
  }

  /**
    * Hopefully should be a simple translation/logic
    * @return
    */
  def edVisitPoints: Int = {
    if (edVisits < 0) {
      return 0
    }
    return edVisits match {
      case 0 => 0
      case 1 => 1
      case 2 => 2
      case 3 => 3
      case _ => 4
    }
  }

  /**
    * LACE score for the encounter row
    * @param measure
    * @return
    */
  def laceScore(measure: String): Int = {
    lengthOfStayPoints + acuteAdmissionsPoints + comorbidityPoints(measure) + edVisitPoints
  }

  /**
    * Checks if the encounter matches any of the diagnosis codes for a given measure
    * @param measure
    * @return
    */
  def diagnosisCodeMatchesMeasure(measure: String): Boolean = {
    val diagnosisCodes4Measure = Measure.diagnosisCodes(measure)
    diagnosisCodes4Measure.contains(this.diagnosisCode)
  }

}

/**
  * Helper object for Encounter class
  */
object Encounter {

  val NON_MORBIDITY_ATTRIBUTE_COUNT = 9
  val MORBIDITY_ATTRIBUTE_COUNT = 73
  val TOTAL_ATTRIBUTES = MORBIDITY_ATTRIBUTE_COUNT + NON_MORBIDITY_ATTRIBUTE_COUNT

  private def yesNoToInt(yesNo: String): Int = {
    val s = yesNo.toLowerCase()
    if (s == "yes") 1 else 0
  }

  /**
    * Currently only a simple sanitization rule.
    * If the string is empty then substitute with "0"
    * @param s
    * @return
    */
  def sanitizeString(s: String): String = {
    if (s.isEmpty) {
      "0"
    } else {
      s
    }
  }

  /**
    * Given a csv line (string), split into fields to construct an encounter object.
    * Yeah, yeah, a lot of mundane typing :)
    * @param line
    * @return
    */
  def apply(line: String): Encounter = {

    // Basic data sanitization - pad with missing columns
    val fieldsRaw = line.split(", *")
    val missingFieldCount = TOTAL_ATTRIBUTES - fieldsRaw.length
    val fields = fieldsRaw ++ (0 until missingFieldCount).map(i => "")

    new Encounter(
      sanitizeString(fields(0)).toLong, // encounterId: Long,
      sanitizeString(fields(1)).toLong, // patientNbr: Long,
      fields(2), // race: String,
      fields(3), // gender: String,
      sanitizeString(fields(4)).toInt, // age: Int,
      sanitizeString(fields(5)).toInt, // lengthOfStay: Int,
      sanitizeString(fields(6)).toInt, // edVisits: Int,
      sanitizeString(fields(7)).toInt, // inpatientVisits: Int,
      fields(8), // diagnosisCode: String,
      yesNoToInt(fields(9)), // historyOfPtca: Int,
      yesNoToInt(fields(10)), // historyOfCabg: Int,
      yesNoToInt(fields(11)), // congestiveHeartFailure: Int,
      yesNoToInt(fields(12)), // acuteCoronarySyndrome: Int,
      yesNoToInt(fields(13)), // anteriorMyocardialInfarction: Int,
      yesNoToInt(fields(14)), // otherLocationOfMyocardialInfarction: Int,
      yesNoToInt(fields(15)), // anginaPectorisOldMyocardialInfarction: Int,
      yesNoToInt(fields(16)), // coronaryAtherosclerosis: Int,
      yesNoToInt(fields(17)), // valvulArorrheumaticHeartDisease: Int,
      yesNoToInt(fields(18)), // specifiedArrhythmias: Int,
      yesNoToInt(fields(19)), // historyOfInfection: Int,
      yesNoToInt(fields(20)), // metaStaticCancerOrAcuteLeukemia: Int,
      yesNoToInt(fields(21)), // cancer: Int,
      yesNoToInt(fields(22)), // diabetesMellitusOrDmComplications: Int,
      yesNoToInt(fields(23)), // proteinCalorieMalnutrition: Int,
      yesNoToInt(fields(24)), // disordersOfFluidElectrolyteAcidBase: Int,
      yesNoToInt(fields(25)), // ironDeficiencyOrOtherAnemiasAndBloodDisease: Int,
      yesNoToInt(fields(26)), // dementiaOrOtherSpecifiedBrainDisorders: Int,
      yesNoToInt(fields(27)), // hemiPlegiaParaplegiaParalysisFunctionalDisability: Int,
      yesNoToInt(fields(28)), // stroke: Int,
      yesNoToInt(fields(29)), // CerebroVascularDisease: Int,
      yesNoToInt(fields(30)), // vascularOrCirculatoryDisease: Int,
      yesNoToInt(fields(31)), // chronicObstructivePulmonaryDisease: Int,
      yesNoToInt(fields(32)), // asthma: Int,
      yesNoToInt(fields(33)), // pneumonia: Int,
      yesNoToInt(fields(34)), // endStageRenalDiseaseOrDialysis: Int,
      yesNoToInt(fields(35)), // renalFailure: Int,
      yesNoToInt(fields(36)), // otherUrinaryTractDisorders: Int,
      yesNoToInt(fields(37)), // decubitusUlcerOrChronicSkinUlcer: Int,
      yesNoToInt(fields(38)), // lungUpperDigestiveTractandOtherSevereCancers: Int,
      yesNoToInt(fields(39)), // lymphaticHeadAndNeckBrainAndOtherMajorCancersBreastColorectalAndOtherCancersAndTumorsOtherRespiratoryAndHeartNeoplasms: Int,
      yesNoToInt(fields(40)), // otherDigestiveAndUrinaryNeoplasms: Int,
      yesNoToInt(fields(41)), // OtherEndocrineMetabolicNutritionalDisorders: Int,
      yesNoToInt(fields(42)), // pancreaticDisease: Int,
      yesNoToInt(fields(43)), // pepticUlcerHemorrhageOtherSpecifiedGastroIntestinalDisorders: Int,
      yesNoToInt(fields(44)), // otherGastroIntestinalDisorders: Int,
      yesNoToInt(fields(45)), // severeHematologicalDisorders: Int,
      yesNoToInt(fields(46)), // drugAlcoholInducedDependencePsychosis: Int,
      yesNoToInt(fields(47)), // majorPsychiatricDisorders: Int,
      yesNoToInt(fields(48)), // depression: Int,
      yesNoToInt(fields(49)), // anxietyDisorders: Int,
      yesNoToInt(fields(50)), // otherPsychiatricDisorders: Int,
      yesNoToInt(fields(51)), // quadriplegiaParaplegiaParalysisFunctionalDisability: Int,
      yesNoToInt(fields(52)), // polyneuropathy: Int,
      yesNoToInt(fields(53)), // hypertensiveHeartAndRenalDiseaseOrEncephalopathy: Int,
      yesNoToInt(fields(54)), // cellulitisLocalSkinInfection: Int,
      yesNoToInt(fields(55)), // vertebralFractures: Int,
      yesNoToInt(fields(56)), // liverAndBiliaryDisease: Int,
      yesNoToInt(fields(57)), // fibrosisOfLungAndOtherChronicLungDisorders: Int,
      yesNoToInt(fields(58)), // nephritis: Int,
      yesNoToInt(fields(59)), // endstageLiverDisease: Int,
      yesNoToInt(fields(60)), // seizureDisordersAndConvulsions: Int,
      yesNoToInt(fields(61)), // chronicHeartFailure: Int,
      yesNoToInt(fields(62)), // coronaryAtherosclerosisOrAnginaCerebrovascularDisease: Int,
      yesNoToInt(fields(63)), // dialysisStatus: Int,
      yesNoToInt(fields(64)), // septicemiaShock: Int,
      yesNoToInt(fields(65)), // cardioRespiratoryFailureOrCardioRespiratoryShock: Int,
      yesNoToInt(fields(66)), // rheumatoidArthritisAndInflammatoryConnectiveTissueDisease: Int,
      yesNoToInt(fields(67)), // respiratorDependenceTracheostomyStatus: Int,
      yesNoToInt(fields(68)), // transplants: Int,
      yesNoToInt(fields(69)), // coagulationDefectsAndOtherSpecifiedHematologicalDisorders: Int,
      yesNoToInt(fields(70)), // hipFractureDislocation: Int,
      yesNoToInt(fields(71)), // pleuralEffusionPneumothorax: Int,
      yesNoToInt(fields(72)), // urinaryTractInfection: Int,
      yesNoToInt(fields(73)), // otherInjuries: Int,
      yesNoToInt(fields(74)), // skeletalDeformities: Int,
      yesNoToInt(fields(75)), // postTraumaticOsteoArthritis: Int,
      yesNoToInt(fields(76)), // morbidObesity: Int,
      yesNoToInt(fields(77)), // hypertension: Int,
      yesNoToInt(fields(78)), // majorSymptomsAbnormalities: Int,
      yesNoToInt(fields(79)), // historyOfMechanicalVentilation: Int,
      yesNoToInt(fields(80)), // sleepApnea: Int,
      yesNoToInt(fields(81)) // otherAndUnspecifiedHeartDisease: Int
    )

  }
}