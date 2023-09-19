// Desafio 1
// Ordenando Números Pares e Ímpares

/* Crie um programa onde você receberá valores inteiros não negativos como
entrada.

Ordene estes valores de acordo com o seguinte critério:

- Primeiro os Pares
- Depois os Ímpares
- Você deve exibir os pares em ordem crescente e na sequência os ímpares em
ordem decrescente.

- Entrada

A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
Este é o número de linhas de entrada que vem logo a seguir. As próximas N
linhas terão, cada uma delas, um valor inteiro não negativo.

- Saída

Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
*/

package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class OrdenarParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Verifica se o valor inserido pelo usuário é um inteiro positivo
        try {
            System.out.print("Digite a quantidade de números a serem ordenados: ");
            int quantidade = scanner.nextInt();

            if (quantidade < 0) {
                throw new InputMismatchException("A quantidade não pode ser negativa.");
            }

            int[] valores = new int[quantidade];
            System.out.println("Digite os números:");

            for (int i = 0; i < quantidade; i++) {
                try {
                    int numero = scanner.nextInt();
                    if (numero < 0) {
                        throw new InputMismatchException("Os números não podem ser negativos.");
                    }
                    valores[i] = numero;
                } catch (InputMismatchException ex) {
                    throw new InputMismatchException("Entrada inválida. Insira um número inteiro não negativo.");
                }
            }

            //Listas para armazenar pares e ímpares
            List<Integer> pares = new ArrayList<>();
            List<Integer> impares = new ArrayList<>();

            //Separa os números pares e ímpares
            for (int valor : valores) {
                if (valor % 2 == 0) {
                    pares.add(valor);
                } else {
                    impares.add(valor);
                }
            }

            //Ordena os pares em ordem crescente
            Collections.sort(pares);

            //Ordena os ímpares em ordem decrescente
            Collections.sort(impares, Collections.reverseOrder());

            //Combina os pares e ímpares ordenados
            List<Integer> resultado = new ArrayList<>();
            resultado.addAll(pares);
            resultado.addAll(impares);

            //Percorre o array para exibir os valores de entrada
            System.out.print("\nValores recebidos:");
            for (int valor : valores) {
                System.out.print(" " + valor);
            }

            //Exibe lista de valores pares
            System.out.println("\nValores pares:" + pares);

            //Exibe lista de valores impares
            System.out.println("Valores impares:" + impares);

            //exibe lista ordenada
            System.out.println("\nLista ordenada com pares em ordem crescente e ímpares em ordem decrescente:");
            for (int valor : resultado) {
                System.out.print(valor + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um número inteiro não negativo.");
        } finally {
            scanner.close();
        }
    }
}



