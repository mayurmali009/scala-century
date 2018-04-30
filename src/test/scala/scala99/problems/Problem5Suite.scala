package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by Mayur Mali on 15/03/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem5Suite extends FunSuite {
 import Problem5.reverseRecursive
 import Problem5.reverseTailRecursive
  import Problem5.reverseFunctional

  test("test reverse List non empty list recursively"){
    assert(reverseRecursive(List(1,2,3,4,5,6)) === List(6,5,4,3,2,1))

  }

  test("test reverse non empty List tail recursively"){

    assert(reverseTailRecursive(List(1,2,3,4,5,6,7,8)) === List(8,7,6,5,4,3,2,1))

  }

  test("test reverse list Fold Left"){

    assert(reverseFunctional(List(1,2,3,4,5,6,7,8)) === List(8,7,6,5,4,3,2,1))

  }

  test("test empty list which should throw an exception"){

    reverseRecursive(List())
    reverseTailRecursive(List())
  }

}
