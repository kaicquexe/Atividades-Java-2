
package atividade4l2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
   
    public static void main(String[] args) {
        Map<Integer, Aluno> mapaAlunos = new HashMap<>();

        Aluno aluno1 = new Aluno("João", 12345);
        Aluno aluno2 = new Aluno("Maria", 67890);
        Aluno aluno3 = new Aluno("Pedro", 54321);
        Aluno aluno4 = new Aluno("Ana", 98765);
        Aluno aluno5 = new Aluno("Lucas", 11111);

        mapaAlunos.put(aluno1.getMatricula(), aluno1);
        mapaAlunos.put(aluno2.getMatricula(), aluno2);
        mapaAlunos.put(aluno3.getMatricula(), aluno3);
        mapaAlunos.put(aluno4.getMatricula(), aluno4);
        mapaAlunos.put(aluno5.getMatricula(), aluno5);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a matrícula do aluno: ");
            int matriculaDigitada = scanner.nextInt();
            
            Aluno alunoBuscado = mapaAlunos.get(matriculaDigitada);
            
            if (alunoBuscado != null) {
                System.out.println("Nome: " + alunoBuscado.getNome());
                System.out.println("Matrícula: " + alunoBuscado.getMatricula());
            } else {
                System.out.println("Aluno não encontrado!");
            }
        }
    }
    
}
