package exercicio5

class Gato(nome:String, idade:Int, raca:String, responsavel:String):Animal(nome, idade,raca,responsavel) {
    override fun movimentar(): String {
        return "Andando e saltando em 4 patas."
    }

    override fun comer(): String {
        return "Comendo whiskas sachê."
    }

    override fun dormir(): String {
        return "Dormindo na caixa."
    }

}