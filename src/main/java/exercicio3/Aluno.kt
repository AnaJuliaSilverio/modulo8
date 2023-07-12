package exercicio3

import kotlin.system.exitProcess

class Aluno() {
    val turma = arrayListOf<Aluno>()
    val notasDoSemestre = arrayListOf<Double>()
    var media = 0.0
    var nome:String = " "

    private fun insereNotas(){
        println("Digite o nome do aluno: ")
        val aluno = Aluno()
        aluno.nome = readln()
        var cont = 0
        while (cont<4){
            println("Insira a nota ${cont+1}")
            val nota = readln().toDouble()
            if (verificaNota(nota)){
                aluno.notasDoSemestre.add(nota)
                cont++
            }else{
                println("Nota inválida!")
            }
        }
        aluno.media = aluno.notasDoSemestre.average()
        println("Média do(a) ${aluno.nome} é ${aluno.media}")
        turma.add(aluno)
    }
    fun insereTurma(){
        while (true){
            insereNotas()
            while (true){
                println("Novo cálculo (1-sim 2-não)?")
                when(readln()){
                    "1"->break
                    "2"->{
                        exibirBoletins()
                        exitProcess(0)
                    }
                    else-> {
                        println("ValorInvalido")
                    }
                }
            }
        }
    }
    private fun verificaNota(nota:Double):Boolean{
        return nota in 0.0 .. 10.9
    }
    private fun exibirBoletins(){
        var soma = 0.0
        println("-----------TURMA DE SIMCITY-----------")
        for(aluno in turma){
            println("Nome do aluno: ${aluno.nome}------Média:${aluno.media}")
            for (i in aluno.notasDoSemestre.indices){
                println("${i+1} Semestre : ${aluno.notasDoSemestre[i]} ")
            }
            soma+=aluno.media
        }
        println("-----------ESTATÍSTICA DA TURMA-----------")
        println("A média da turma foi:${soma/turma.size}")

    }
}