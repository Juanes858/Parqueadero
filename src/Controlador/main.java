/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.Scanner;
import Clases.Parqueadero;
import Clases.Trabajador;
import Clases.Usuario;



/**
 *
 * @author Juan Esteban Acosta 
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Usuario> usuariosVacio = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Parqueadero parqueaderoO = new Parqueadero();
        parqueaderoO.setCapMaxVehiculos("500");
        parqueaderoO.setNombreParqueadero("parqueadero la 22");
        parqueaderoO.setNumeroTelefonico("123");
        parqueaderoO.setUsuarios(usuariosVacio);
    
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Diego");
        trabajador.setApellido("Rodriguez");
        trabajador.setEdad("23");
        trabajador.setTelefono("123");
        
        
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        while(opcion != 4){
            System.out.println("BIENVENIDO AL PARQUEADERO: "+parqueaderoO.getNombreParqueadero()
            + "\nEste parqueadero cuenta con una capacidad maxima de: " + parqueaderoO.getCapMaxVehiculos() + " vehiculos"
            + "\nEl numero telefonico del parqueadero es: " + parqueaderoO.getNumeroTelefonico());
            
            System.out.println("\nSeleccione la opcion que desea realizar: "
                    + "\n1. Ingresar vehiculo"
                    + "\n2. Sacar vehiculo"
                    + "\n3. ver lista de vehiculos"
                    + "\n4. Salir");
            
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    Usuario usuario = new Usuario();
                    usuario.pedirDatosEntrada();
                    usuarios.add(usuario);
                    parqueaderoO.setUsuarios(usuarios);
                    break;
                case 2:
                    String placa;
                    String horaSalida;
                    System.out.println("Digite la placa de su vehiculo: ");
                    placa = sc.next();
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).getPlaca().equalsIgnoreCase(placa)) {
                            System.out.println("Digite la hora de salida: ");
                            horaSalida = sc.next();
                            usuarios.get(i).setHoraSalida(horaSalida);
                            System.out.println("...Salida del parqueadero exitosa");
                            usuarios.get(i).mostrarDatos();
                            System.out.println("\n=================================");
                            System.out.println("DATOS DEL TRABAJADOR QUE RECIBE"
                                    + "\nNombre y apellido: "+trabajador.getNombre()+" "+trabajador.getApellido()
                                    + "\nTelefono: "+trabajador.getTelefono()
                                    + "\nRecibio a las "+usuarios.get(i).getHoraEntrada()+" entrego a las "+usuarios.get(i).getHoraSalida());
                        }
                    }
                    break;
                case 3:
                    for(Usuario usuarioO:usuarios){
                    usuarioO.mostrarDatos();
                    }
                    break;
                case 4:
                    System.out.println("HA SALIDO CON EXITO DEL PROGRAMA");
                    break;
                }
            }
        }
    }