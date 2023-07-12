package exercicio4

import Util.VerificaInputs
import java.time.LocalDate

class RecursosHumanos {
    data class Funcionario(val nomeCompleto:String,val setor:String,val salario:Double,val dataAdmissao:LocalDate)
    val funcionarios = arrayListOf<Funcionario>()
    var nFuncionario = 0

    fun inserirFuncionario(){
        for (i in 0 until nFuncionario){
            println("Funcionário ${i+1}")
            println("Digite o nome do funcionário: ")
            val nome = readln()
            println("Digite o setor em que o(a) ${nome} trabalha: ")
            val setor = readln()
            println("Digite o salário do(a) ${nome}:")
            val salario = readln().toDouble()
            println("Digite a data de admissão: ")
            val dataAdmissao = LocalDate.parse(readln(), VerificaInputs.formatter)
            funcionarios.add(Funcionario(nome,setor,salario,dataAdmissao))
        }
    }

    fun exibirFuncionarios(){
        for(funcionario in funcionarios){
            println("Nome funcionário: ${funcionario.nomeCompleto}")
            println("Setor: ${funcionario.setor}")
            println("Salário R$${funcionario.salario}")
            println("Data de admissão: ${funcionario.dataAdmissao.format(VerificaInputs.formatter)}\n")
        }
    }
}