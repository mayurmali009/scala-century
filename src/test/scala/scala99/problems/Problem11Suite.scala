package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by Mayur Mali on 01/04/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem11Suite extends FunSuite {
import Problem11.pack
import Problem11.encodeModified

  test("test Pack consecutive duplicates of list elements into sublists"){
    assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  test("encodeModified to count number of duplicates elements"){
    assert(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(Right((4,'a)), Left('b), Right((2,'c)), Right((2,'a)), Left('d), Right((4,'e))))
  }

  test("test empty list which should throw an exception"){
    assertThrows[UnsupportedOperationException] {
      pack(List())
    }
  }

}
