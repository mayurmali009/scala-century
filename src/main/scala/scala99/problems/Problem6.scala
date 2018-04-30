package scala99.problems

/* P06 (*) Find out whether a list is a palindrome.
   Example:
   scala> isPalindrome(List(1, 2, 3, 2, 1))
   res0: Boolean = true */

/**
  * Created by Mayur Mali on 16/03/18.
  */

object Problem6 {

  def isPalindrome[A](ls: List[A]) : Boolean = ls == ls.reverse

  def checkPalindromeTailRecursive[A](ls: List[A]) : Boolean = {

    if(ls.isEmpty) { throw new UnsupportedOperationException }

    def isPalindromeR[A](list: List[A]): Boolean = list match {

      case Nil => true
      case x :: Nil => true
      case x :: xs if(x == xs.last) => checkPalindromeTailRecursive(xs.dropRight(1))
      case _ => false

    }

    isPalindromeR(ls)

  }

  def main(args: Array[String]): Unit = {
    println("is Palindrome BuiltIn : " +checkPalindromeTailRecursive(List(0,1,2,1,0)))
    println("is Palindrome : " +checkPalindromeTailRecursive(List(0,1,1)))
    println("is Palindrome String : " +checkPalindromeTailRecursive(List("a,b,c,b,a")))
    println("is Palindrome String : " +checkPalindromeTailRecursive(List("r,a,c,e,c,a,r")))
  }

}
