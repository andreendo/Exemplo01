
package br.utfpr.tdd.ex1;

import java.util.List;


public class Analizador {

    private List<Aluno> alunos;
    
    public Analizador(List<Aluno> alunos) {
      this.alunos = alunos;
    }

    public double getMedia() {
        double media = 0;
        for(Aluno aluno : this.getAlunos()){
            media += aluno.getNF();
        }
        return media / this.getAlunos().size();
    }
    
    public List<Aluno> getAlunos(){
        return this.alunos;
    }

    public double getMenorValor() {
       double menor = Double.MAX_VALUE;
       for(Aluno aluno : this.getAlunos()){
           if(menor > aluno.getNF()){
               menor = aluno.getNF();
           }
        }
       
       return menor;
    }
    
    public double getMaiorValor() {
       double maior = Double.MIN_VALUE;
       for(Aluno aluno : this.getAlunos()){
           if(maior < aluno.getNF()){
                maior = aluno.getNF();
           }
        }
       
       return maior;
    }
}
