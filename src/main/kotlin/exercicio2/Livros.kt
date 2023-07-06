package exercicio2

class Livros(var titulo:String,var qtdPaginas:Int){
    var paginasLidas = 0
        set(value){
            if (value>qtdPaginas)println("Não é possível adicionar essa quantidade")
            else field =value
        }



    fun verificarProgesso(){
        println("Você já leu ${(paginasLidas*100)/qtdPaginas}% do livro")
    }

}