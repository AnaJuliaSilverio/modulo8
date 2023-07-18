package exercicio5

import Util.VerificaInputs
import java.lang.IllegalArgumentException
import java.time.LocalDate

class Turma {
    data class Aluno(var nome:String, var matricula:String, var dataNascimento: LocalDate, var sexo:String)
    val aluno = arrayListOf<Aluno>()

    fun cadastrarAluno(){
        println("Digite o nome do aluno: ")
        val nome = readln()
        println("Digite o sexo(M ou F) do(a) $nome")
        val sexoInformado = readln()
        val sexo = if (sexoInformado.equals("f",true)) "Feminino" else if (sexoInformado.equals("m",true)) "Masculino" else ""
        println("Digite a matricula do(a) $nome: ")
        val matricula = readln()
        if (verificaMatricula(matricula))throw IllegalArgumentException("Essa matricula já está vinculada há um aluno!")
        verificaMatricula(matricula)
        println("Digite a data de nascimento do(a) $nome:")
        val dataNascimento = LocalDate.parse(readln(),VerificaInputs.formatter)
        if (dataNascimento.isAfter(LocalDate.now())) throw IllegalArgumentException("A data de nascimento não pode ser posterior ao dia de hoje")
        aluno.add(Aluno(nome,matricula,dataNascimento,sexo))

    }
    private fun verificaMatricula(matricula:String):Boolean{
        for (item in aluno){
            if (item.matricula.equals(matricula,true)) return true
        }
        return false
    }
    fun listarAlunos(){
        println("-------ALUNOS--------")
        for (item in aluno){
            println("NOME: ${item.nome}")
            println("SEXO: ${item.sexo}")
            println("DATA DE NASCIMENTO: ${item.dataNascimento.format(VerificaInputs.formatter)}")
            println("MATRÍCULA: ${item.matricula}\n")
        }
    }
    fun mediaIdades(){
        val idades = aluno.map { aluno -> LocalDate.now().year- aluno.dataNascimento.year}
        println("A média das idades dos alunos é :${idades.average()}")
    }
    fun maisVelho() {
        val maisVelho = aluno.minBy { it.dataNascimento }
        println("O aluno mais velho é: $maisVelho")
    }
    fun atualizaDados(matricula: String){
        if (!verificaMatricula(matricula))throw IllegalArgumentException("Essa matricula não está vinculada há um aluno!")
        for (item in aluno){
            if (item.matricula == matricula){
                println("Novo nome: ")
                val nome = readln()
                item.nome = nome
            }
        }
    }
    fun removeAluno(matricula: String){
        if (!verificaMatricula(matricula))throw IllegalArgumentException("Essa matricula não está vinculada há um aluno!")
        val alunoRemovido = aluno.find { it.matricula ==matricula }
        aluno.remove(alunoRemovido)
    }
}