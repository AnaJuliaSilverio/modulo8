package exercicio5

abstract class Animal(val nome:String, val idade:Int,val raca:String,val responsavel:String){
    abstract fun movimentar():String
    abstract fun comer():String
    abstract fun dormir():String

}