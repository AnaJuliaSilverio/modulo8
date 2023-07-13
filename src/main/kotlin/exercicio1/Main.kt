package exercicio1

fun main() {
    val loja = Loja()
    loja.inserirProduto(Cds("FUTURE NOSTALGIA",44.64,15778,10))
    loja.inserirProduto(Cds("JACKBOYS",74.43,1479,12))
    loja.inserirProduto(Dvds("Hereditary",49.16,1784,195))
    loja.inserirProduto(Livros("A Biblioteca da Meia-Noite",41.90,2525,"Matt Haig"))
    loja.inserirProduto(Livros("Verity",33.90,4578,"Collen Hoover"))
    loja.buscaProduto(4578)
    loja.buscaProduto(1111)
    loja.inserirProduto(Livros("A Biblioteca da Meia-Noite",41.90,2525,"Matt Haig"))
    loja.inserirProduto(Livros("A Biblioteca da Meia-Noite",41.90,2527,"Matt Haig"))
    loja.exibirProdutos()
}