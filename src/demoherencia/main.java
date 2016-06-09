/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;
import java.util.Scanner;


/**
 *
 * @author DAVID
 */
public class main {

    /**
     * @param args the command line arguments
     * @param numeroDecuenta
     */
    public static void main(String[] args, int numeroDecuenta) {
        
            
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CUENTA A LA QUE DESEA ACCEDER");
            System.out.println("B = CUENTA BANCARIA.");
            System.out.println("A = CUENTA DE AHORRO.");
            System.out.println("C = CUENTA DE CHEQUES.");
            int cuenta = entrada.nextInt();
        
        if (cuenta == 1){    
        System.out.println("MENCIONE EL NUMERO DE CUENTA.");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("MENCIONE EL NOMBRE DEL CLIENTE.");
        String nombre = entrada.next();
        System.out.println("MENCIONE APELLIDO DEL CLIENTE.");
        String apellido = entrada.next();
        cliente cliente = new cliente(nombre, apellido);
        
        cuentaBancaria cuentaBancaria;
            cuentaBancaria = new cuentaBancaria(numeroDecuenta, cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("TRAMITE A REALIZAR.");
            System.out.println("100 = INTRODUSCA SUS DATOS PERSONALES.");
            System.out.println("101 = PROPORCIONE LOS DATOS DEL CLIENTE.");
            System.out.println("102 = DEPOSITAR.");
            System.out.println("103 = RETIRAR.");
            System.out.println("104 = TERMINAR TRANSACCION.");
            int accion = entrada.nextInt();
            
            if (accion == 1){
                System.out.println("*PROPORCIONAR SU FECHA DE NACIMIENTO*.");
                String fechaDenacimiento;
                fechaDenacimiento = entrada.nextLine();
                fechaDenacimiento = entrada.nextLine();
                
                System.out.println("*PROPOCIONAR SU DIRECCION*.");
                String direccion = entrada.nextLine();
               
                System.out.println("*PROPORCIONAR SU OCUPACION*.");
                String ocupacion= entrada.nextLine();
                
                System.out.println("*PROPORIONAR SU NUMERO DE TELEFONO*.");
                String telefono= entrada.nextLine();
                
                System.out.println("*PROPORCIONAR SU CORREO ELECTRONICO*.");
                String email;
                email = entrada.nextLine();
                
                
                cliente.setfechaDenacimiento ( fechaDenacimiento);
                cliente.setdirrecion(direccion);
                cliente.setocupacion(ocupacion);
                cliente.settelefono(telefono);
                cliente.setemali(email);
            }
            
            if (accion == 2){
                System.out.println("*NUMERO DE CUENTA:*. " 
                        +cuentaBancaria.getnumeroDecuenta());
                System.out.println("*NOMBRE DEL CLIENTE:*. " 
                        +cliente.getnombre());
                System.out.println("*APELLIDO DEL CLIENTE:*. " 
                        +cliente.getapellido());
                System.out.println("*FECHA DE NACIMIENTO DEL CLIENTE:*."
                        +cliente.getfechaDenacimiento());
                System.out.println("*DIRECCION DEL CLIENTE:*. " 
                        +cliente.getdireccion());
                System.out.println("*LA OCUPACION DEL CLIENTE:*" 
                        +cliente.getocupacion());
                System.out.println("*NUMERO DE TELEFONO DEL CLIENTE:*. "
                        +cliente.gettelefono());
                System.out.println("*CORREO ELECTRONICO:*. "
                        +cliente.getemail());
            }
            
            if (accion == 3){
                System.out.println("EFECTIVO A DEPOSITAR.");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.depositar(cantidad);
            }
            if (accion == 4){
                System.out.println("RETIRO A REALIZAR.");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Retirar(cantidad);
            }
            if (accion == 5){
                System.out.println("PROCESO CONCLUIDO.");
                contador = 1;
            }
            double saldo = cuentaBancaria.getsaldo();
            System.out.println(+saldo);
            }   
        }
        else {
            System.out.println("NO DISPONIBLE.");}
    }
}
        
    
