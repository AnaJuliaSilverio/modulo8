class DiaSemana {
    fun diaSemana(dia:Int):String{
        return when(dia){
            1-> "Domingo"
            2-> "Segunda"
            3-> "Terça"
            4-> "Quarta"
            5-> "Quinta"
            6-> "Sexta"
            7-> "Sábado"
            else-> "Valor inválido"
        }
    }
}