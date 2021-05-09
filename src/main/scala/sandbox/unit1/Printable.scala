package sandbox.unit1

trait Printable[A] {
  def format(value: A): String
}


object PrintableInstances {
  implicit val stringFormat: Printable[String] = new Printable[String] {
    override def format(value: String): String = {
      value
    }

  }

  implicit val intFormat: Printable[Int] = new Printable[Int] {
    override def format(value: Int): String = {
      value.toString
    }
  }

  implicit val catPrintable = new Printable[Cat] {
    def format(cat: Cat) = {
      val name = Printable.format(cat.name)
      val age = Printable.format(cat.age)
      val color = Printable.format(cat.color)
      s"$name is a $age year-old $color cat."
    }

  }

}


object Printable {
  def format[A](input: A)(implicit p: Printable[A]): String =
    p.format(input)

  def print[A](input: A)(implicit p: Printable[A]): Unit =
    println(format(input))
}

//test
final case class Cat(name: String, age: Int, color: String) {

}
