class SolutionTest extends org.scalatest.FunSuite {
  test("Solution.numJewelsInStones") {
    assert(Solution.numJewelsInStones("soumya", "sanyal") === 4);
    assert(Solution.numJewelsInStones("sanyal", "soumya") === 3);
  }
  test("Solution.trivial") {
    assert(Solution.numJewelsInStones("", "sanyal") === 0);
    assert(Solution.numJewelsInStones("sanyal", "") === 0);
    assert(Solution.numJewelsInStones("", "") === 0);
  }
  test("Solution.repeats") {
    val repeats = 10
    assert(Solution.numJewelsInStones("soumya", "sanyal"*repeats) === repeats*4);
  }
}
