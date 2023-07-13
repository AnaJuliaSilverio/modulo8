package exercicio1

class Cds(nome:String,preco:Double,codigoBarras:Int,var numeroFaixas:Int):Produto(nome,preco,codigoBarras){
    override fun mostrarDetalhesDoItem(): String {
        return super.mostrarDetalhesDoItem()+"Número de Fiaxas: $numeroFaixas\n"
    }
}