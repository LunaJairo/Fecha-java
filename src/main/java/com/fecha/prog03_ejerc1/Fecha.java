/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fecha.prog03_ejerc1;

/**
 *
 * @author LunaEstudios
 */
public class Fecha {
//enum meses del mes
    enum enumMes {
        ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE

    }

    private int dia;
    private enumMes mes;
    private int anio;

    public Fecha(enumMes mes) {
        this.mes = mes;
        this.dia = 0;
        this.anio =0;
    }

    public Fecha(int dia, enumMes mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
//devuelve el día
    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public enumMes getMes() {
        return this.mes;
    }

    public void setMes(enumMes mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
 //inicia el 20 de junio y finaliza el 21 de septiembre.
    public boolean isSummer() {
       

        return (mes == enumMes.JULIO || mes == enumMes.AGOSTO)
                || (mes == enumMes.SEPTIEMBRE && dia <= 21)
                || (enumMes.JUNIO == this.mes && this.dia >= 20);

    }

    @Override
    public String toString() {
        return "La fecha es: " + this.dia + " de " + this.mes.name().toLowerCase() + " de " + this.anio;
    }

}
