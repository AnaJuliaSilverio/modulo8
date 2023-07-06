package exercicio1

fun main() {
    val funcionario = Funcionario("Luis","Silva",10,25.50)
    funcionario.nomeCompleto()
    funcionario.calculaSalario()
    funcionario.incrementaHoras(8)
    funcionario.calculaSalario()

    val funcionarios = ArrayList<Funcionario>()
    funcionarios.add(Funcionario("João", "Silva", 40, 25.0))
    funcionarios.add(Funcionario("Maria", "Santos", 35, 30.0))
    funcionarios.add(Funcionario("Pedro", "Ferreira", 42, 28.5))
    funcionarios.add(Funcionario("Ana", "Souza", 38, 26.5))
    funcionarios.add(Funcionario("Paula", "Gomes", 37, 27.0))
    funcionarios.add(Funcionario("Mariana", "Rocha", 39, 29.0))
    funcionarios.add(Funcionario("Carlos", "Oliveira", 40, 25.5))
    funcionarios.add(Funcionario("Fernanda", "Almeida", 36, 31.0))
    funcionarios.add(Funcionario("Rafael", "Pereira", 41, 26.0))
    println("----Funcionários------")
    for (i in funcionarios){
        print("Nome completo:")
        i.nomeCompleto()
        println("Horas trabalhadas: ${i.horasTrabalhadas}")
        println("Valor da hora: R$${i.valorPorHora}")
        i.calculaSalario()
        println()
    }
}