import org.junit.Assert
import org.junit.Test

class ProdutoTest {
    @Test
    fun venderProdutoMaisBarato(){
        val produto = Produtos()
        val produto1 = Produtos(13.4,"Caneta")
        produto.listaDeProdutos.add(produto1)
        val produto2 = Produtos(45.99,"Sapato")
        produto.listaDeProdutos.add(produto2)
        val produto3 = Produtos(109.2,"Lençol")
        produto.listaDeProdutos.add(produto3)
        Assert.assertEquals(produto1,produto.vender())
    }
    @Test
    fun venderProdutoMaisBaratoValoresIguais(){
        val produto = Produtos()
        val produto1 = Produtos(13.4,"Caneta")
        produto.listaDeProdutos.add(produto1)
        val produto2 = Produtos(13.4,"Sapato")
        produto.listaDeProdutos.add(produto2)
        val produto3 = Produtos(13.4,"Lençol")
        produto.listaDeProdutos.add(produto3)
        Assert.assertEquals(produto1,produto.vender())
    }
}