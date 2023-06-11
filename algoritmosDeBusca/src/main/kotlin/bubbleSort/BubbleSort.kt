package bubbleSort

import kotlin.system.measureNanoTime

class BubbleSort {

    fun bubbleSort(list: IntArray) {
        val time = measureNanoTime {
            for (i in list.indices) {
                for (j in 0 until list.size - i - 1) {
                    if (list[j] > list[j + 1]) {
                        val cal = list[j]
                        list[j] = list[j + 1]
                        list[j + 1] = cal
                    }
                }
            }
        }
        println("BobbleSort Tempo decorrido: $time ns")
    }

    fun bobbleSortMelhorado(lista: IntArray) {
        val listSize = lista.size
        var start = 0
        var end = listSize - 1
        var swapped = true
        var aux: Int

        val time = measureNanoTime {
            while(swapped) {
                swapped = false

                for(i in 0 until end) {
                    if(lista[i] > lista[i+1]) {
                        aux = lista[i]
                        lista[i] = lista[i+1]
                        lista[i+1] = aux
                        swapped = true
                    }
                }
                if(!swapped) { break }

                swapped = false
                end -= 1

                for(i in end-1 downTo start) {
                    if(lista[i] > lista[i+1]) {
                        aux = lista[i]
                        lista[i] = lista[i+1]
                        lista[i+1] = aux
                        swapped = true
                    }
                }
                start += 1
            }
        }
        println("BobbleSortMelhorado tempo decorrido: $time ns")
    }
}