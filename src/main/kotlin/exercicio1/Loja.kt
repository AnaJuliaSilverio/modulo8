package exercicio1

class Loja {
    val produtos = arrayListOf<Produto>()

    fun inserirProduto(produto: Produto){
        if (retornaProdutoCodBarra(produto.codigoBarras)==null){
            produtos.add(produto)
        }else println("PRODUTO JÁ EXISTE")

    }
    fun buscaProduto(codBarra:Int){
        val produto = retornaProdutoCodBarra(codBarra)
        for (i in produtos.indices){
            if (produto != null) {
                if (produto.equals(produtos[i])) {
                    println("O produto está na posição $i")
                    return
                }
            }
        }
        println("Produto não encontrado")

    }
    private fun retornaProdutoCodBarra(codBarra:Int):Produto?{
        for (produto in produtos){
            //usando um get
            if (produto.codigoBarras == codBarra) return produto
        }
        return null
    }
    fun exibirProdutos(){
        println("---------PRODUTOS DISPONÍVEIS------\n")
        println("----CDS-----")
        produtos.filterIsInstance<Cds>().forEach{ println(it.mostrarDetalhesDoItem()) }
        println("----DVDS-----")
        produtos.filterIsInstance<Dvds>().forEach{ println(it.mostrarDetalhesDoItem()) }
        println("----LIVROS-----")
        produtos.filterIsInstance<Livros>().forEach{ println(it.mostrarDetalhesDoItem()) }

    }
}