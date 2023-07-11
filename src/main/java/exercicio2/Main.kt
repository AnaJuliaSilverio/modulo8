package exercicio2

import java.time.LocalDate


fun main() {
    println("Digite seu nome: ")
    val pessoa = Pessoa(readln())
    println("Bem-vindo(a) ${pessoa.nome}!")
    println("Qual ano você nasceu? ")
    val anoNascimento = readln().toInt()
    println("Qual mês?(1-12)")
    val mes = readln().toInt()
    println("Qual dia?(1-7)")
    val dia = readln().toInt()
    pessoa.ajustaDataDeNascimento(dia,anoNascimento,mes)
    pessoa.calculaIdade(LocalDate.now())

    println("Vamos gerar um número pra você!Um momento...")
    val pair = FigurasConhecidas.pessoaAleatoria()
    val pessoConhecidas =  pair.first
    pair.second?.let { pessoConhecidas.ajustaDataDeNascimento(it) }
    pessoConhecidas.calculaIdade(LocalDate.now())

    val diferencaIdade =pessoConhecidas.informaIdade()-pessoa.informaIdade()
    val diferencaMeses = diferencaIdade*12
    val diferencaDias = diferencaMeses *365
    val diferencaHoras = diferencaDias * 24
    val diferencaMinutos = diferencaHoras *60

    println("Olha só!Você e o(a) ${pessoConhecidas.nome} tem $diferencaIdade anos de diferença.Isso são $diferencaMeses meses,${diferencaDias} dias,${diferencaHoras} horas e $diferencaMinutos minutos.")

}