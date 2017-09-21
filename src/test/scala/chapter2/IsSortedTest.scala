package chapter2

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class IsSortedTest extends FunSuite {

  import Chapter2.isSorted

  test("a < b") {
    val ordered = (a: Int, b: Int) => a < b
    assert(isSorted(Array(1, 2, 3, 4, 5), ordered) === true)
    assert(isSorted(Array(1, 2, 4, 3, 5), ordered) === false)
    assert(isSorted(Array(1, 4, 3, 2, 5), ordered) === false)
    assert(isSorted(Array(5, 2, 3, 4, 2), ordered) === false)
    assert(isSorted(Array(1, 1, 1, 1, 1), ordered) === false)
  }

  test("a <= b") {
    val ordered = (a: Int, b: Int) => a <= b
    assert(isSorted(Array(1, 2, 3, 4, 5), ordered) === true)
    assert(isSorted(Array(1, 2, 2, 3, 4), ordered) === true)
    assert(isSorted(Array(1, 1, 1, 1, 1), ordered) === true)
    assert(isSorted(Array(1, 2, 3, 4, 1), ordered) === false)
  }

  test("a > b") {
    val ordered = (a: Int, b: Int) => a > b
    assert(isSorted(Array(1, 2, 3, 4, 5), ordered) === false)
    assert(isSorted(Array(5, 4, 3, 2, 1), ordered) === true)
    assert(isSorted(Array(1, 1, 1, 1, 1), ordered) === false)
    assert(isSorted(Array(5, 4, 3, 2, 3), ordered) === false)
  }
}
