
// Desafio 2
// Conversão de Tempo

/*
Você terá o desafio de ler um valor inteiro, faça a conversão desse valor para date e informe-o expresso no formato
dia/mês/ano horas:minutos:segundos.

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido.

- Obs

Utilize UTC (GMT-0)

- Exemplo:
    Entrada: 1693225566
    Saída: 28/Aug/2023 12:26:06
*/

package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        // Número de segundos a serem convertidos pre estabelecido
        long segundosExemplo = 1693225566L;

        //Usuario informa os segundos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de segundos: ");
        System.out.println("\nExemplo: 1693225566");
        long segundos;

        // Verifica se o número de segundos fornecido pelo usuário é valido
        try {
            segundos = Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Insira um número válido.");
            return;
        }

        // Converte os segundos para milissegundos (1 segundo = 1000 milissegundos) pq a classe Date trabalha com milissegundos
        Date milissegundosExemplo = new Date(segundosExemplo * 1000L);
        Date milissegundos = new Date(segundos * 1000L);

        // Cria um objeto SimpleDateFormat para formatar a data
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");

        // Configura o fuso horário do SimpleDateFormat para UTC (Tempo Universal)
        formataData.setTimeZone(TimeZone.getTimeZone("UTC"));

        String dataFormatadaExemplo = formataData.format(milissegundosExemplo);
        String dataFormatada = formataData.format(milissegundos);

        // Exibe a data e hora formatada
        System.out.println("\nResultado do exemplo: ");
        System.out.println("Entrada: " + segundosExemplo);
        System.out.println("Saída: " + dataFormatadaExemplo);

        System.out.println("\nResultado do usuário: ");
        System.out.println("Entrada: " + segundos);
        System.out.println("Saída: " + dataFormatada);
    }
}



