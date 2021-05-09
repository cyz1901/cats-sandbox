package sandbox.unit2

// 2.3
trait Semigroup[A] {
  def combine(x: A, y: A): A
}

trait Monoid[A] extends Semigroup[A] {
  def empty: A
}

object Monoid {
  def apply[A](implicit monoid: Monoid[A]) =
    monoid
}


object Test {
  def main(args: Array[String]): Unit = {
    println(false && true)
  }
}
