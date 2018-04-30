package scala99.problems

/**
  * Created by Mayur Mali on 16/03/18.
  */

object Problem7 {

  /*P07 (**) Flatten a nested list structure.
    Example:
    scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    res0: List[Any] = List(1, 1, 2, 3, 5, 8) */

  //if the element is a list, call the function recursively, otherwise return a list containing that element.

  def makeListFlatten(list: List[Any]): List[Any] = list flatMap  {

    case Nil => throw new UnsupportedOperationException("Given List is Empty")
    case ls : List[_] => makeListFlatten(ls)
    case element => List(element)
  }

  def main(args: Array[String]): Unit = {
    println("Flatten The Given List : " +makeListFlatten(List(List(1, 1), 2, List(3, List(5, 8)))))
    //println("List Is Empty Then Throw Exception  : " +makeListFlatten(List(List())))

  }

}
