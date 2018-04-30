package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by Mayur Mali on 15/03/18.
  */
@RunWith(classOf[JUnitRunner])
class Problem4Suit extends FunSuite{
  import Problem4.findLengthRecursive
  import Problem4.findLengthTailRecursive


  test("test length of non empty list recursively"){
    assert(findLengthRecursive(List(1,2,3,4,5,6)) === 6)

  }

  test("test length of non empty list tail recursively"){

    assert(findLengthTailRecursive(List(1,2,3,4,5,6,7,8)) === 8)

  }


  test("test empty list which should throw an exception"){

    findLengthRecursive(List())
    findLengthTailRecursive(List())
  }

}
