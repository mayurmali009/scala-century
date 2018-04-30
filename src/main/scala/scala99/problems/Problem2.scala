package scala99.problems

/**
  * Created by prashant on 13/03/18.
  */
object Problem2 {

  def findSecondLastElementOfList(list: List[Int]): Int ={
    list match {
      case x :: y :: Nil => x;
      case x :: xs =>  findSecondLastElementOfList(xs)
      case _ => throw new UnsupportedOperationException("List with less than two element")
    }
  }

  def main(args: Array[String]): Unit = {
    println("Second Last Element: " + findSecondLastElementOfList(List(1,3,4,5,6)));
  }

}
