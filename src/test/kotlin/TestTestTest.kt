import org.junit.Assert
import org.junit.Test

class TestTestTest {

    // Annotation
    @Test
    fun testHelloWorld() {

        val game: TennisGame = TennisGame()

        Assert.assertEquals("HelloWorld", "HelloWorld")
    }

}