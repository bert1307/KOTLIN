package Desafios

/*
< Desafio 1 >
Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e
chame essa variável de SOMA. A seguir escreva o valor desta variável. */

fun main() {


    val a:Int = readLine()!!.toInt()
    val b:Int = readLine()!!.toInt()

    println("SOMA = " + a.plus(b) )
}
/*
< Desafio 2 >
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares
de 1 até X, um valor por linha, inclusive o X, se for o caso. */

fun main() {

    val x = readLine()!!.toInt()

    for (i in 1..x step(2)) println(i)

}
/*
< Desafio 3 >
Você terá o desafio de escrever um programa que leia um valor
inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que
serão apresentadas na execução do programa. */

fun main() {

    var x:Int = 1
    val number = readLine()!!.toInt()

    for (i in x..number) {
        println("$x ${x * x} ${x * x * x}")

        x += 1
    }

}

