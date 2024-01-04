

package atividade4l2;

import java.util.Scanner;

public class Atividade4L2 {

    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite os dados do aluno " + i + ":");
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("IRA: ");
            double ira = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Curso: ");
            String curso = scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome, curso, ira);
            cadastro.adicionarAluno(aluno);
        }

        cadastro.ordenarPorMatricula();
        System.out.println("\nLista de Alunos Ordenada por Matrícula:");
        cadastro.imprimirLista();

        scanner.close();
    }
    }

