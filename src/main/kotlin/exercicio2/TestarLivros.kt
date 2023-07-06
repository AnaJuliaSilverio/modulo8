package exercicio2

fun main() {
    val livroFavorito = Livros("O Pequeno Príncipe",98)
    livroFavorito.qtdPaginas = 98
    println("O livro ${livroFavorito.titulo} tem ${livroFavorito.qtdPaginas} páginas")
    livroFavorito.paginasLidas = 20
    livroFavorito.verificarProgesso()
    livroFavorito.paginasLidas =45
    livroFavorito.verificarProgesso()

    val livros = ArrayList<Livros>()
    livros.add(Livros("Dom Quixote", 863))
    livros.add(Livros("1984", 328))
    livros.add(Livros("O Senhor dos Anéis: A Sociedade do Anel", 576))
    livros.add(Livros("Cem Anos de Solidão", 417))
    livros.add(Livros("Ulisses", 783))
    livros.add(Livros("A Revolução dos Bichos", 112))
    livros.add(Livros("O Grande Gatsby", 200))
    livros.add(Livros("O Apanhador no Campo de Centeio", 230))
    livros.add(Livros("Moby Dick", 585))
    livros.add(Livros("O Processo", 221))
    println("----Livros--------")
    for (i in livros){
        i.paginasLidas = 35
        println("Título: ${i.titulo}")
        println("Número de páginas: ${i.qtdPaginas}")
        i.verificarProgesso()
        println()
    }
}