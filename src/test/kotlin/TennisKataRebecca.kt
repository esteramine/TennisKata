import org.junit.Assert
import org.junit.Test

class TennisKataRebecca {
    private val tennisGame = TennisGame()

    private fun scoreShouldMatch(expectedScrod: String) {
        Assert.assertEquals(expectedScrod, tennisGame.showScore())
    }

    @Test
    fun testFifteenLove() {
        scoreShouldMatch("Fifteen Love")
    }

    @Test
    fun testThirtyLove() {
        tennisGame.player1Win()
        tennisGame.player1Win()
        scoreShouldMatch("Thirty Love")
    }

}