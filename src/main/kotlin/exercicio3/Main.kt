package exercicio3

fun main() {
    val filme1 = Filme("Os vingadores",142)
    filme1.exibirDuracaoEmHoras()
    val filme2 = Filme("Hotel Transilvânia",93)
    filme2.exibirDuracaoEmHoras()
    println("Os filmes em cartezes são ${filme1.titulo} e ${filme2.titulo}")
    var filmes = ArrayList<Filme>()
    filmes.add(Filme("A Origem", 148))
    filmes.add(Filme("Interestelar", 169))
    filmes.add(Filme("Clube da Luta", 139))
    filmes.add(Filme("Pulp Fiction", 154))
    filmes.add(Filme("O Senhor dos Anéis: O Retorno do Rei", 201))

    for (i in filmes){
        i.exibirDuracaoEmHoras()
    }
}