package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by Mayur Mali on 01/04/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem10Suite extends FunSuite{
import Problem10.pack
import Problem10.runLengthEncode

  test("test Pack consecutive duplicates of list elements into sublists"){
    assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  test("runLengthEncode to count number of duplicates elements"){
    assert(runLengthEncode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  test("test empty list which should throw an exception"){
    assertThrows[UnsupportedOperationException] {
      pack(List())
    }
  }
}
