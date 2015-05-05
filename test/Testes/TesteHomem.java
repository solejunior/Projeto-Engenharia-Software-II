/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projetoesii.CalculoIMC;
import projetoesii.Pessoa;

/**
 *
 * @author solejunior
 */
public class TesteHomem {
    
    @Test
   public void TestHomem(){
    Pessoa joao = new Pessoa();
    joao.setAltura(1.92);
    joao.setNome("joao");
    joao.setPeso(102);
        
    CalculoIMC oi = new CalculoIMC();
    double resultado = oi.imcH(joao);
    
    Assert.assertEquals(28.0, resultado);
   }
}
