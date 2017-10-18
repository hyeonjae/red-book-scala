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

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if (!ordered(as(n), as(n + 1))) false
      else loop(n + 1)
    }

    loop(0)
  }

  def isSorted2[A](xs: List[A], ordered: (A, A) => Boolean): Boolean = xs match {
    case x :: Nil => true
    case x :: rest => ordered(x, rest.head) && isSorted2(rest, ordered)
  }

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = (b: B) => f(a, b)

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = (a: A) => (b: B) => f(a, b)

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)

  def compose[A, B, C](f: B => C, g: A => B): A => C = (a: A) => f(g(a))

  def andThen[A, B, C](f: A => B, g: B => C): A => C = (a: A) => g(f(a))

}
