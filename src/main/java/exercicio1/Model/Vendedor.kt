package exercicio1.Model

import kotlin.random.Random

class Vendedor(
    var nome:String,
    var senha:String,
    var email:String
){
    companion object{
        val listaVendedor = listOf<Vendedor>(
            Vendedor("Paulo","paulinho2002","paulovivi@super.com"),
            Vendedor("Janaina","janall2!","jana@super.com")
        )
        fun vendedorAleatorio(): Vendedor {
            val valor =Random.nextInt(0, listaVendedor.size)
            return listaVendedor[valor]
        }
    }



}