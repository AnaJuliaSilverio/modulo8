package exercicio1

import exercicio1.Controller.CaixaController
import exercicio1.Controller.VendaController
import exercicio1.Model.Cliente
import exercicio1.Model.Vendedor
import exercicio1.repository.CaixaRepository
import java.lang.IllegalArgumentException
import kotlin.system.exitProcess
class Main {
    companion object{
        val caixaRepository = CaixaRepository()
        val caixaController = CaixaController(caixaRepository)
        val venda = VendaController(caixaRepository)
    }

}
fun main() {


    println("Entrar como cliente ou como vendedor:\n1-Vendedor\n2-Cliente\n3-Sair")
    when(readln()){
        "1"-> fluxoVendedor(Main.caixaController)
        "2"-> fluxoCliente(Main.caixaController,Main.venda)
        "3"-> exitProcess(0)
        else -> println("Digite uma opção válida!")
    }

}
fun fluxoVendedor(caixaController: CaixaController){
    while (true){
        try {
            println("Escolha uma opcção:\n1-Cadastrar Produto\n2-Exibir Produto Cadastrado\n3-Voltar para o menu principal")
            when(readln()){
                "1"->{
                    println("Digite o nome do produto: ")
                    val nomeProduto = readln()
                    println("Digite o preço do ${nomeProduto}: ")
                    val preco = readln().toDouble()
                    println("Digite a quantidade de $nomeProduto para o estoque:")
                    val quatindade = readln().toInt()
                    caixaController.cadastrarProduto(nomeProduto,preco,quatindade)
                }
                "2"->{
                    caixaController.exibirEstoque()
                }
                "3"->{
                    main()
                }
                else -> println("Digite uma opção válida!")
            }
        }catch (erro:IllegalArgumentException){
            println(erro.message)
        }

    }

}
fun fluxoCliente(caixaController: CaixaController, vendaController: VendaController){
    val vendedor = Vendedor.vendedorAleatorio()
    val cliente = Cliente.clienteAleatorio()
   while (true){
       try {
           println("---------Menu Cliente--------------")
           println("Escolha uma opcção:\n1-Exibir Produtos\n2-Adicionar Produto ao carrinho\n3-Ver carrinho\n4-Remover Produto do carrinho\n5-Finalizar Compra\n6-Voltar para o menu principal")
           println("-----------------------------------")
           when(readln()){
               "1"->caixaController.exibirProdutos()
               "2"-> {
                   println("Digite o código do produto desejado: ")
                   val codigo = readln().toInt()
                   println("Digite a quantidade desejada: ")
                   val quantidade = readln().toInt()
                   vendaController.adicionarProdutoAoCarrinho(codigo,quantidade)
               }
               "3"->{
                   vendaController.exibirCarrinho()
               }
               "4"->{
                   vendaController.exibirCarrinho()
                   println("Digite o código do produto que deseja remover: ")
                   vendaController.removerProdutoCarrinho(readln().toInt())
               }
               "5"->{
                   vendaController.venderProduto(vendedor,cliente)
               }
               "6"->{
                   main()
               }
               else -> println("Digite uma opção válida!")
           }
       }catch (erro:IllegalArgumentException){
           println(erro.message)
       }

   }


}