package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by Mayur Mali on 16/03/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem7Suite extends FunSuite {
  import Problem7.makeListFlatten

  test("test flatten the non empty given list") {
    assert(makeListFlatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }

  test("test flatten the empty given list") {
    assertThrows[UnsupportedOperationException] {
      makeListFlatten(List(List()))
    }
  }

}
