/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Aluno;

/**
 *
 * @author Giu
 */
public class OrdenarPorSituacaoCursoNome extends AlunoPersistenciaSituacaoCursoNome{
    
    public OrdenarPorSituacaoCursoNome(String situacao, String curso,String nome) {
        super(situacao,curso,nome);
    }
    @Override
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2){
        if(aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) < 0) return true;
        //if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) > 0) return false;
        //if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) > 0) return false;
        else{
        if(aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) > 0) return false;
        else if((aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) < 0)) return true;
        else if((aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) > 0)) return false;
        else if((aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0)) return true;
        else return false;
        }
    }
}
