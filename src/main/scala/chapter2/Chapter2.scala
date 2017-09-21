package chapter2

object Chapter2 {

  def fib(n: Int): Int = ???

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = ???

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = ???

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = ???

  def compose[A, B, C](f: B => C, g: A => B): A => C = ???
}
