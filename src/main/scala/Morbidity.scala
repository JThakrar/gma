
/**
  * As discussed in {@link Encounter} class, the morbidity attribute names in
  * an encounter record are different from the headers in the sample data.
  *
  * This class helps map the external/sample data field names to internal
  * field names (camelCase). And equally (or more) importantly, provides the
  * ordinal/sequence of a field in the Encounter record.
  *
  * @param id
  * @param externalLabel
  * @param internalLabel
  */
case class Morbidity(id: Int, externalLabel: String, internalLabel: String) {

}

/**
  * Helper object that provides a sequence of {@link Morbidity} class instances.
  * Note that the ordering is important and should be the same as the occurring
  * of those fields in the {@link Encounter} class.
  */
object Morbidity {


  val morbidities:Seq[Morbidity] = {
    Seq(
      ("HistoryofPTCA", "historyOfPtca"),
      ("HistoryofCABG", "historyOfCabg"),
      ("Congestiveheartfailure", "congestiveHeartFailure"),
      ("Acutecoronarysyndrome", "acuteCoronarySyndrome"),
      ("Anteriormyocardialinfarction", "anteriorMyocardialInfarction"),
      ("Otherlocationofmyocardialinfarction", "otherLocationOfMyocardialInfarction"),
      ("Anginapectorisoldmyocardialinfarction", "anginaPectorisOldMyocardialInfarction"),
      ("Coronaryatherosclerosis", "coronaryAtherosclerosis"),
      ("Valvularorrheumaticheartdisease", "valvulArorrheumaticHeartDisease"),
      ("Specifiedarrhythmias", "specifiedArrhythmias"),
      ("Historyofinfection", "historyOfInfection"),
      ("Metastaticcanceroracuteleukemia", "metaStaticCancerOrAcuteLeukemia"),
      ("Cancer", "cancer"),
      ("Diabetesmellitus(DM)orDMcomplications", "diabetesMellitusOrDmComplications"),
      ("Protein-caloriemalnutrition", "proteinCalorieMalnutrition"),
      ("Disordersoffluidelectrolyteacid-base", "disordersOfFluidElectrolyteAcidBase"),
      ("Irondeficiencyorotheranemiasandblooddisease", "ironDeficiencyOrOtherAnemiasAndBloodDisease"),
      ("Dementiaorotherspecifiedbraindisorders", "dementiaOrOtherSpecifiedBrainDisorders"),
      ("Hemiplegiaparaplegiaparalysisfunctionaldisability", "hemiPlegiaParaplegiaParalysisFunctionalDisability"),
      ("Stroke", "stroke"),
      ("Cerebrovasculardisease", "CerebroVascularDisease"),
      ("Vascularorcirculatorydisease", "vascularOrCirculatoryDisease"),
      ("Chronicobstructivepulmonarydisease", "chronicObstructivePulmonaryDisease"),
      ("Asthma", "asthma"),
      ("Pneumonia", "pneumonia"),
      ("End-stagerenaldiseaseordialysis", "endStageRenalDiseaseOrDialysis"),
      ("Renalfailure", "renalFailure"),
      ("Otherurinarytractdisorders", "otherUrinaryTractDisorders"),
      ("Decubitusulcerorchronicskinulcer", "decubitusUlcerOrChronicSkinUlcer"),
      ("LungUpperDigestiveTractandOtherSevereCancers", "lungUpperDigestiveTractandOtherSevereCancers"),
      ("LymphaticHeadandNeckBrainandOtherMajorCancers;BreastColorectalandotherCancersandTumors;OtherRespiratoryandHeartNeoplasms", "lymphaticHeadAndNeckBrainAndOtherMajorCancersBreastColorectalAndOtherCancersAndTumorsOtherRespiratoryAndHeartNeoplasms"),
      ("OtherDigestiveandUrinaryNeoplasms", "otherDigestiveAndUrinaryNeoplasms"),
      ("OtherEndocrine/Metabolic/NutritionalDisorders", "OtherEndocrineMetabolicNutritionalDisorders"),
      ("PancreaticDisease", "pancreaticDisease"),
      ("PepticUlcerHemorrhageOtherSpecifiedGastrointestinalDisorders", "pepticUlcerHemorrhageOtherSpecifiedGastroIntestinalDisorders"),
      ("OtherGastrointestinalDisorders", "otherGastroIntestinalDisorders"),
      ("SevereHematologicalDisorders", "severeHematologicalDisorders"),
      ("Drug/AlcoholInducedDependence/Psychosis", "drugAlcoholInducedDependencePsychosis"),
      ("MajorPsychiatricDisorders", "majorPsychiatricDisorders"),
      ("Depression", "depression"),
      ("AnxietyDisorders", "anxietyDisorders"),
      ("OtherPsychiatricDisorders", "otherPsychiatricDisorders"),
      ("QuadriplegiaParaplegiaParalysisFunctionalDisability", "quadriplegiaParaplegiaParalysisFunctionalDisability"),
      ("Polyneuropathy", "polyneuropathy"),
      ("HypertensiveHeartandRenalDiseaseorEncephalopathy", "hypertensiveHeartAndRenalDiseaseOrEncephalopathy"),
      ("CellulitisLocalSkinInfection", "cellulitisLocalSkinInfection"),
      ("VertebralFractures", "vertebralFractures"),
      ("Liverandbiliarydisease", "liverAndBiliaryDisease"),
      ("Fibrosisoflungandotherchroniclungdisorders", "fibrosisOfLungAndOtherChronicLungDisorders"),
      ("Nephritis", "nephritis"),
      ("End-stageliverdisease", "endstageLiverDisease"),
      ("Seizuredisordersandconvulsions", "seizureDisordersAndConvulsions"),
      ("Chronicheartfailure", "chronicHeartFailure"),
      ("Coronaryatherosclerosisoranginacerebrovasculardisease", "coronaryAtherosclerosisOrAnginaCerebrovascularDisease"),
      ("Dialysisstatus", "dialysisStatus"),
      ("Septicemia/shock", "septicemiaShock"),
      ("Cardio-respiratoryfailureorcardio-respiratoryshock", "cardioRespiratoryFailureOrCardioRespiratoryShock"),
      ("Rheumatoidarthritisandinflammatoryconnectivetissuedisease", "rheumatoidArthritisAndInflammatoryConnectiveTissueDisease"),
      ("Respiratordependence/tracheostomystatus", "respiratorDependenceTracheostomyStatus"),
      ("Transplants", "transplants"),
      ("Coagulationdefectsandotherspecifiedhematologicaldisorders", "coagulationDefectsAndOtherSpecifiedHematologicalDisorders"),
      ("Hipfracture/dislocation", "hipFractureDislocation"),
      ("Pleuraleffusion/pneumothorax", "pleuralEffusionPneumothorax"),
      ("Urinarytractinfection", "urinaryTractInfection"),
      ("Otherinjuries", "otherInjuries"),
      ("Skeletaldeformities", "skeletalDeformities"),
      ("Posttraumaticosteoarthritis", "postTraumaticOsteoArthritis"),
      ("Morbidobesity", "morbidObesity"),
      ("Hypertension", "hypertension"),
      ("Majorsymptomsabnormalities", "majorSymptomsAbnormalities"),
      ("HistoryofMechanicalVentilation", "historyOfMechanicalVentilation"),
      ("SleepApnea", "sleepApnea"),
      ("OtherandUnspecifiedHeartDisease", "otherAndUnspecifiedHeartDisease")
    ).zipWithIndex.
      map(l =>
        Morbidity(Encounter.NON_MORBIDITY_ATTRIBUTE_COUNT + l._2, // offset the zip index with the number of non-morbidity attribute count
          l._1._1,
          l._1._2))
  }

}
