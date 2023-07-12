package exercicio5

fun main() {
    val petShop = PetShop()
    println("Quantos animais deseja adicionar? ")
    petShop.qtdAnimal = readln().toInt()
    petShop.inserirAnimal()
    petShop.exibirAnimais()
}