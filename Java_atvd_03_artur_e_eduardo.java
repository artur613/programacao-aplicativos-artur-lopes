/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_atvd_03_artur_e_eduardo;

import java.util.Scanner;
import java.lang.Math; 


/**
 *
 * @author Aluno
 */
public class Java_atvd_03_artur_e_eduardo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
            
            //questao 1
            double porcoes, acucar;
            System.out.print("digite a quantidade de porcoes desejada:");
            porcoes = entrada.nextDouble();
            acucar = (200.0 / 8.0)* porcoes;
            System.out.println("voce precisa de "+ acucar+"gramas de acucar");
        
            int impressoras = 3, minutos = 12;
         
            System.out.print("Digite o numero de impressoreas");
            int numImpressoras = entrada.nextInt();
        
            double tempoNecess = (impressoras * minutos) / (double) numImpressoras;
            System.out.println("Para "+ numImpressoras +" impressoras, o tempo necessario e:"+ minutos+"minutos.");
            
            //Questao 3
         
            double distancia, consumo;
         
            System.out.print("Digite a distancia em km:");
            distancia = entrada.nextDouble();
         
            consumo = (18.0 / 240.0) * distancia;
            System.out.printf("Combustivel necessario: %.2f L.%n", consumo );
           
            //questao 4 
            System.out.print("didgite o numero de maquinas:");
            int m, h ;
            m = entrada.nextInt();
            System.out.print("digite o valor hora:");
            h = entrada.nextInt();
            
            double calc, prod ;
            prod = 900/ (6 * 5);
            calc = m * h * prod;
                    
            System.out.print("Resultado com base no numero de maquinas e horas inseridas:" + calc);
            
            // Questão 5 
            double cotacao, dolares, reais;
            System.out.print("\nDigite a cotação do dólar: ");
            cotacao = entrada.nextDouble();
            System.out.print("Digite a quantia em dólares: ");
            dolares = entrada.nextDouble();
            reais = cotacao * dolares;
            System.out.println("Você precisa de " + reais + " reais.");
            
            // Questão 6 
            double a, b, x;
            System.out.print("\nDigite o valor de a: ");
            a = entrada.nextDouble();
            System.out.print("Digite o valor de b: ");
            b = entrada.nextDouble();
            x = -b / a;
            System.out.println("Solução da equação: x = " + x);
            
            // Questão 7
            double m, b, x0, y0;
            System.out.print("\nDigite o valor de m: ");
            m = entrada.nextDouble();
            System.out.print("Digite o valor de b: ");
            b = entrada.nextDouble();
            System.out.print("Digite o valor de x0: ");
            x0 = entrada.nextDouble();
            y0 = m * x0 + b;
            
            System.out.println("Resultado: y = " + y0);
            
            // Questão 8 
            double x1, y1, x2, y2;
            System.out.print("\nDigite x1: ");
            x1 = entrada.nextDouble();
            System.out.print("Digite y1: ");
            y1 = entrada.nextDouble();
            System.out.print("Digite x2: ");
            x2 = entrada.nextDouble();
            System.out.print("Digite y2: ");
            y2 = entrada.nextDouble();
            m = (y2 - y1) / (x2 - x1);
            b = y1 - m * x1;
            System.out.println("Equação da reta: y = " + m + "x + " + b);
            
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
            
            //questao 10 
            
            double a, b, c, x1, x2, delta;
            a= entrada.nextInt();
            b= entrada.nextInt();
            c= entrada.nextInt();
            delta = (Math.pow(b,2)-(4 * a * c);
            x1 = (-b + Math.sqrt(delta)/(2 * a);
            x2 = (-b - Math.sqrt(delta)/(2 * a);
            
            System.out.print(" valor de x1;"+ x1);
            System.out.print("valor de x2:"+ x2);    
            
            // Questão 11 
            if (delta >= 0) {
                double dist = Math.abs(Math.sqrt(delta) / A);
                System.out.println("Distância entre as raízes: " + dist);
            }
            
            // Questão 12
            double xq, fx, fpx;
            System.out.print("\nDigite um valor para x0: ");
            xq = entrada.nextDouble();
            fx = A * Math.pow(xq, 2) + B * xq + C;
            fpx = 2 * A * xq + B;
            System.out.println("f(x0) = " + fx);
            System.out.println("f'(x0) = " + fpx);
            
            // Questão 13 
            double xa, xb, yxa, yxb, area;
            System.out.print("\nDigite m: ");
            m = entrada.nextDouble();
            System.out.print("Digite b: ");
            b = entrada.nextDouble();
            System.out.print("Digite x1: ");
            xa = entrada.nextDouble();
            System.out.print("Digite x2: ");
            xb = entrada.nextDouble();
            yxa = m * xa + b;
            yxb = m * xb + b;
            area = ((yxa + yxb) / 2) * (xb - xa);
            System.out.println("Área sob a reta: " + area);
        }
    }
    

