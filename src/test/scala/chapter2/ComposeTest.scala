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

  test("1") {
    assert(doubleFunc(5) === 10)
    assert(squareFunc(3) === 9)
  }

  test("2") {
    assert(f(5) === 10)
    assert(g(3) === 9)
  }

  test("3") {
    assert(compose(f, g)(5) === 50)
    assert(compose(g, f)(5) === 100)
  }
}
