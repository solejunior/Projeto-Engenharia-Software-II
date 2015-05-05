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
public class Pessoa {
    
    private double altura;
    private double peso;
    private String nome;
    private String sexo;

    public Pessoa(double altura, double peso, String nome) {
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
    }
    
    public Pessoa(){
        
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
