import java.lang.IllegalArgumentException

class EhMaior {
    fun maiorValor(valores: IntArray):Int{
        if (valores.size!=5) throw IllegalArgumentException("Quantidade inválida")
        return valores.max()
    }
}