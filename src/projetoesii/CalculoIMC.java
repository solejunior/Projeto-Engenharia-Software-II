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
public class CalculoIMC {
    
    private double result=0;
    
       public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    
    public void imcH(Pessoa pessoa){
        
        double altura=pessoa.getAltura();
        double peso = pessoa.getPeso();
        
        result = (peso)/(altura*altura);
        
         if(result>= 17.9 && result <=18.9){
            System.out.println("RISCO BAIXO: \"Homem, Você está abaixo do peso recomendado. \"");
        }else
            if (result >=19 && result <=24.9 ){
                System.out.println(" - IDEAL: \"Homem, Você está muito bem! Continue assim!\" ");
            }else
                if(result >=25 && result <= 27.7){
                    System.out.println("- RISCO MODERADO: \"Homem, Você está acima do peso recomendado. Cuidado!\"");
                }else
                    if
                    (result >27.8){
                        System.out.println("- RISCO ELEVADO: Homem, Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");
    }
        
       
    }
    
    public void imcM(Pessoa pessoa){
        
        double altura=pessoa.getAltura();
        double peso = pessoa.getPeso();
        
        result = (peso)/(altura*altura);
        
         if(result>= 15 && result <=17.9){
            System.out.println("RISCO BAIXO: \" Mulher, Você está abaixo do peso recomendado. \"");
        }else
            if (result >=18 && result <=24.4 ){
                System.out.println("- PESO IDEAL: Mulher, Você está muito bem! Continue assim! ");
            }else
                if(result >=24.5 && result <= 27.2){
                    System.out.println("- RISCO MODERADO: \" Mulher, Você está acima do peso recomendado. Cuidado!\"");
                }else
                    if
                    (result >27.3){
                        System.out.println("- RISCO ELEVADO: Mulher, Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");
    }
        
       
    }
    
    
    
    
    
    
    
    }
        
        
        
       
        
    
 
    

