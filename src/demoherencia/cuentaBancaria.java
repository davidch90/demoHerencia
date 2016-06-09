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
public class cuentaBancaria {
    private final int numeroDecuenta;
    private String cliente;
    private double saldo;
    
    public cuentaBancaria ( int numeroDecuenta,String cliente){
        this.cliente = cliente;
        this.numeroDecuenta = numeroDecuenta;
        this.saldo = 0;
    }

    cuentaBancaria(int numeroDecuenta, cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void cliente(String cliente){
        this.cliente = cliente;
    }
    public void depositar(double cantidad){
        if (this.puedeDepositar(cantidad)){
            this.saldo = saldo + cantidad;
        }
        else{ System.out.println(" no se realizar el depocito. ");
        
    }
    }
        public void Retirar(double cantidad ){
            if (this.puedeRetirar(cantidad)){
            this.saldo = saldo - cantidad;
        }
            else { System.out.println(" retiro no autorizado.");
            
        }
        }
            public boolean puedeDepositar( double cantidad){
                boolean siPuedeDepositar = false;
                if ( cantidad > 0){
                    siPuedeDepositar = true;
                }
                return siPuedeDepositar;
            }
            public boolean puedeRetirar (double cantidad){
                boolean siPuedeDepositar = false;
                if ( cantidad > 0){
                    siPuedeDepositar = true;
                }
                return siPuedeDepositar;
            }
            public double getsaldo(){
                return this.saldo;
            }

     
}
