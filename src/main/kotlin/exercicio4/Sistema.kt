package exercicio4

import java.util.IllegalFormatCodePointException

class Sistema {
    data class Habitante(var nome:String,var profissao:String,val salario:ArrayList<Double>)
    private lateinit var habitanteSimCity:Habitante
    private val mesesDoAno = listOf(
        "Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho",
        "Agosto","Setembro","Outubro","Novembro","Dezembro"
    )

    fun cadastrarHabitante(){
        println("Digite seu nome: ")
        val nome = readln()
        println("Digite sua profissão: ")
        val profissao = readln()
        println("Digite seu salário de acordo com o mês: ")
        val salario = arrayListOf<Double>()
        for (i in 0..11){
            println("Salário de ${mesesDoAno[i]}: ")
            salario.add(readln().toDouble())
        }
        habitanteSimCity = Habitante(nome, profissao, salario)
    }

    fun mostrarInfo(){
        println("Nome:${habitanteSimCity.nome}\nProfissão:${habitanteSimCity.profissao}")
    }
    fun mostrarSalarios(){
        for (i in habitanteSimCity.salario.indices){
            println("${mesesDoAno[i]}: R$%.2f".format(habitanteSimCity.salario[i]))
        }
    }
    fun mostrarSalarioImposto(){
        for (i in habitanteSimCity.salario.indices){
            println("${mesesDoAno[i]} -> Valor imposto: R$%.2f".format(calcularImposto(habitanteSimCity.salario[i])))
        }
    }
    private fun calcularImposto(valor:Double):Double{
        if (valor<=2000) return 0.0
        if (valor>=2001 && valor<=3000)return valor*0.08
        if (valor>=3001 && valor<=4500)return valor*0.18
        else return valor*0.28
    }

}