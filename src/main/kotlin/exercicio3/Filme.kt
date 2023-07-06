package exercicio3

class Filme(var titulo:String,var duracao:Int) {
    fun exibirDuracaoEmHoras(){
        var horas:Int =  duracao/60
        var minutos:Int = duracao%60
        println("O filme '$titulo' tem $horas horas e $minutos minutos\n")
    }
}