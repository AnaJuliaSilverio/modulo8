package exercicio1

import Util.VerificaInputs
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Produto(){
    lateinit var nomeProduto: String
    lateinit var marca:String
    private lateinit var dataValidade: LocalDate
    val dataValidadeFormatada:String
        get() = dataValidade.format(VerificaInputs.formatter)
    constructor(nomeProduto: String,marca:String,dataValidade:LocalDate) : this(){
        this.nomeProduto = nomeProduto
        require(dataValidade.isAfter(LocalDate.now())){"A data não pode ser anterior ao dia de hoje!"}
        this.dataValidade = dataValidade
        this.marca = marca
    }
    companion object{
        private var proximoCodigo = 1000
    }
    val codigoDeBarra:Int = proximoCodigo++

}
