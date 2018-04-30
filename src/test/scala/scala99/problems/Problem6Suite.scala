package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by Mayur Mali on 16/03/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem6Suite extends FunSuite {
  import Problem6.checkPalindromeTailRecursive

  test("test element in the non empty list are palindrome") {
    assert(checkPalindromeTailRecursive(List(0,1,2,1,0)) == true)
  }

  test("test element with empty list throws exception") {
    assertThrows[UnsupportedOperationException] {
      checkPalindromeTailRecursive(List())
    }
  }

}
