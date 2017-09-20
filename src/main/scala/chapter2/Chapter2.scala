package chapter2

object Chapter2 {

  def fib(n: Int): Int = {
    @annotation.tailrec
    def fibIter(a: Int, b: Int, n: Int): Int = n match {
      case 0 => a
      case 1 => b
      case _ => fibIter(b, a + b, n - 1)
    }

    fibIter(0, 1, n)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = ???

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = ???

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = ???

  def compose[A, B, C](f: B => C, g: A => B): A => C = ???
}
