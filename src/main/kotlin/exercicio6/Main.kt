package exercicio6

import java.lang.NullPointerException
import kotlin.system.exitProcess

fun main() {
    val guardaVolumes = GuardaVolumes()
    while (true){
      try {
          println("1-Guardar Peças\n2-Mostrar Guarda Volumes\n3-Mostrar Peças\n4-Devolver peças\n5-Sair")
          when(readln()){
              "1"-> {
                  println("Quantas peças deseja inserir? ")
                  val pecas = guardaVolumes.inserirPecas(readln().toInt())
                  guardaVolumes.guardarPecas(pecas)
              }
              "2"->guardaVolumes.mostrarPecas()
              "3"->{
                  println("Digite o identificador: ")
                  guardaVolumes.mostrarPecas(readln().toInt())
              }
              "4"->{
                  println("Digite o identificador: ")
                  guardaVolumes.devolverPecas(readln().toInt())
              }
              "5"-> exitProcess(0)
              else-> println("Valor inválido")
          }
      }catch (erro:NullPointerException){
          println("Identificador inválido")
      }
    }
}