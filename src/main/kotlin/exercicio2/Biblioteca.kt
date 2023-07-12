package exercicio2

import Util.VerificaInputs
import java.time.LocalDate

class Biblioteca {
    data class Autora(val nome:String,val idade:Int,val nacionalidade:String)
    data class Livro(val nome:String, val genero:String, val autora: Autora, val dataLancamento:LocalDate)

    val livros = arrayListOf<Livro>()

    fun cadastrarLivro(nome:String,genero:String,autora: Autora,dataLancamento:LocalDate){
        livros.add(Livro(nome,genero,autora,dataLancamento))
    }
    fun exibirLivros(verAutora:Boolean){
        for (livro in livros){
            println("Nome do livro: ${livro.nome}")
            println("Gênero: ${livro.genero}")
            println("Data de lançamento: ${livro.dataLancamento.format(VerificaInputs.formatter)}")
            if (verAutora){
                println("Nome autor(a): ${livro.autora.nome}")
                println("Idade: ${livro.autora.idade}")
                println("Nacionalidade: ${livro.autora.nacionalidade}")
            }

        }

    }
}