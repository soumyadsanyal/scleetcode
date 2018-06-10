class SolutionTest extends org.scalatest.FunSuite {
  test("Solution.numJewelsInStones") {
    assert(Solution.numJewelsInStones("soumya", "sanyal") === 4);
    assert(Solution.numJewelsInStones("sanyal", "soumya") === 3);
  }
}
