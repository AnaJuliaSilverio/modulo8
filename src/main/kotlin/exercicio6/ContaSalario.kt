package exercicio6

class ContaSalario(nrDaConta:Int,nomeProprietario:String):Conta(nrDaConta, nomeProprietario) {
    override var saldo = 1320.00

    override fun depositar(valor: Double) {
        println("Quem está fazendo o deposito é o empregador\n1-Sim\n2-Não")
        when(readln()){
            "1"->super.depositar(valor)
            "2"-> println("Conta Salário só pode receber depósito do empregador.")
            else -> println("Valor inválido!")
        }
    }

}