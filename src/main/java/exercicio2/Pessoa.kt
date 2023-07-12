package exercicio2

import java.lang.IllegalArgumentException
import java.time.LocalDate

class Pessoa(var nome:String){
    private var idade:Int = 0
    private var dia:Int = 0
    private var anoNascimento:Int = 0
    private var mes:Int =0
    var dataNascimento:LocalDate? = null

    fun calculaIdade(dataAtual:LocalDate){
        idade = dataAtual.year - anoNascimento
    }
    fun informaIdade():Int{
        return idade
    }
    fun ajustaDataDeNascimento(dia:Int,anoNascimento:Int,mes:Int){
        dataNascimento= LocalDate.of(anoNascimento,mes,dia)
        this.anoNascimento = anoNascimento
        this.dia = dia
        this.mes = mes
    }
    fun ajustaDataDeNascimento(data:LocalDate){
        dataNascimento= data
        this.anoNascimento = data.year
        this.dia = data.dayOfWeek.value
        this.mes = data.dayOfMonth
    }

}