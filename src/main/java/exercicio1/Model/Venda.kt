package exercicio1.Model

import java.time.LocalDate

data class Venda(
    var vendedor: Vendedor,
    var cliente: Cliente,
    var carrinho: MutableMap<Produto, Int>,
    var quantidadeTotal:Double
){
    var dataVenda:LocalDate = LocalDate.now()
}
