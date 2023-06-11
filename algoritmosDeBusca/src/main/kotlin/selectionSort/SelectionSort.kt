package selectionSort

import kotlin.system.measureNanoTime

class SelectionSort {
    fun selectionSort(lista: IntArray) {
        val n = lista.size
        val time = measureNanoTime {
            for (i in 0 until n - 1) {
                var minIndex = i

                for (j in i + 1 until n) {
                    if (lista[j] < lista[minIndex]) {
                        minIndex = j
                    }
                }

                val aux = lista[i]
                lista[i] = lista[minIndex]
                lista[minIndex] = aux
            }
        }
        println("Selection Sort time: $time ns")
    }

    fun selectionSortMelhorado(lista: IntArray) {
        val n = lista.size
        val time = measureNanoTime {
            for (i in 0 until n) {
                var minIndex = i
                for (j in i + 1 until n) {
                    if (lista[j] < lista[minIndex]) {
                        minIndex = j
                    }
                }

                val aux = lista[i]
                lista[i] = lista[minIndex]
                lista[minIndex] = aux

                var isSorted = true
                for (k in 1 until n) {
                    if (lista[k] < lista[k - 1]) {
                        isSorted = false
                        break
                    }
                }
                if (isSorted) {
                    break
                }
            }
        }
        println("Selection Sort Melhorado time: $time ns")
    }
}