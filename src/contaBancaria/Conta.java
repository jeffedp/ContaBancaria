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
public class Conta {
    protected double saldo;
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void deposita(double vlr_deposita){
        this.saldo += vlr_deposita;
    }
    
    public void sacar(double vlr_saca){
        this.saldo -= vlr_saca;
    }
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }
}
