package scala99.problems

/* P04 (*) Find the number of elements of a list.
    Example:
    scala> length(List(1, 1, 2, 3, 5, 8))
    res0: Int = 6*/

/**
  * Created by Mayur Mali on 15/03/18.
  */

object Problem4 {

  // Finding Length of a List using Built In Functions
  def findLengthBuiltIn[A] (ls: List[A]) : Int =  ls.length

  // Finding Length of a List using Simple Recursive method
  def findLengthRecursive[A] (ls: List[A]) : Int = ls match {

    case Nil => 0
    case _ :: tail => 1 + findLengthRecursive(tail)
    case _ => throw new UnsupportedOperationException("empty List")
  }

  // Finding Length of a List using Tail Recursive method
  def findLengthTailRecursive[A] (ls: List[A]) : Int = {
      def lengthR[A](result: Int, currentList: List[A]): Int = currentList match {

        case Nil => result
        case _ :: tail => lengthR(result + 1, tail)
      }
    lengthR(0,ls)
  }

  def main(args: Array[String]): Unit = {

    println("Length of the List Is: " + findLengthRecursive(List(2,3,1,3,5,6,7)))
    println("Length of the List with Tail Is: " + findLengthTailRecursive(List(-2,-3,1,3,5,6,7)))

  }

}
