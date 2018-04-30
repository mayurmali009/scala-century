package scala99.problems

// P08 (**) Eliminate consecutive duplicates of list elements.
//     If a list contains repeated elements they should be replaced with a
//     single copy of the element.  The order of the elements should not be
//     changed.
//
//     Example:
//     scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

/**
  * Created by Mayur Mali on 16/03/18.
  */

object Problem8 {

  // Using Standard Recursive
  def compressRecursive[A](ls: List[A]): List[A] = ls match {

    case Nil => Nil
    case e :: tail => e :: compressRecursive(tail.dropWhile(_ == e))

  }

  // Using Tail Recursive
  def compressTailRecursive[A](ls: List[A]): List[A] = {
    def compressR(result: List[A], currentList: List[A]): List[A] = currentList match {

      case e :: tail => compressR(e :: result, tail.dropWhile(_ == e))
      case Nil => result.reverse
    }
    compressR(Nil, ls)
  }

  // Using Functional

  def compress[A](ls: List[A]) : List[A] = ls.foldRight(List[A]()) {

    case (element , result) if (result.isEmpty || result.head != element ) => element :: result
    case (element, result) => result
  }

  def main(args: Array[String]): Unit = {

    println("Eliminate consecutive duplicates using Recursive method :" +compressRecursive(List("a","a","b","b")))
    println("Eliminate consecutive duplicates using Tail Recursive method :" +compressTailRecursive(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
    println("Eliminate consecutive duplicates using FoldRight method :" +compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
  }

}