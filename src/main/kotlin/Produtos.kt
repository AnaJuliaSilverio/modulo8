class Produtos(){
    var preco = 0.0
    var nomeProduto: String? = null
    val listaDeProdutos: MutableList<Produtos> = ArrayList()

    constructor(preco: Double, nomeProduto: String?):this() {
        this.preco = preco
        this.nomeProduto = nomeProduto
    }

    fun vender():Produtos{
        val produtoMaisBarato = listaDeProdutos.minBy { it.preco }
        println("O produto mais barato é ${produtoMaisBarato.nomeProduto} custando R$${produtoMaisBarato.preco}")
        return produtoMaisBarato
    }
}