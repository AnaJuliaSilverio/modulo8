package exercicio1.Controller

import exercicio1.Model.Produto
import exercicio1.repository.CaixaRepository

class CaixaController(val caixaRepository: CaixaRepository){

    fun cadastrarProduto(nome:String,preco:Double,quantidade:Int){
        caixaRepository.adicionarProduto(Produto(nome,quantidade,preco))
    }
    fun exibirProdutos(){
        for (produto in caixaRepository.produtos){
            println("Código do Produto: ${produto.codigo}")
            println("Nome do Produto: ${produto.nomeProduto}")
            println("Valor do Produto R$: ${produto.valor}\n")
        }
    }
    fun exibirEstoque(){
        var soma = 0.0
        for (produto in caixaRepository.produtos){
            println("Código do Produto: ${produto.codigo}")
            println("Nome do Produto: ${produto.nomeProduto}")
            println("Valor do Produto R$: ${produto.valor}")
            println("Quantidade: ${produto.quantidade}\n")
            soma += produto.valor*produto.quantidade

        }
        println("Valor Total Estoque R$: $soma")
    }

}