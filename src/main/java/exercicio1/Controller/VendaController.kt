package exercicio1.Controller

import exercicio1.Model.Cliente
import exercicio1.Model.Produto
import exercicio1.Model.Venda
import exercicio1.Model.Vendedor
import exercicio1.repository.CaixaRepository
import exercicio1.repository.CarrinhoRepository
import java.lang.IllegalArgumentException

class VendaController(val caixaRepository: CaixaRepository){
    val carrinhoRepository = CarrinhoRepository()


    fun adicionarProdutoAoCarrinho(codigoProduto: Int,quantidade:Int){
        val produto = caixaRepository.produtoExiste(codigoProduto)
        if (produto!=null){
            carrinhoRepository.adicionarProduto(produto,quantidade)
        }else throw IllegalArgumentException("Nenhum produto associado a esse código")
    }
    fun removerProdutoCarrinho(codigoProduto: Int){
        val produto = carrinhoRepository.produtoExiste(codigoProduto)
        if (produto!=null){
            carrinhoRepository.retirarProdutoCarrinho(produto)
        }else throw IllegalArgumentException("Nenhum produto associado a esse código")
    }

    fun venderProduto(vendedor: Vendedor, cliente: Cliente){
        var soma = 0.0
        for (key in carrinhoRepository.carrinho.keys){
            soma += key.valor * carrinhoRepository.carrinho[key]!!
        }
        for (key in carrinhoRepository.carrinho.keys){
            caixaRepository.retirarQuantidade(carrinhoRepository.carrinho[key]!!,key)
        }
        val venda = Venda(vendedor,cliente,carrinhoRepository.carrinho,soma)
        notaFiscal(venda)
    }
    private fun notaFiscal(venda: Venda){
        println("----------Nota Fiscal----------")
        println("Data Da Compra: ${venda.dataVenda}")
        println("Vendedor: ${venda.vendedor.nome}")
        println("Cliente: ${venda.cliente.nome}")
        println("----------Produtos----------")
        for (key in carrinhoRepository.carrinho.keys){
            println("${key.nomeProduto}, R$${key.valor} x ${carrinhoRepository.carrinho[key]} = R$ ${key.valor * carrinhoRepository.carrinho[key]!!}")
        }
        println("-------------------------------------")
        println("Valor Total R$: ${venda.quantidadeTotal}\n")
    }
    fun exibirCarrinho(){
        println("-----------CARRINHO-------------")
        for (key in carrinhoRepository.carrinho.keys){
            println("${key.codigo}->${key.nomeProduto}, R$${key.valor} x ${carrinhoRepository.carrinho[key]}")
        }
        println("-------------------------------")
    }
}
