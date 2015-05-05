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
    
    
    public double imcH(Pessoa pessoa){
        
        double altura=pessoa.getAltura();
        double peso = pessoa.getPeso();

        result = Math.ceil((peso)/(altura*altura));
       
           System.out.println(result);
         return result;
       
    }
    
   
        
        public void resultadoHomem(){
        
         if(result>= 17.9 && result <=18.9){
            System.out.println("RISCO BAIXO, IMC= "+result+" \"Homem, Você está abaixo do peso recomendado. \"");
        }else
            if (result >=19 && result <=24.9 ){
                System.out.println(" - IDEAL: IMC= "+result+" \"Homem, Você está muito bem! Continue assim!\" ");
            }else
                if(result >=25 && result <= 27.7){
                    System.out.println("- RISCO MODERADO: IMC= "+result+" \"Homem, Você está acima do peso recomendado. Cuidado!\"");
                }else
                    if
                    (result >27.8){
                        System.out.println("- RISCO ELEVADO: IMC= "+result+", Homem, Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");
    }
        
       
    }
    
    public double imcM(Pessoa pessoa){
        
        double altura=pessoa.getAltura();
        double peso = pessoa.getPeso();
        
        result = Math.ceil((peso)/(altura*altura));
       
        System.out.println(result);
         return result;
    }
    
    public void resultadoMulher(){
        
         if(result>= 15 && result <=17.9){
            System.out.println("RISCO BAIXO: IMC= "+result+", \" Mulher, Você está abaixo do peso recomendado. \"");
        }else
            if (result >=18 && result <=24.4 ){
                System.out.println("- PESO IDEAL: IMC= "+result+", Mulher, Você está muito bem! Continue assim! ");
            }else
                if(result >=24.5 && result <= 27.2){
                    System.out.println("- RISCO MODERADO: IMC= "+result+",  \" Mulher, Você está acima do peso recomendado. Cuidado!\"");
                }else
                    if
                    (result >27.3){
                        System.out.println("- RISCO ELEVADO: IMC= "+result+", Mulher, Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");
    }
        
       
    }
    
    
    
    
    
    
    
    }
        
        
        
       
        
    
 
    

