object Solution {
    def numJewelsInStones(J: String, S: String): Int = {
        S.filter(c => J.contains(c)).length
    }
}
