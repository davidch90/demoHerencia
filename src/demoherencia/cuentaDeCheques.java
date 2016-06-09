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
public class cuentaDeCheques {
private int numeroDecuenta;
private String cliente;
private double saldo;
private final int contador;

public cuentaDeCheques ( int numeroDecuenta){
    this.numeroDecuenta = numeroDecuenta;
    this.saldo = 3000.0;
    this.contador = 0;
}
private void numeroDecuenta( int numeroDecuenta){
    this.numeroDecuenta = numeroDecuenta;
}
private void cliente(String cliente){
    this.cliente = cliente;
}
    public void Depositar(double cantidad){
        if (this.puedeDepositar(cantidad)){
            this.saldo = saldo + cantidad;
        }
    
    else{
    System.out.println("no se puede hacr el deposito.");
        }
    
}
    public void Retirar (double cantidad){
        if (this.puedeDepositar(cantidad)){
            this.saldo = saldo + cantidad;
        }
    
    else {
    System.out.println("no se puede hacer el retiro, se le va acobrar $100.0");
    this.saldo = - 100;
        }
}
    public boolean puededDepositar (double cantidad){
        boolean sipuedeDepositar = false;
        if (cantidad > 0 ){
            sipuedeDepositar = true;
        }
        
    return sipuedeDepositar;
}
    public boolean sipuedeRetirar ( double cantidad){
        boolean sipuedeRetirar = false;
        if (cantidad < this. saldo){
            sipuedeRetirar = true;
        }
        return sipuedeRetirar;
    }
    public double getsaldo(){
        return this.saldo;
    }

    private boolean puedeDepositar(double cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
