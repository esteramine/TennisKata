class TennisGame {

    var player1Score: Int = 0
    var player2Score: Int = 0

    private fun scoreName(score: Int): String {
        return when (score) {
            0 -> "Love"
            1 -> "Fifteen"
            2 -> "Thirty"
            3 -> "Forty"
            else -> ""
        }
    }

    fun showScore(): String {
        return "${scoreName(player1Score)} ${scoreName(player2Score)}"
    }

    fun player1Win() {
        player1Score++
    }

    fun player2Win() {
        player2Score++
    }


}
