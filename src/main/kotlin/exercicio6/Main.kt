package exercicio6

import java.lang.IllegalArgumentException

fun main() {
   try {
       println("---CONTA SALÁRIO---")
       val contaSalario = ContaSalario(1234,"Ana")
       contaSalario.depositar(100.0)
       println("Saldo atual R$${contaSalario.verSaldo()}")
       contaSalario.sacar(900.0)
       println("---CONTA POUPANÇA---")
       val contaPoupanca = ContaPoupanca(2345,"Karla")
       contaPoupanca.depositar(500.00)
       println("Saldo atual R$${contaPoupanca.verSaldo()}")
       contaPoupanca.sacar(100.0)
       println("---CONTA CORRENTE---")
       val contaCorrente = ContaCorrente(9876,"Luiz")
       contaCorrente.depositar(5500.00)
       println("Saldo atual R$${contaCorrente.verSaldo()}")
       contaCorrente.sacar(900.0)

   }catch (erro:IllegalArgumentException){
       println(erro.message)
   }
}