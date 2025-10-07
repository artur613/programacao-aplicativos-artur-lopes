/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_3_artur_lopes_e_eduardo_amorimm;
import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Atividade_3_artur_lopes_e_eduardo_amorimm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        // Questão 1
        double porcoes, acucar;
        System.out.print("Digite a quantidade de porções desejada: ");
        porcoes = entrada.nextDouble();
        acucar = (200.0 / 8.0) * porcoes;
        System.out.println("Você precisa de " + acucar + " gramas de açúcar.");
        
        // Questão 2
        int impressoras = 3, minutos = 12;
        System.out.print("\nDigite o número de impressoras: ");
        int numImpressoras = entrada.nextInt();
        double tempoNecess = (impressoras * minutos) / (double) numImpressoras;
        System.out.println("Para " + numImpressoras + " impressoras, o tempo necessário é: " + tempoNecess + " minutos.");
        
        // Questão 3
        double distancia, consumo;
        System.out.print("\nDigite a distância em km: ");
        distancia = entrada.nextDouble();
        consumo = (18.0 / 240.0) * distancia;
        System.out.printf("Combustível necessário: %.2f L.%n", consumo);
        
        // Questão 4
        System.out.print("\nDigite o número de máquinas: ");
        int maquinas = entrada.nextInt();
        System.out.print("Digite o valor hora: ");
        int horas = entrada.nextInt();
        double prod = 900 / (6.0 * 5.0);
        double calc = maquinas * horas * prod;
        System.out.println("Resultado com base no número de máquinas e horas inseridas: " + calc);
        
        // Questão 5
        double cotacao, dolares, reais;
        System.out.print("\nDigite a cotação do dólar: ");
        cotacao = entrada.nextDouble();
        System.out.print("Digite a quantia em dólares: ");
        dolares = entrada.nextDouble();
        reais = cotacao * dolares;
        System.out.println("Você precisa de " + reais + " reais.");
        
        // Questão 6
        double a6, b6, x6;
        System.out.print("\nDigite o valor de a: ");
        a6 = entrada.nextDouble();
        System.out.print("Digite o valor de b: ");
        b6 = entrada.nextDouble();
        x6 = -b6 / a6;
        System.out.println("Solução da equação: x = " + x6);
        
        // Questão 7
        double m7, b7, x0, y0;
        System.out.print("\nDigite o valor de m: ");
        m7 = entrada.nextDouble();
        System.out.print("Digite o valor de b: ");
        b7 = entrada.nextDouble();
        System.out.print("Digite o valor de x0: ");
        x0 = entrada.nextDouble();
        y0 = m7 * x0 + b7;
        System.out.println("Resultado: y = " + y0);
        
        // Questão 8
        double x1, y1, x2, y2, m8, b8;
        System.out.print("\nDigite x1: ");
        x1 = entrada.nextDouble();
        System.out.print("Digite y1: ");
        y1 = entrada.nextDouble();
        System.out.print("Digite x2: ");
        x2 = entrada.nextDouble();
        System.out.print("Digite y2: ");
        y2 = entrada.nextDouble();
        m8 = (y2 - y1) / (x2 - x1);
        b8 = y1 - m8 * x1;
        System.out.println("Equação da reta: y = " + m8 + "x + " + b8);
        
        // Questão 9
        double m1, b1, m2, b2, xi, yi;
        System.out.print("\nDigite m1: ");
        m1 = entrada.nextDouble();
        System.out.print("Digite b1: ");
        b1 = entrada.nextDouble();
        System.out.print("Digite m2: ");
        m2 = entrada.nextDouble();
        System.out.print("Digite b2: ");
        b2 = entrada.nextDouble();
        xi = (b2 - b1) / (m1 - m2);
        yi = m1 * xi + b1;
        System.out.println("Ponto de interseção: (" + xi + ", " + yi + ")");
        
        // Questão 10
        double a10, b10, c10, delta, x10_1, x10_2;
        System.out.print("\nDigite a, b e c da equação do 2º grau: ");
        a10 = entrada.nextDouble();
        b10 = entrada.nextDouble();
        c10 = entrada.nextDouble();
        delta = Math.pow(b10, 2) - (4 * a10 * c10);
        x10_1 = (-b10 + Math.sqrt(delta)) / (2 * a10);
        x10_2 = (-b10 - Math.sqrt(delta)) / (2 * a10);
        System.out.println("x1 = " + x10_1);
        System.out.println("x2 = " + x10_2);
        
        // Questão 11
        if (delta >= 0) {
            double dist = Math.abs(Math.sqrt(delta) / a10);
            System.out.println("Distância entre as raízes: " + dist);
        }
        
        // Questão 12
        double xq, fx, fpx;
        System.out.print("\nDigite um valor para x0: ");
        xq = entrada.nextDouble();
        fx = a10 * Math.pow(xq, 2) + b10 * xq + c10;
        fpx = 2 * a10 * xq + b10;
        System.out.println("f(x0) = " + fx);
        System.out.println("f'(x0) = " + fpx);
        
        // Questão 13
        double m13, b13, xa, xb, yxa, yxb, area;
        System.out.print("\nDigite m: ");
        m13 = entrada.nextDouble();
        System.out.print("Digite b: ");
        b13 = entrada.nextDouble();
        System.out.print("Digite x1: ");
        xa = entrada.nextDouble();
        System.out.print("Digite x2: ");
        xb = entrada.nextDouble();
        yxa = m13 * xa + b13;
        yxb = m13 * xb + b13;
        area = ((yxa + yxb) / 2) * (xb - xa);
        System.out.println("Área sob a reta: " + area);

        entrada.close();
    }
}
    
    

