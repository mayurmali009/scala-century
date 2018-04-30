package scala99.problems

/**
  * Created by Mayur Mali on 13/03/18.
  */

/* P05 (*) Reverse a list.
   Example:
   scala> reverse(List(1, 1, 2, 3, 5, 8))
   res0: List[Int] = List(8, 5, 3, 2, 1, 1)*/

object Problem5 {

  def reverseBuiltin[A](ls: List[A]): List[A] = ls.reverse

  def reverseRecursive[A](ls: List[A]): List[A] = ls match {

    case Nil => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }

  def reverseTailRecursive[A](ls: List[A]) : List[A] = {
    def reverseTail[A](result: List[A], currentList: List[A]) : List[A] = currentList match  {

      case Nil => result
      case h :: tail => reverseTail(h :: result, tail)
    }
  reverseTail(Nil, ls)

  }

  def reverseFunctional[A](ls: List[A]): List[A] = {
    ls.foldLeft(List[A]()) { (r, h) => h :: r }

  }
      def main(args: Array[String]): Unit = {

        println("Reversing the List using BuiltIn : " +reverseBuiltin(List(0,1,2,3,4,5,6,7,8,9)))
        println("Reversing the List using Simple Recursive : " +reverseRecursive(List(0,1,2,3,4,5,6,7,8,9)))
        println("Reversing the List using Tail Recursive : " +reverseRecursive(List(0,1,2,3,4,5,6)))
        println("Reversing the List using FoldLeft Function : " +reverseFunctional(List(0,1,2,3,4,5,6,7,8,9)))

      }

  }
