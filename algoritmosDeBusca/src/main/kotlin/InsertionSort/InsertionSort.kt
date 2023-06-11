package InsertionSort

import kotlin.system.measureNanoTime

class InsertionSort {
    fun insertionSort(lista: IntArray) {
        val n = lista.size
        val time = measureNanoTime {
            for (i in 1 until n) {
                val key = lista[i]
                var j = i - 1

                while (j >= 0 && lista[j] > key) {
                    lista[j + 1] = lista[j]
                    j--
                }

                lista[j + 1] = key
            }
        }
        println("Insertion Sort tempo decorrido: $time ns")
    }

    fun insertionSortMelhorado(lista: IntArray) {
        //  Se o elemento atual já estiver na posição correta \parte do array já ordenada\, o loop interno não será executado.
        val n: Int = lista.size
        val time = measureNanoTime {
            for (i in 1 until n) {
                val key: Int = lista[i]
                var j = i - 1

                // verifiuca se o elemento atual é maior que o elemento anterior
                if (lista[j] > key) {
                    // Encontra a posição correta de inserção
                    while (j >= 0 && lista[j] > key) {
                        lista[j + 1] = lista[j]
                        j--
                    }

                    // Verifica elementos iguais e insere após o último elemento igual encontrado
                    while (j >= 0 && lista[i] == key) {
                        j--
                    }
                    lista[j + 1] = key
                }
            }
        }
        println("Insertion Sort Melhorado tempo decorrido: $time ns")
    }
}