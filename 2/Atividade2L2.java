
package atividade2l2;
import java.util.Scanner;

public class Atividade2L2 {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Quantas Formas deseja?");
        int numFormas = scanner.nextInt();
        FormaGeometrica[] formas = new FormaGeometrica[numFormas];
        
        for (int i = 0; i < numFormas; i++) {
            System.out.println("Escolha o tipo de forma (1 - Quadrado, 2 - Retangulo, 3 - Circulo):");
            int escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1:
                    System.out.println("Informe o lado do quadrado");
                    double ladoQuadrado = scanner.nextDouble();
                    formas[i] = new Quadrado(ladoQuadrado);
                    break;
                case 2:
                    System.out.println("Informe a base do retangulo:");
                    double baseRetangulo = scanner.nextDouble();
                    System.out.println("Informe a altura do retangulo");
                    double alturaRetangulo = scanner.nextDouble();
                    formas[i] = new Retangulo(baseRetangulo, alturaRetangulo);
                    break;
                    
                    case 3:
                    System.out.print("Informe o raio do círculo: ");
                    double raioCirculo = scanner.nextDouble();
                    formas[i] = new Circulo(raioCirculo);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    i--; 
            }
        }

        System.out.println("\nPerímetros:");
        for (FormaGeometrica forma : formas) {
            System.out.println("Perímetro: " + forma.calcularPerimetro());
        }

        System.out.println("\nÁreas:");
        for (FormaGeometrica forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }

        scanner.close();
                    
                    
                    
            }
            
        }
        
    

