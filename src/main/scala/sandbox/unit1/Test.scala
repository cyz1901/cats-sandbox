package sandbox.unit1


object Test {
  def main(args: Array[String]): Unit = {

    // 1.3
    //    val cat = Cat("catname", 10, "blue")
    //    import PrintableInstances._
    //    Printable.print(cat)

    // 1.4
    //    import cats.Show
    //    import cats.instances.int._ // for Show
    //    import cats.instances.string._ // for Show
    //    import cats.syntax.show._ // for show
    //
    //    val cat = Cat("catname", 10, "blue")
    //    implicit val catShow: Show[Cat] = Show.show[Cat] { cat =>
    //      val name = cat.name.show
    //      val age = cat.age.show
    //      val color = cat.color.show
    //      s"$name is a $age year-old $color cat."
    //    }
    //    println(cat.show)

    //1.5
//    import cats.Eq
    //    import cats.implicits.{catsKernelStdOrderForInt, catsKernelStdOrderForString, catsSyntaxEq}
    //
    //    implicit val catEq: Eq[Cat] = Eq.instance[Cat](f = (c1, c2) => {
    //      (c1.name === c2.name) && (c1.age === c2.age) && (c1.color === c2.color)
    //    })
    //
    //    val cat1 = Cat("Garfield",   38, "orange and black")
    //    val cat2 = Cat("Heathcliff", 33, "orange and black")
    //    println(cat1 === cat2)
    //
    //    import cats.instances.option._ // for Eq
    //
    //    val optionCat1 = Option(cat1)
    //    // optionCat1: Option[Cat] = Some(Cat("Garfield", 38, "orange and black"))
    //    val optionCat2 = Option.empty[Cat]
    //    // optionCat2: Option[Cat] = None
    //
    //    optionCat1 === optionCat2
    //    // res17: Boolean = false
    //    optionCat1 =!= optionCat2
  }
}
