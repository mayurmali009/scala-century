package scala99.problems

/**
  * Created by prashant on 6/12/17.
  */
object Problem1 {

  def findLastElementOfList(list: List[Int]): Int ={
        list match {
          case head :: Nil => head;
          case head :: tail => findLastElementOfList(tail)
          case Nil => throw new NoSuchElementException("empty list")
        }
  }

  def main(args: Array[String]): Unit = {
      println("Last Element: " + findLastElementOfList(List(1,2,3,4,5,6)));
  }


}
