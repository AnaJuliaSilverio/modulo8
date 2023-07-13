package exercicio1

class Livros(nome:String,preco:Double,codigoBarras:Int,var autor:String):Produto(nome,preco,codigoBarras){
    override fun mostrarDetalhesDoItem(): String {
        return super.mostrarDetalhesDoItem()+"Autor: $autor\n"
    }
}