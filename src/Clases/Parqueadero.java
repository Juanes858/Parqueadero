/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Juan Esteban Acosta
 */
public class Parqueadero {

    /**
     * @return the usuarios
     */
    
    private String nombreParqueadero;
    private String numeroTelefonico;
    private String capMaxVehiculos;
    private ArrayList<Usuario> usuarios;

    public Parqueadero() {
    }

    public Parqueadero(String nombreParqueadero, String numeroTelefonico, String capMaxVehiculos, ArrayList<Usuario> usuarios) {
        this.nombreParqueadero = nombreParqueadero;
        this.numeroTelefonico = numeroTelefonico;
        this.capMaxVehiculos = capMaxVehiculos;
        this.usuarios = usuarios;
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    /**
     * @return the nombreParqueadero
     */
    public String getNombreParqueadero() {
        return nombreParqueadero;
    }

    /**
     * @param nombreParqueadero the nombreParqueadero to set
     */
    public void setNombreParqueadero(String nombreParqueadero) {
        this.nombreParqueadero = nombreParqueadero;
    }

    /**
     * @return the numeroTelefonico
     */
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    /**
     * @param numeroTelefonico the numeroTelefonico to set
     */
    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    /**
     * @return the capMaxVehiculos
     */
    public String getCapMaxVehiculos() {
        return capMaxVehiculos;
    }

    /**
     * @param capMaxVehiculos the capMaxVehiculos to set
     */
    public void setCapMaxVehiculos(String capMaxVehiculos) {
        this.capMaxVehiculos = capMaxVehiculos;
    }

    public void mostrarUsuarios(){
        
    }
}
