/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoesii;

/**
 *
 * @author solejunior
 */
public class ProjetoESII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa joao = new Pessoa();
        joao.setAltura(1.92);
        joao.setNome("joao");
        joao.setPeso(102);
        
        CalculoIMC oi = new CalculoIMC();
        oi.imcH(joao);
        oi.resultadoHomem();
        
        
        
        Pessoa bruna = new Pessoa();
        bruna.setAltura(1.65);
        bruna.setNome("Bruna");
        bruna.setPeso(52);
        
        CalculoIMC alo = new CalculoIMC();
        alo.imcM(bruna);
        alo.resultadoMulher();
        
        
        
       
        
        
    }
    
}
