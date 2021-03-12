import org.junit.Assert
import org.junit.Test

class Test2 {
    @Test
    fun testHelloWorld(){
        val game: Tennis123 = Tennis123()
        Assert.assertEquals("HelloWorld", "HelloWorld")
    }
}