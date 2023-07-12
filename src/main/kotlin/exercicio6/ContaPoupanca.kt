package exercicio6

class ContaPoupanca(nrDaConta:Int,nomeProprietario:String):Conta(nrDaConta, nomeProprietario) {
    override fun depositar(valor: Double) {
        println("Quem está fazendo o deposito é o usuário\n1-Sim\n2-Não")
        when(readln()){
            "1"->super.depositar(valor)
            "2"-> println("Conta Poupança só pode receber depósito do usuário.")
            else -> println("Valor inválido!")
        }
    }
}