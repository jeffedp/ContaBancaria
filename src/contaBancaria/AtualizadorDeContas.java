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
public class AtualizadorDeContas {
    private double saldoTotal=0;
    private double selic;
    
    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    
    public void roda(Conta c){
        System.out.println("Saldo Anterior:" + c.getSaldo());
        System.out.println("teste");
        c.atualiza(this.selic);
        System.out.println("Saldo Final:" + c.getSaldo());
        saldoTotal += c.getSaldo();
    }
    
    public double getSaldoTotal(){
        return this.saldoTotal;
    }
    
    public void setSaltoTotal(double saldoTotal){
        this.saldoTotal += saldoTotal;
    }
    
}
