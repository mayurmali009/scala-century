package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by Mayur Mali on 16/03/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem8Suite extends FunSuite {
  import Problem8.compressRecursive
  import Problem8.compressTailRecursive
  import Problem8.compress

  test("test elimination of duplicate elements using Recursive from the non empty list"){
    assert(compressRecursive(List("a","a","b","b","c","d","c")) == List("a","b","c","d","c"))
  }

  test("test elimination of duplicate elements using Tail Recursive from the non empty list"){
    assert(compressTailRecursive(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List('a','b','c','a','d','e'))
  }

  test("test elimination of duplicate elements using Fold Right from the non empty list"){
    assert(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List('a','b','c','a','d','e'))
  }

}
