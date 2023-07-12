package exercicio6

import java.lang.IllegalArgumentException

open class Conta(val nrDaConta:Int,val nomeProprietario:String){
    open var saldo =0.0
    open fun sacar(valor:Double){
        if (valor>saldo) throw IllegalArgumentException("Valor de saldo insuficente")
        saldo -= valor
        println("Novo saldo :R$${saldo}")
    }
    open fun depositar(valor: Double){
        saldo+=valor
    }
    open fun verSaldo():Double{
        return saldo
    }
}