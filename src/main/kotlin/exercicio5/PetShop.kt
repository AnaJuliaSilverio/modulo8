package exercicio5

class PetShop {
    private val animais = arrayListOf<Animal>()
    var qtdAnimal = 0
    fun inserirAnimal(){
        for (i in 0 until qtdAnimal){
            println("ANIMAL ${i+1}")
            println("Digite o nome do animal:")
            val nome = readln()
            println("Digite a idade do $nome:")
            val idade = readln().toInt()
            println("Digite a raça do $nome:")
            val raca = readln()
            println("Digite o nome do reponsável:")
            val responsavel = readln()

            animais.add(tipoAnimal(nome, idade, raca, responsavel))
        }
    }
    fun tipoAnimal(nome:String, idade:Int, raca:String, responsavel:String):Animal{
        while (true){
            println("Qual o tipo do animal ?\n1-Cachorro\n2-Gato\n3-Peixe")
            when(readln()){
                "1"->return Cachorro(nome,idade,raca,responsavel)
                "2"->return Gato(nome,idade,raca,responsavel)
                "3"->return Peixe(nome,idade,raca,responsavel)
                else-> println("Valor inválido!")
            }
        }
    }
    fun exibirAnimais(){
        for (animal in animais){
            println("Nome do bichinho: ${animal.nome}")
            println("Idade: ${animal.idade}")
            println("Raça: ${animal.raca}")
            println("Responsável: ${animal.responsavel}\n")
            println(animal.comer())
            println(animal.movimentar())
            println(animal.dormir())
            println()
        }
    }

}