/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvd_java_02_artur_e_eduardo_amorim;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atvd_java_02_artur_e_eduardo_amorim {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // questao 1 
        try (Scanner entrada = new Scanner(System.in)) {
            double raio, area, circunf;
            System.out.print("Digite o valor do raio do círculo: ");
            raio = entrada.nextDouble();
            area = Math.PI * Math.pow(raio, 2);
            circunf = 2 * Math.PI * raio;
            System.out.println("Área do círculo: " + area);
            System.out.println("Circunferência do círculo: " + circunf);
            
            // questao 2
            double imc, peso, altura;
            System.out.print("\nDigite seu peso em kg: ");
            peso = entrada.nextDouble();
            System.out.print("Digite sua altura em metros: ");
            altura = entrada.nextDouble();
            imc = peso / (altura * altura);
            System.out.println("Seu IMC é: " + imc);
            
            //Questao 3 
            double cateto1, cateto2, hipotenusa;
            System.out.print("\nDigite o valor do cateto 1: ");
            cateto1 = entrada.nextDouble();
            System.out.print("Digite o valor do cateto 2: ");
            cateto2 = entrada.nextDouble();
            hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
            System.out.println("A hipotenusa é: " + hipotenusa);
            
            //questao 4 
            double reais, cotacao, troco;
            int dolares;
            System.out.print("\nDigite o valor em reais: ");
            reais = entrada.nextDouble();
            System.out.print("Digite a cotação do dólar: ");
            cotacao = entrada.nextDouble();
            dolares = (int) (reais / cotacao);
            troco = reais % cotacao;
            System.out.println("Dólares inteiros: " + dolares);
            System.out.println("Troco em reais: " + troco);
            int n, menor = 6, maior = 1, soma = 0;
            System.out.print("\nQuantas vezes deseja rolar o dado? ");
            n = entrada.nextInt();
            Random sorteio = new Random();
            for (int i = 0; i < n; i++) {
                int valor = sorteio.nextInt(6) + 1;
                soma += valor;
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
            } // <-- FECHANDO O FOR AQUI
            
            //questao 5
            double media = (double) soma / n;
            System.out.println("Média: " + media);
            System.out.println("Menor valor: " + menor);
            System.out.println("Maior valor: " + maior);
            
            //questao 6
            double graus, rad;
            System.out.print("\nDigite um ângulo em graus: ");
            graus = entrada.nextDouble();
            rad = Math.toRadians(graus);
            System.out.println("Seno: " + Math.sin(rad));
            System.out.println("Cosseno: " + Math.cos(rad));
            System.out.println("Tangente: " + Math.tan(rad));
            
            //questao 7
            double x1, y1, x2, y2, distancia;
            System.out.print("\nDigite x1: ");
            x1 = entrada.nextDouble();
            System.out.print("Digite y1: ");
            y1 = entrada.nextDouble();
            System.out.print("Digite x2: ");
            x2 = entrada.nextDouble();
            System.out.print("Digite y2: ");
            y2 = entrada.nextDouble();
            distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println("Distância entre os pontos: " + distancia);
            
            
            
            //questao 8
            double n1, n2, n3, media3, somaAbs, dif1, dif2, dif3, maiorDif;
            System.out.print("\nDigite o primeiro número: ");
            n1 = entrada.nextDouble();
            System.out.print("Digite o segundo número: ");
            n2 = entrada.nextDouble();
            System.out.print("Digite o terceiro número: ");
            n3 = entrada.nextDouble();
            media3 = (n1 + n2 + n3) / 3;
            somaAbs = Math.abs(n1) + Math.abs(n2) + Math.abs(n3);
            dif1 = Math.abs(n1 - n2);
            dif2 = Math.abs(n1 - n3);
            dif3 = Math.abs(n2 - n3);
            maiorDif = Math.max(dif1, Math.max(dif2, dif3));
            System.out.println("Média: " + media3);
            System.out.println("Soma dos valores absolutos: " + somaAbs);
            System.out.println("Maior diferença: " + maiorDif);
            
            
            //questao 9
            double A, B, C, delta, x1r, x2r;
            System.out.print("\nDigite a: ");
            A = entrada.nextDouble();
            System.out.print("Digite b: ");
            B = entrada.nextDouble();
            System.out.print("Digite c: ");
            C = entrada.nextDouble();
            delta = (B * B) - (4 * A * C);
            if (delta < 0) {
                System.out.println("Não existem raízes reais.");
            } else {
                x1r = (-B + Math.sqrt(delta)) / (2 * A);
                x2r = (-B - Math.sqrt(delta)) / (2 * A);
                System.out.println("x1: " + x1r);
                System.out.println("x2: " + x2r);
            }   
            
            //questao 10
            double f, c;
            System.out.print("\nDigite a temperatura em Fahrenheit: ");
            f = entrada.nextDouble();
            c = (f - 32) * 5 / 9;
            System.out.println("Fahrenheit: " + f);
            System.out.println("Celsius: " + c);
        
        
        
    }
    
}
}