package exercicio1.repository

import exercicio1.Model.Produto
import java.lang.IllegalArgumentException

class CaixaRepository {
    val produtos = arrayListOf<Produto>(
        Produto("Arroz", 5, 10.0),
        Produto("Feijão", 3, 5.0),
        Produto("Macarrão", 2, 3.5),
        Produto("Leite", 4, 2.5),
        Produto("Pão", 6, 1.0),
        Produto("Carne", 2, 15.0),
        Produto("Frango", 4, 12.0),
        Produto("Batata", 8, 2.0),
        Produto("Cebola", 3, 1.5),
        Produto("Tomate", 4, 2.0)
    )


    fun produtoExiste(codigoProduto: Int): Produto? {
        if (codigoProduto > produtos.size || codigoProduto < 0) throw IllegalArgumentException("Código Inválido")
        val produto = produtos[codigoProduto - 1]
        if (produtos.contains(produto)) return produto
        else return null
    }

    fun adicionarProduto(produto: Produto) {
        produtos.add(produto)
    }

    fun retirarQuantidade(quantidade: Int, produto: Produto) {
        if (quantidade > produto.quantidade) throw IllegalArgumentException("Quantidade Inválida")
        else if (quantidade == produto.quantidade) produtos.remove(produto)
        else {
            produto.quantidade = quantidade
            produtos.remove(produto)
            produtos.add(produto)
        }
    }
}