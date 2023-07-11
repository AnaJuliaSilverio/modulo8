package exercicio2

import exercicio1.Model.Vendedor
import java.time.LocalDate
import kotlin.random.Random

class FigurasConhecidas {
    companion object{
        val figurasHistoricas = mapOf(
            Pessoa("Albert Einstein") to LocalDate.of(1879, 3, 14),
            Pessoa("Isaac Newton") to LocalDate.of(1643, 1, 4),
            Pessoa("Leonardo da Vinci") to LocalDate.of(1452, 4, 15),
            Pessoa("William Shakespeare") to LocalDate.of(1564, 4, 26),
            Pessoa("Marie Curie") to LocalDate.of(1867, 11, 7),
            Pessoa("Nelson Mandela") to LocalDate.of(1918, 7, 18),
            Pessoa("Mahatma Gandhi") to LocalDate.of(1869, 10, 2),
            Pessoa("Winston Churchill") to LocalDate.of(1874, 11, 30),
            Pessoa("Martin Luther King Jr.") to LocalDate.of(1929, 1, 15),
            Pessoa("Abraham Lincoln") to LocalDate.of(1809, 2, 12),
            Pessoa("Joan of Arc") to LocalDate.of(1412, 1, 6),
            Pessoa("Alexander the Great") to LocalDate.of(356, 7, 20),
            Pessoa("Galileo Galilei") to LocalDate.of(1564, 2, 15),
            Pessoa("Christopher Columbus") to LocalDate.of(1451, 10, 31),
            Pessoa("Johannes Gutenberg") to LocalDate.of(1398, 6, 24),
            Pessoa("Pablo Picasso") to LocalDate.of(1881, 10, 25),
            Pessoa("Vincent van Gogh") to LocalDate.of(1853, 3, 30),
            Pessoa("Wolfgang Amadeus Mozart") to LocalDate.of(1756, 1, 27),
            Pessoa("Alberto Santos Dumont") to LocalDate.of(1873, 7, 20)
        )
        fun pessoaAleatoria(): Pair<Pessoa, LocalDate?> {
            val valor = Random.nextInt(0, figurasHistoricas.size)
            val figuras = figurasHistoricas.keys.toList()
            val pessoa = figuras[valor]
            return Pair(pessoa, figurasHistoricas[pessoa])
        }
    }


}