import org.junit.Assert
import org.junit.Test

class EhMaiorTest {
    @Test
    fun retornaNumeroMaiorSucesso(){
        val valores = intArrayOf(1,2,34,5,6)
        val ehMaior =EhMaior()
        Assert.assertEquals(34,ehMaior.maiorValor(valores))
    }
    @Test
    fun retornaExecaoVetorMenor(){
        val valores = intArrayOf(1,2,34,5)
        val ehMaior =EhMaior()
        Assert.assertThrows(IllegalArgumentException::class.java){
            ehMaior.maiorValor(valores)
        }
    }
    @Test
    fun retornaExecaoVetorMaior(){
        val valores = intArrayOf(1,2,34,5,7,9)
        val ehMaior =EhMaior()
        Assert.assertThrows(IllegalArgumentException::class.java){
            ehMaior.maiorValor(valores)
        }
    }
}