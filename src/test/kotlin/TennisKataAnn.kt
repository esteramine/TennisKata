import org.junit.Assert
import org.junit.Test

class TennisKataAnn {
    private val tennisGame = TennisGame()

    private fun scoreShouldMatch(expectedScore: String) {
        Assert.assertEquals(expectedScore, tennisGame.showScore())
    }

    @Test
    fun testFifteenLove() {
        tennisGame.player1Win()
        scoreShouldMatch("Fifteen Love")
    }

    @Test
    fun testThirtyLove() {
        tennisGame.player1Win()
        tennisGame.player1Win()
        scoreShouldMatch("Thirty Love")
    }

    @Test
    fun testFortyLove() {
        tennisGame.player1Win()
        tennisGame.player1Win()
        tennisGame.player1Win()
        scoreShouldMatch("Forty Love")
    }

    @Test
    fun testLoveFifteen() {
        tennisGame.player2Win()
        scoreShouldMatch("Love Fifteen")
    }

    @Test
    fun testLoveThirty() {
        tennisGame.player2Win()
        tennisGame.player2Win()
        scoreShouldMatch("Love Thirty")
    }

    @Test
    fun testFifteenFifteen() {
        tennisGame.player1Win()
        tennisGame.player2Win()
        scoreShouldMatch("Fifteen Fifteen")
    }
}