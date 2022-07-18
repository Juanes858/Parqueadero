/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Juan Esteban aCosta
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String placa;
    private String horaEntrada;
    private String horaSalida;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String placa, String horaEntrada, String horaSalida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.placa = placa;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the horaEntrada
     */
    public String getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * @param horaEntrada the horaEntrada to set
     */
    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    /**
     * @return the horaSalida
     */
    public String getHoraSalida() {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    public void pedirDatosEntrada(){
        String nombre;
        String apellido;
        String placa;
        String horaEntrada;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("POR FAVOR INGRESE SUS DATOS");
        System.out.println("Nombre: ");
        nombre = sc.next();
        System.out.println("Apellido: ");
        apellido = sc.next();
        System.out.println("Placa del vehiculo: ");
        placa = sc.next();
        System.out.println("Digite la hora en la que ingresa (hh/mm): ");
        horaEntrada = sc.next();
        System.out.println(".... Ha ingresado el vehiculo exitosamente");
        
        this.setApellido(apellido);
        this.setHoraEntrada(horaEntrada);
        this.setNombre(nombre);
        this.setPlaca(placa);
    }
    
    public void pedirDatosSalida(){
        
    }
    
    public void mostrarDatos(){
        String nombre = getNombre();
        String apellido = getApellido();
        String placa = getPlaca();
        String horaEntrada = getHoraEntrada();
        
        System.out.println("DATOS DEL USUARIO");
        System.out.println("nombre y apellido: "+nombre+" "+apellido
                            + "\nPlaca: "+placa
                            + "\nHora de entrada: "+horaEntrada);
    }
}