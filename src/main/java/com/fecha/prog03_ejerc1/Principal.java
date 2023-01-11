/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.fecha.prog03_ejerc1;

/**
 *
 * @author LunaEstudios
 */
public class Principal {

    public static void main(String[] args) {

        System.out.println("Primera fecha, inicializada con el primer constructor");
        //instanciar un objeto de la clase Fecha

        Fecha objFecha1 = new Fecha(Fecha.enumMes.MAYO);
        //Actualizar atributos
        objFecha1.setDia(20);
        objFecha1.setAnio(2001);
        //Mostrar la fecha
        System.out.println(objFecha1.toString());
        //Mostrar si es verano
        System.out.println(objFecha1.isSummer()? "es verano" :"No es verano");
        
        System.out.println("---------------------------------------------------------------");
       
        System.out.println("Segunda fecha, inicializada con el segundo constructor");
        //Instanciar objeto
        Fecha objFecha2 = new Fecha(16, Fecha.enumMes.AGOSTO, 2011);
        //Mostrar año
        System.out.println("La fecha2 contiene el año " + objFecha2.getAnio());
        //Mostrar fecha
        System.out.println(objFecha2.toString());

        //Mostrar si es verano
         System.out.println(objFecha2.isSummer()? "Es verano" :"No es verano");
        
    }
    
    
    
}
