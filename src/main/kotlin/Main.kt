import java.util.Arrays

fun sum(a: Int, b: Int) : Int { // fun (nome) (args, tipos) : retorno (a+b) como a+b = int, return = int

    return a+b;

}

fun main(args: Array<String>) {

    println("Curso de Kotlin")

    // #01:  Variaveis mutaveis e imutaveis

    /* Variavel mutavel: pode mudar o valor inicial
    *
    * Iniciei minha variavel nome com o valor Tiago e mudei para
    * o "Outro nome"
    *
    * */

    var nome = "Tiago"
    nome = "Outro nome"
    println(nome)

    /*Variavel imutavel*/

    val idade = 18

    println("Idade = $idade")


    // Consigo definir tambem o valor antes, mas é redundanter

    val idade2: Int = 20;
    println("Idade 2 = $idade2") //Concatenação, pode ser com cifrão ou com + depois do aspas

    /*Uma curiosidade: tipo "byte" armazena -128 até 127.
    *
    * Nosso tipo idade = 20, o kotlin identifica como inteiro, mas, caso eu queira
    * obrigar ele a ser um Byte, teria que deixar claro usando a forma acima.
    *
    * val idadeByte: Byte = 20;
    *
    * */

    // Estrutura condicional

    if (idade >= 18) {
        println("Maior idade")
    } else {
        println("Menor idade")
    }

    var x = 20;

    // incremento
    println(++x) // 21
    //decremento
    println("Valor atual de X: $x") // 21
    println(--x) // 21 - 1 = 20


    var listaNumeros = arrayOf(
        10,
        20,
        30
    )

    var indice = 0;

    println(Arrays.toString(listaNumeros))

    for (indice in 0 .. listaNumeros.size-1){ // size -1 pq o size acrescenta + index
        println(listaNumeros[indice])
    }

    val a = 20
    val b = 20

    println("Soma, $a + $b = ${sum(a,b)}")

    var valor = 1

    // estrutura when

    when (valor) {

        1 -> println("Suco de Milho")
        2 -> println("Suco de Laranja")
        3 -> println("Suco de Maracuja")
        else -> println("Nothing")

    }

   // atribuindo a estrutura a uma variavel

    var mensagem = when (valor) {
        1 -> ("bom dia")
        2 -> ("boa tarde")
        3 -> ("boa noite")
        else ->("falar nada")
    }

    println(mensagem) // print valor da mensagem
}