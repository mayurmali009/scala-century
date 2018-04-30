package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by Mayur Mali on 13/03/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem3Suite extends FunSuite{
  import Problem3.findKthElementFromList

  test("test nth element of non empty list"){
    assert(findKthElementFromList(2, List(1,2,3,4)) === 3)
  }

  test("test empty list which should throw an exception"){
    assertThrows[NoSuchElementException]{
      findKthElementFromList(0,List())
    }
  }
}