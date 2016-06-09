/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

/**
 *
 * @author DAVID
 */
public class cuentaDeAhorro {
    private int numeroDecuenta;
    private String cliente;
     private final double tasaDeInteres;
    private final double comisionPorSaldo;
    private double saldo;
    
    public cuentaDeAhorro(int numeroDecuenta, String cliente){
       this.cliente = cliente;
       this.numeroDecuenta = numeroDecuenta;
      
        this.saldo = 80.00;
        this.tasaDeInteres = .25;
        this.comisionPorSaldo = 50;
        
    }
    
    private void numeroDecuenta(int numeroDecuenta){
        this.numeroDecuenta = numeroDecuenta;
    }
    
    private void cliente(String cliente){
        this.cliente = cliente;
    }
    
    public void Depositar(double cantidad){
        if (this.puedeDepositar(cantidad)){
            this.saldo = saldo + cantidad;
        }
        else {
            System.out.println("No se puede hacer el deposito.");
        }
    }
    
    public void Retirar(double cantidad){
        if (this.puedeRetirar(cantidad)){
            this.saldo = saldo - cantidad;
        }
        else {
            System.out.println("No se puede hacer el retiro.");
        }
    }
    
    public boolean puedeDepositar(double cantidad){
        boolean siPuedeDepositar = false;
        if (cantidad > 0) {
            siPuedeDepositar = true;
        }
        return siPuedeDepositar;
    }
    
    public boolean puedeRetirar(double cantidad){
        boolean siPuedeRetirar = false;
        if (cantidad < this.saldo){
            siPuedeRetirar = true;
        }
        return siPuedeRetirar;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double calcularInteres(){
        double InteresTotal = 0;
        InteresTotal  = ( (saldo * this.tasaDeInteres) /100 );
        return InteresTotal;
    }
    
    public double comisionPorSaldo(){
        double comision = 0;
        if (saldo < 1000){
            comision = 50;
        }
        else{
            comision = 0;
        }
        return comision;
    }
    
    public void corteMensual(){
        this.saldo = (saldo + this.calcularInteres()) - this.comisionPorSaldo();
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
