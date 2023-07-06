package exercicio1

class Funcionario(var nome:String,var sobrenome:String,var horasTrabalhadas:Int,var valorPorHora:Double) {
    fun nomeCompleto(){
        println("$nome $sobrenome")
    }
    fun calculaSalario(){
        println("O funcionário $nome irá receber R$${horasTrabalhadas*valorPorHora}")
    }
    fun incrementaHoras(valor:Int){
        horasTrabalhadas+=valor
    }
}