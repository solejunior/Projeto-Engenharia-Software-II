package Testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class TesteMulher {
    
    
        
        @Test
        public void TestProjetoESII (){
        
        Pessoa bruna = new Pessoa();
        bruna.setAltura(1.65);
        bruna.setPeso(52);
        CalculoIMC alo = new CalculoIMC();
        double resultado = alo.imcM(bruna);
 
        Assert.assertEquals(null, 20.0, resultado);
        
            
        }
        
        
        
        
            
    }
    
