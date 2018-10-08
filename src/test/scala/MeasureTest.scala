
import org.scalatest._

class MeasureTest extends FunSuite  {

  test("Check set of all diagnosis codes") {
    val expectedSizeOfDiagnosticCodes = 77
    assert(Measure.allDiagnosisCodes.size == expectedSizeOfDiagnosticCodes,
      s"Set of all diagnostic codes not equal to ${expectedSizeOfDiagnosticCodes}")
  }

}
