package exercicio1.Model

class Produto(
    var nomeProduto: String,
    var quantidade:Int,
    var valor:Double){
    companion object{
        private var proximoCodigo = 1
    }
    var codigo:Int = proximoCodigo++
}
