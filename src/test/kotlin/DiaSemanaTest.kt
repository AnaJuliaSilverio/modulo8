import org.junit.Assert
import org.junit.Test

class DiaSemanaTest {
    @Test
    fun diaDaSemanaRetornaSucesso(){
        val dia = 7
        val diaSemana = DiaSemana()
        Assert.assertEquals("Sábado",diaSemana.diaSemana(dia))
    }
    @Test
    fun diaSemanaInvalido(){
        val dia = 8
        val diaSemana = DiaSemana()
        Assert.assertEquals("Valor inválido",diaSemana.diaSemana(dia))
    }
}