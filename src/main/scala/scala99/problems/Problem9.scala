package scala99.problems
// P09 (**) Pack consecutive duplicates of list elements into sublists.
//     If a list contains repeated elements they should be placed in separate
//     sublists.
//
//     Example:
//     scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

/**
  * Created by Mayur Mali on 16/03/18.
  */

object Problem9 {

  def pack[A](ls: List[A]): List[List[A]] = {

    if (ls.isEmpty) throw new UnsupportedOperationException("Given List is Empty")
    else {
      //In other words, span() selects the elements of the list (preserving order) that satisfy a given function until it finds an element for which the function returns false
      val (packed, next) = ls span{ _ == ls.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }

  def main(args: Array[String]): Unit = {
    println("Pack the given list with list of lists: " +pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    //println("Empty List" +pack(List()))

  }
}
