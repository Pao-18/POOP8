package meses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 * Interfaz para trabajar con meses.
 *
 * @author Janet García 
 */
public interface Meses {
    
    //public, static, final no hace falta especificarse
    
    /**
     * Asignación de valores a los números con su correspondiente cadena. Cada uno representa a un mes del año.
     */
    int UNO = 1, DOS = 2, TRES = 3, CUATRO = 4, CINCO = 5, SEIS = 6, SIETE = 7, OCHO = 8, NUEVE = 9, DIEZ = 10, ONCE = 11, DOCE = 12;

    /**
     * Colección de los meses.
     */
    String[] MESES = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
}
