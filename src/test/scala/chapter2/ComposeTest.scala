package chapter2

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ComposeTest extends FunSuite {

  import Chapter2.compose

  test("compose test") {

  }

  val doubleFunc = new ((Int) => Int) {
    def apply(n: Int): Int = n * 2
  }

  val squareFunc = new ((Int) => Int) {
    def apply(n: Int): Int = n * n
  }

  def f(n: Int): Int = n * 2
  def g(n: Int): Int = n * n

  test("doubleFunc(5) == 10") {
    assert(doubleFunc(5) === 10)
  }

  test("squareFunc(3) == 9") {
    assert(squareFunc(3) === 9)
  }

  test("f(5) == 5 * 2 == 10") {
    assert(f(5) === 10)
  }

  test("g(3) == 3 * 3 == 9") {
    assert(g(3) === 9)
  }

  test("doubleFunc(squareFunc(5)) == 50") {
    assert(compose(doubleFunc, squareFunc)(5) === 50)
  }

  test("squareFunc(doubleFunc(5)) == 100") {
    assert(compose(squareFunc, doubleFunc)(5) === 100)
  }

  test("f(g(5)) == 50") {
    assert(compose(f, g)(5) === 50)
  }

  test("g(f(5)) == 100") {
    assert(compose(g, f)(5) === 100)
  }
}
