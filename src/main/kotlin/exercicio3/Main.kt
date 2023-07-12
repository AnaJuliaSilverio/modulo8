package exercicio3

fun main() {
    println("Quantos times deseja adicionar? ")
    val nTimes= readln().toInt()
    val times = arrayListOf<Time>()

    for (i in 0 until nTimes){
        println("Time ${i+1}: ")
        println("Qual o nome do time: ")
        val nomeTime = readln()
        println("Qual esporte do time: ")
        val esporte = readln()
        println("Quantas vitórias o $nomeTime tem?")
        val nVitorias = readln().toInt()
        println("Quantos jogadores tem no $nomeTime: ")
        val nJogadores = readln().toInt()
        val time = Time(nomeTime,nJogadores,nVitorias,esporte)
        time.inserirJogadores()
        times.add(time)
    }

    println("EXIBIR TIMES CADASTRADOS")
    for (time in times.indices){
        println("TIME ${time+1}")
        times[time].mostrarTime()
    }
}