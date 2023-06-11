import InsertionSort.InsertionSort
import bubbleSort.BubbleSort
import selectionSort.SelectionSort

fun main() {

    val lista1000 = IntArray(100000) { (1..1000000000).random() }
    val asdasd = IntArray(1000)

    /*println("===================================")
    BubbleSort().bubbleSort(lista1000)
    BubbleSort().bobbleSortMelhorado(lista1000)
    println("===================================")*/

    /*SelectionSort().selectionSort(lista1000)
    SelectionSort().selectionSortMelhorado(lista1000)
    println("===================================")*/

    InsertionSort().insertionSort(lista1000)
    InsertionSort().insertionSortMelhorado(lista1000)
    println("===================================")
}