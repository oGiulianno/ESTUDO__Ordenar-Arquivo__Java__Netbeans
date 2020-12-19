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
public class OrdenarPorSobreNome extends AlunoPersistenciaSobreNome{
    
    public OrdenarPorSobreNome(String nome) {
        super(nome);
    }
    @Override
    public boolean ePrimeiro(Aluno aluno1, Aluno aluno2){
         
        
        /***************/
        /*if((aluno1.getNome().split("\\w+").length>1) || (aluno2.getNome().split("\\w+").length>1))  return true;
            //aluno1.getNome().substring(aluno1.getNome().lastIndexOf(" ")+1).compareToIgnoreCase(aluno2.getNome().substring(aluno2.getNome().lastIndexOf(" ")+1)) <= 0) return true;
        else return false;
        */
        
        
        /***************/
        if(aluno1.getNome().substring(aluno1.getNome().replaceAll("Filho", "").replaceAll("Junior", "").lastIndexOf(" ")+1).compareToIgnoreCase(aluno2.getNome().substring(aluno2.getNome().replaceAll("Filho", "").replaceAll("Junior", "").lastIndexOf(" ")+1)) <= 0) return true;
        
        else return false;
    }
       
        
        /***************/
        //if(((aluno1.getNome().split("\\w+").length>1)) && ((aluno2.getNome().split("\\w+").length>1))) return true;
        //else return false;
            
        
}
    
      //  if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0) return true;
      //  else return false;
      //}

      //UserFullName.substring(firstSpace).trim();

