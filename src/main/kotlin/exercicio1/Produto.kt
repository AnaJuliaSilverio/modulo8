package exercicio1

abstract class Produto(var nome:String,var preco:Double,var codigoBarras:Int){
    open fun mostrarDetalhesDoItem():String{
        return "Nome: ${nome}\nPreço:R$${preco}\n"
    }

    override fun equals(other: Any?): Boolean {
        other as Produto
        return codigoBarras == other.codigoBarras
    }

}