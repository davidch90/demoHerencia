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
public class cliente {
    private String nombre;
    private String apellido;
    private String fechaDenacimiento;
    private String direccion;
    private String ocupacion;
    private String telefono;
    private String email;
    
    cliente( String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDenacimiento = "AA/MM/DD";
        this.direccion= "no indentificada";
        this.ocupacion = " no indentificada";
        this.telefono = "(000) 000-0000";
        this.email = " ingrese su correo ";
    }
    //getter
    public String getnombre(){
        return nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public String getfechaDenacimiento(){
        return fechaDenacimiento;
        
    }
    public String getdirreccion(){
        return direccion;
    }
    public String ocupacion(){
        return ocupacion;
    }
    public String gettelefono(){
        return telefono;
    }
    public String getemail(){
        return email;
    }
    //setter
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setapellido(String apellido){
        this.apellido = apellido;
    }
    public void setfechaDenacimiento(String fechaDenacimiento){
        this.fechaDenacimiento = fechaDenacimiento;
    }
    public void setdirrecion(String dirrecion){
        this.direccion = dirrecion;
    }
    public void setocupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    public void settelefono(String telefono){
        this.telefono = telefono;
    }
    public void setemali(String email){
        this.email = email;
    }

    String getocupacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getdireccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
    
    
    
}
