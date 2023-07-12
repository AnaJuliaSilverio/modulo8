package exercicio5

class Peixe(nome:String, idade:Int, raca:String, responsavel:String):Animal(nome, idade,raca,responsavel){
    override fun movimentar(): String {
        return "Nadando"
    }

    override fun comer(): String {
       return "Comendo ração molhada"
    }

    override fun dormir(): String {
        return "Dormindo de olho aberto."
    }

}