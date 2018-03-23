package br.utfpr.tdd.ex1;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnalizadorTest {
    
    private Analizador analizador;
    
    @Before
    public void inicializa(){
        this.analizador = new Analizador(this.getAlunos());
    }
    
    @Test
    public void testEncontraMedia(){
        assertEquals(5.827, this.getAnalizador().getMedia(), 0.001);
    }
    
    @Test
    public void testEncontraMenorValor(){
        assertEquals(4.733, this.getAnalizador().getMenorValor(), 0.001);
    }
    
    @Test
    public void testEncontraMaiorValor(){
        assertEquals(6.750, this.getAnalizador().getMaiorValor(), 0.001);
    }
    
    private Analizador getAnalizador(){
        return this.analizador;
    }
    
    private List<Aluno> getAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        Aluno a1 = new Aluno("1234", "aaa bbb");
        a1.setFaltas(0);
        a1.setNotaProjeto(6.0);
        a1.addNotaAtividadePratica(10.0);
        a1.addNotaAtividadePratica(5.0);
        alunos.add(a1); // Nota Final: 6.75

        Aluno a2 = new Aluno("12345", "aaavv bbbvv");
        a2.setFaltas(17);
        a2.setNotaProjeto(1.0);
        a2.addNotaAtividadePratica(10.0);
        a2.addNotaAtividadePratica(5.0);
        a2.setNotaRAA(5.7);
        alunos.add(a2); // Nota Final: 4.73
        
        Aluno a3 = new Aluno("333", "sdd dssdd");
        a3.setFaltas(17);
        a3.setNotaProjeto(2.0);
        a3.addNotaAtividadePratica(10.0);
        a3.addNotaAtividadePratica(5.0);
        a3.setNotaRAA(8.7);
        alunos.add(a3); // Nota Final 6.0
        
        return alunos;
    }
}
