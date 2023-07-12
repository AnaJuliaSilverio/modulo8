package exercicio3

import Util.VerificaInputs
import java.time.LocalDate

class Time(var nomeTime:String,var numeroJogadores:Int,private var _numeroVitorias:Int,val esporte:String){
    data class Jogador(val nome:String,val idade:Int,val posicao:String)
    val estado = "Minas Gerais"
    val jogadores = arrayListOf<Jogador>()
    var numeroVitorias:String = "0"
        get() = "Vitórias até ${LocalDate.now().format(VerificaInputs.formatter)}: $_numeroVitorias"
        set(value) {
            field = (_numeroVitorias+value.toInt()).toString()
        }

    fun inserirJogadores(){
        var cont = 0
        while (cont<numeroJogadores){
            println("Digite o nome do jogador ${cont+1}:")
            val nomeJogador = readln()
            println("Digite a idade do(a) ${nomeJogador}:")
            val idade = readln().toInt()
            println("Qual posição o(a) ${nomeJogador} atua?")
            val posicao = readln()
            jogadores.add(Jogador(nomeJogador,idade, posicao))
            cont++
        }
    }

    fun mostrarTime(){
        println("Nome do time: $nomeTime")
        println("Estado: $estado")
        println("Categoria: $esporte")
        println(numeroVitorias)
        println("--------Jogadores--------")
        for (jogador in jogadores){
            println("Nome: ${jogador.nome}")
            println("Idade: ${jogador.idade}")
            println("Posição: ${jogador.posicao}\n")
        }
    }

}