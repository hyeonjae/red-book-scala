package chapter2

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Chapter2Test extends FunSuite {

  import Chapter2.fib

  test("fib(0) should be 0") {
    assert(fib(0) === 0)
  }

  test("fib(1) should be 1") {
    assert(fib(1) === 1)
  }

  test("fib(2) should be 1") {
    assert(fib(2) === 1)
  }

  test("fib(3) should be 2") {
    assert(fib(3) === 2)
  }

  test("fib(4) should be 3") {
    assert(fib(4) === 3)
  }

  test("fib(5) should be 5") {
    assert(fib(5) === 5)
  }

  test("fib(6) should be 8") {
    assert(fib(6) === 8)
  }

  test("fib(10) should be 55") {
    assert(fib(10) === 55)
  }

  test("fib(11) should be 89") {
    assert(fib(11) === 89)
  }

  test("fib(22) should be 144") {
    assert(fib(12) === 144)
  }

  test("fib(13) should be 233") {
    assert(fib(13) === 233)
  }

  test("fib(20) should be 6765") {
    assert(fib(20) === 6765)
  }

}
