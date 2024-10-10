/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package instrumentos;

/**
 * Interfaz que definne las instancias que sean (implementen) para un instrumento musical.
 *
 * @author Janet Garía 
 */
public interface InstrumentoMusical {
    
    /**
     * Método para que se toque el instrumento músical.
     */
    public abstract void tocar();
    
    /**
     * Método para que se afine el instrumento musical .
     */
    public abstract void afinar();
    
    /**
     * Método que imprime que tipo de instrumento músical es.
     */
    public abstract String tipoDeInstrumento();
}