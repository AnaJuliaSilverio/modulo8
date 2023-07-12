package exercicio5

class Cachorro(nome:String, idade:Int, raca:String, responsavel:String):Animal(nome, idade,raca,responsavel) {
    override fun movimentar(): String {
        return "Andando em 4 patas."
    }

    override fun comer(): String {
        return "Comendo bife."
    }

    override fun dormir(): String {
        return "Dormindo na cama da Jéssica."
    }

}