package scala99.problems

/**
  * Created by Mayur Mali on 13/03/18.
  */

object Problem3 {

def findKthElementFromList[A](k :Int,ls:List[A]): A = (k, ls) match {

case (0, h :: _) => h
case (k, _ :: tail) if k > 0=> findKthElementFromList(k - 1, tail)
case _ => throw new NoSuchElementException

}
  def main(args: Array[String]) {
    println("Kth Element From The List Is: " + findKthElementFromList(3, List(2,3,1,3,5,6,7)))
  }
//
}