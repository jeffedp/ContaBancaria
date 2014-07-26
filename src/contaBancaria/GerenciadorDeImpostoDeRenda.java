/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contaBancaria;

/**
 *
 * @author i03
 */
class GerenciadorDeImpostoDeRenda {
    private double Total;
    
    void adiciona(Tributavel t){
        System.out.println("Adiciona tributavel t: " + t);
        
        this.Total += t.calculaTributos();
    }
    
    public double getTotal(){
        return this.Total;
    }
}
