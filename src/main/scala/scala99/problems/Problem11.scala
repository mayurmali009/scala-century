package scala99.problems


// P11 (*) Modified run-length encoding.
//     Modify the result of problem P10 in such a way that if an element has no
//     duplicates it is simply copied into the result list.  Only elements with
//     duplicates are transferred as (N, E) terms.
//
//     Example:
//     scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

/**
  * Created by Mayur Mali on 01/04/18.
  */

object Problem11 {

  def pack[A](ls:List[A]): List[List[A]] = {

    if (ls.isEmpty) throw new UnsupportedOperationException("Given List is Empty")

    val (packed,next) = ls span(_ == ls.head)
    if (next == Nil) List(packed)
    else packed :: pack(next)
  }

  def encode[A](ls: List[A]) : List[(Int, A)] = {

    pack(ls) map { e => (e.length, e.head)}

  }

  def encodeModified[A](l: List[A]): List[Either[A,(Int, A)]] = {
    pack(l) map {
      e => e match {
        case e  if e.length == 1 => Left(e.head)
        case e => Right((e.length, e.head))
      }
    }
  }

  //Another way to get the result
  def encodeModified1[A](list: List[A]): List[Either[A, (Int, A)]] = {
    encode(list) map { t => if (t._1 == 1) Left(t._2) else Right(t) }
  }

  def main(args: Array[String]): Unit = {
    println("Modifying the encoded list approach 1 : " +encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

    println("Modifying the encoded list approach 2 : " +encodeModified1(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

    println("Packing the list of List : " +pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

  }

}
