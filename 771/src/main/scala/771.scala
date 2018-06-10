object Solution {

  def main(args: Array[String]): Unit = {
    val pairs = args.sliding(2,2)
      .toList
      .filter(p => p.length == 2);
    pairs.foreach(p => println(numJewelsInStones(p(0), p(1))));
  }

  def numJewelsInStones(J: String, S: String): Int = {
    S.filter(c => J.contains(c)).length
  }
}
