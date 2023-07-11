package exercicio1.Model

import kotlin.random.Random

class Cliente(
    var nome:String,
    var senha:String,
    var email:String){

    companion object{
        val listaDeCliente = listOf<Cliente>(
            Cliente("Julia","jujuba123","julia@gmail.com"),
            Cliente("Karla","karlita232","karlaalves@gmail.com"),
        )
        fun clienteAleatorio(): Cliente {
            val valor = Random.nextInt(0, listaDeCliente.size)
            return listaDeCliente[valor]
        }
    }

}