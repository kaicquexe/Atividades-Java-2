
package atividade4l2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroAluno {
    private List<Aluno> listaAlunos;

    public CadastroAluno() {
        this.listaAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void ordenarPorMatricula() {
        Collections.sort(listaAlunos, (a1, a2) -> Integer.compare(a1.getMatricula(), a2.getMatricula()));
    }

    public void imprimirLista() {
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }
}
