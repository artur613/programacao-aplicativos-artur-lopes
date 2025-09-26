/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_atvd_7_eduardoamorim_e_arturr;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Java_atvd_7_eduardoamorim_e_arturr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //QUESTAO 1 
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Digite 16 números para preencher a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        entrada.close();
        
        //QUESTAO 2 
        int[] numeros = new int[8];
        int maior, posicao;

        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        maior = numeros[0];
        posicao = 0;

        for (int i = 1; i < 8; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Posição no array: " + posicao);

        entrada.close();
        
        //QUESTAO 3 
         int[] vet1 = new int[5];
        int[] vet2 = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i+1) + ": ");
            vet1[i] = entrada.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vet2[i] = vet1[i];
        }

        System.out.print("\nVetor 1: ");
        for (int i : vet1) {
            System.out.print(i + " ");
        }

        System.out.print("\nVetor 2: ");
        for (int i : vet2) {
            System.out.print(i + " ");
        }

        entrada.close();
        
        //QUESTAO 4
        double[] numeross = new double[20];
        double soma = 0, media;

        System.out.println("Digite 20 números reais:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeross[i] = entrada.nextDouble();
            soma += numeros[i];
        }

        media = soma / 20;
        System.out.println("\nMédia: " + media);
        System.out.println("Valores menores que a média:");
        for (double n : numeros) {
            if (n < media) {
                System.out.print(n + " ");
            }
        }

        entrada.close();
        
        //QUESTAO 5 
        String senha;
        boolean valida;

        do {
            System.out.print("Digite sua senha: ");
            senha = entrada.nextLine();

            valida = true;

            if (senha.length() < 8) {
                System.out.println("Senha inválida: mínimo 8 caracteres.");
                valida = false;
            }

            boolean temNumero = false;
            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);
                if (c >= '0' && c <= '9') {
                    temNumero = true;
                    break;
                }
            }

            if (!temNumero) {
                System.out.println("Senha inválida: falta dígito.");
                valida = false;
            }

        } while (!valida);

        System.out.println("Senha válida!");
        entrada.close();
        
        //QUESTAO 6
        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        int vogais = 0, consoantes = 0, espacos = 0, outros = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            } else if (c >= 'a' && c <= 'z') {
                consoantes++;
            } else if (c == ' ') {
                espacos++;
            } else {
                outros++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Espaços: " + espacos);
        System.out.println("Outros: " + outros);

        entrada.close();
        
        //QUESTAO 7
         System.out.print("Digite um texto: ");
        String texto = entrada.nextLine();

        System.out.print("Digite a palavra a buscar: ");
        String palavra = entrada.nextLine();

        int contador = 0;
        int pos = 0;

        while ((pos = texto.indexOf(palavra, pos)) != -1) {
            contador++;
            pos = pos + 1;
        }

        if (contador > 0) {
            System.out.println("A palavra '" + palavra + "' aparece " + contador + " vezes.");
        } else {
            System.out.println("A palavra não aparece no texto.");
        }

        entrada.close();
        
        //QUESTAO 8
        System.out.print("Cadastre um nome de usuário: ");
        String usuarioCadastrado = entrada.nextLine();

        int tentativas = 3;
        String usuarioDigitado;
        boolean acesso = false;

        do {
            System.out.print("Digite o nome de usuário para login: ");
            usuarioDigitado = entrada.nextLine();

            if (usuarioDigitado.equals(usuarioCadastrado)) {
                System.out.println("Acesso concedido!");
                acesso = true;
                break;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Acesso negado – tentativas restantes: " + tentativas);
                }
            }
        } while (tentativas > 0);

        if (!acesso) {
            System.out.println("Conta bloqueada.");
        }

        entrada.close();
        
    }
    
}
