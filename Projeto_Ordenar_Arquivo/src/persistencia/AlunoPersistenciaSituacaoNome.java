/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Aluno;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Giu
 */
public abstract class AlunoPersistenciaSituacaoNome {
    //Atributos
    private String nomeDoArquivo;
    //Metodos
    public AlunoPersistenciaSituacaoNome(String situacao, String nome){
        nomeDoArquivo = situacao;
    }
    //Metodo abstrato que ira compor o algoritmo de ordenacao da listagem
    public abstract boolean ePrimeiro(Aluno aluno1, Aluno aluno2);
    
    
    public ArrayList<Aluno> listagemDeAlunosSituacaoNome()throws Exception{
        try{
            ArrayList<Aluno> array = new ArrayList<Aluno>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                Aluno aux = new Aluno(linha);
                array.add(aux);
                pos++;
            }
            br.close();
            //algoritmo de Ordenação
            for (int i = 0; i < array.size(); i++) {
                for (int j = i; j < array.size(); j++) {
                    
                    if (!ePrimeiro(array.get(i),array.get(j))) {    
                        Aluno temp = array.get(j);
                        array.set(j, array.get(i));
                        array.set(i, temp);
                    }
                }
            }
            return array;
        }catch(Exception erro){
            throw erro;
        } 
    }
    
}
