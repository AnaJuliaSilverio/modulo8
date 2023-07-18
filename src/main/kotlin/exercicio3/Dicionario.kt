package exercicio3

class Dicionario {
    private val dicionario = mutableMapOf<String,String>()

    fun adicionarTermo(palavra:String,significado:String){
        dicionario[palavra]= significado
    }
    fun buscarTermos(palavra: String):String?{
        for (item in dicionario.keys){
            if (item.equals(palavra,true))return dicionario[item]
        }
        return null
    }
    fun listarTermos(){
        val dicionarioOrdenado = dicionario.keys.sorted()
        for (item in dicionarioOrdenado){
            println("$item -> ${dicionario[item]}")
        }
    }

}