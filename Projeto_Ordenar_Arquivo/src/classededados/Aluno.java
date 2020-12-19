/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

/**
 *
 * @author Giu
 */
public class Aluno {
    
    //Atributos
    private String nome;
    private String curso;
    private String situacao;
    private String enfase;
    //Metodos
    public Aluno(String nome, String curso, String situacao, String enfase){
        this.nome = nome;
        this.curso = curso;
        this.situacao = situacao;
        this.enfase = enfase;
    }
    public Aluno(String str){
        String[] vetor = str.split(";");
        this.nome = vetor[0];
        this.curso = vetor[1];
        this.situacao = vetor[2];
        this.enfase = vetor[3];
    }


    /*****************/
    // GETS
    public String getNome() {
        return nome;
    }
    
    
    public String getCurso() {
        return curso;
    }
    
    public String getSituacao() {
        return situacao;
    }
    
    public String getEnfase() {
        return enfase;
    }

    /*****************/
    // SETS
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void setCurso(String curso) {
        this.nome = curso;
    }
    
    public void setSituacao(String situacao) {
        this.nome = situacao;
    }
    
    public void setEnfase(String enfase) {
        this.nome = enfase;
    }
    
    /*
    public static void SobreNome(ArrayList<String> players) {
    for (int i = 0; i < players.size(); i++)
     System.out.println(players.get(i).split(" ")[1]);
    }
    */
    
}
