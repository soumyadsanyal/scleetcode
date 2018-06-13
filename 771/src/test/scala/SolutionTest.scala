import java.lang.Math.{pow => power}

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
    val p = 12
    val repeats = power(2,p).toInt
    assert(Solution.numJewelsInStones("soumya", "sanyal"*repeats) === repeats*Solution.numJewelsInStones("soumya", "sanyal"));
  }
}
