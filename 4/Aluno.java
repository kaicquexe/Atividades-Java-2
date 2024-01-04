
package atividade4l2;


public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private double ira;
    
    public Aluno(int matricula, String nome, String curso, double ira){
    this.matricula = matricula;
    this.nome = nome;
    this.curso = curso;
    this.ira = ira;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public String toString(){
    return "Matricula:" + matricula + ", Nome:" + nome + ",IRA:" + ira + ",Curso" + curso;
    }
}