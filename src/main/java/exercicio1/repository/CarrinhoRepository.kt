package exercicio1.repository

import exercicio1.Model.Produto
import java.lang.IllegalArgumentException

class CarrinhoRepository {
    val carrinho = mutableMapOf<Produto, Int>()

    fun produtoExiste(codigoProduto: Int): Produto?{
        for (key in carrinho.keys){
            if (codigoProduto == key.codigo) return key
        }
        return null
    }
    fun adicionarProduto(produto: Produto, quantidade:Int){
        if (quantidade>produto.quantidade)throw IllegalArgumentException("Quantidade indisponível!")
        if (carrinho.containsKey(produto)){
            if (produto.quantidade<(quantidade+carrinho[produto]!!))throw IllegalArgumentException("Quantidade indisponível!")
            val qtdAntiga = carrinho[produto]
            if (qtdAntiga != null) {
                carrinho[produto] = qtdAntiga+quantidade
            }
        }else carrinho.put(produto,quantidade)
    }
    fun retirarProdutoCarrinho(produto: Produto){
        carrinho.remove(produto)
    }
}