package exercicio6

import java.lang.IllegalArgumentException

class ContaCorrente(nrDaConta:Int,nomeProprietario:String):Conta(nrDaConta, nomeProprietario) {
    override fun depositar(valor: Double) {
        if (valor>5000)  throw IllegalArgumentException("Operação inválida,procure a sua agência.")
        super.depositar(valor)

    }
}