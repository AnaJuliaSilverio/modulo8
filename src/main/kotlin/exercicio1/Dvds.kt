package exercicio1

class Dvds(nome:String,preco:Double,codigoBarras:Int,var duracao:Int):Produto(nome,preco,codigoBarras) {
    override fun mostrarDetalhesDoItem(): String {
        return super.mostrarDetalhesDoItem()+"Duração em minutos: $duracao\n"
    }

}