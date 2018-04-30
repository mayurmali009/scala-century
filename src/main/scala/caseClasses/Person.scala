package caseClasses


case class Person(firstName: String, lastName: String, birthYear: Int)

object Person {

  val p = Person("Mayur", "Mali", 1990)

  val lastName = p.lastName

  val p_1 = Person("Brown", "John", 1969)
  val p_2 = Person("Mayur", "Mali", 1990)

  val p_3 = p.copy(firstName = "Shubham", birthYear = 1993)


  def main(args: Array[String]): Unit = {
    println(p)

    println(p_3)

  }
}