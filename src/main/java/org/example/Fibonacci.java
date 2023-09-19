// Desafio 3
// Sequência de Fibonacci (Recursividade)

/*
A Sequência de Fibonacci tem como primeiros termos os números 0 e 1 e, a seguir,
cada termo subsequente é obtido pela soma dos dois termos predecessores:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

Fibonacci(0) = 0
Fibonacci(1) = 1
Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o valor relativo ao N número da sequência de Fibonacci, exemplo:

N = 0  => saída "Fib = 0"
N = 1  => saída "Fib = 1"
N = 3  => saída "Fib = 2"
M = 29 => saída "Fib = 514229"

 */

package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);

        //Solicita ao usuário que digite o valor de N
        System.out.print("Digite o valor de N: ");

        //Lê o valor de N fornecido pelo usuário
        int n = inputUsuario.nextInt();

        //Chama a função fibonacci para calcular a sequência de Fibonacci
        long resultado = fibonacci(n);

        //Exibe a saída no formato especificado
        System.out.println("N = " + n + " => saída Fib = " + resultado);
    }

    //Método para calcular a sequência de Fibonacci
    static long fibonacci(int n) {
        //Verifica se n é 0, neste caso, retorna 0
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            //Verifica se n é 1, neste caso, retorna 1
            return 1;
        } else {
            //Se n não é 0 ou 1, calcula Fibonacci
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

