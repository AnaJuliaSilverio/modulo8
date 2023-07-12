package exercicio1

import java.lang.IllegalArgumentException
import java.time.LocalDate

class Supermercado {
    val listaDeProduto = arrayListOf<Produto>()
    val nomeSupermercado = "DelNet Supermercados"


    fun cadastrarProduto(nomeProduto: String, marca: String, dataValidade: LocalDate){
        if (!produtoJaExiste(nomeProduto,marca)) listaDeProduto.add(Produto(nomeProduto, marca,dataValidade))
        else throw IllegalArgumentException("Produto já cadastrado!")

    }
    fun mostrarProdutos(){
        if (listaDeProduto.isEmpty()) println("Nenhum produto cadastrado")
        else{
            println("------PRODUTOS------")
            for (produto in listaDeProduto){
                println("Nome do produto: ${produto.nomeProduto} ----- Marca: ${produto.marca}----- Código de barras: ${produto.codigoDeBarra} ----- Data de validade: ${produto.dataValidadeFormatada}")
                println()
            }
        }
    }
    private fun produtoJaExiste(nomeProduto: String, marca:String):Boolean{
        for (produto in listaDeProduto){
            if (nomeProduto.equals(produto.nomeProduto,true) && marca.equals(produto.marca,true)) return true
        }
        return false
    }

}