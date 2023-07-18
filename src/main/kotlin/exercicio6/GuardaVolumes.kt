package exercicio6

import java.lang.NullPointerException

class GuardaVolumes {
    data class Peca(var marca:String,var modelo:String)
    var id = 1
    val dicionario = mutableMapOf<Int,ArrayList<Peca>>()

    fun guardarPecas(listaPeca:ArrayList<Peca>){
        dicionario[id] = listaPeca
        println("O seu número de identificação é $id. Não perca esse id,pois ele é necessário para recuperar as peças!")
        id++
    }
    fun inserirPecas(quantidade:Int):ArrayList<Peca>{
        val pecas = arrayListOf<Peca>()
        for (i in 0 until quantidade){
            println("-----Peça ${i+1}------")
            println("Marca: ")
            val marca = readln()
            println("Modelo: ")
            val modelo = readln()
            val peca = Peca(marca,modelo)
            pecas.add(peca)
        }
        return pecas
    }
    fun mostrarPecas(){
        for (keys in dicionario.keys){
            println("------Identificador $keys-------")
            println(mostrarPecas(keys))
        }
    }
    fun mostrarPecas(numero:Int){
        for (pecas in dicionario[numero]!!){
            println("Marca: ${pecas.marca}")
            println("Modelo: ${pecas.modelo}\n")
        }
    }
    fun devolverPecas(numero: Int){
        if (!dicionario.containsKey(numero)) throw NullPointerException()
        dicionario.remove(numero)
        println("Peças removidas com sucesso!")

    }
}