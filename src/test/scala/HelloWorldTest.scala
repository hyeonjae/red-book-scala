import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloWorldTest extends FunSuite {
  test("trivial fact") {
    assert(1 === 1)
  }
}
