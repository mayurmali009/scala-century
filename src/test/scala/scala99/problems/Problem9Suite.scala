package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by Mayur Mali on 16/03/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem9Suite extends FunSuite {
  import Problem9.pack

  test("test Pack consecutive duplicates of list elements into sublists") {
    assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  test("test empty list which should throw an exception"){
    assertThrows[UnsupportedOperationException] {
      pack(List())
    }
  }

}
