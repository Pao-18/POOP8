/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 * Clase que representa la generalización en un Cuadrilatero de un Poligono general.
 *
 * @author Janet García
 */
public class Cuadrilatero extends Poligono {
    
    /**
     * Primer ángulo asociado al par de ángulos del Cuadrilatero.
     */
    private int alfa;
    
    /**
     * Segundo ángulo asociado al par de ángulos del Cuadrilatero.
     */
    private int beta;
    
    /**
     * Lado1 del Cuadrilatero. Lado a.
     */
    private float a;
    
    /**
     * Lado2 del Cuadrilatero. Lado b.
     */
    private float b;
    
    /**
     * Lado3 del Cuadrilatero. Lado c.
     */
    private float c;
    
    /**
     * Lado4 del Cuadrilatero. Lado d.
     */
    private float d;
    
    /**
     * Base del Cuadrilatero.
     */
    private float base;
    
    /**
     * Altura del Cuadrilatero.
     */
    private float altura;

    /**
     * Creación de la instancia Cuadrilatero vacío.
     */
    public Cuadrilatero() {
    }

    /**
     * Crea una nueva instancia de Cuadrilatero llena.
     * 
     * @param alfa Primer ángulo asociado al par de ángulos del Cuadrilatero.
     * @param beta Segundo ángulo asociado al par de ángulos del Cuadrilatero.
     * @param a Lado1 del Cuadrilatero. Lado a.
     * @param b Lado2 del Cuadrilatero. Lado b.
     * @param c Lad3 del Cuadrilatero. Lado c.
     * @param d Lado4 del Cuadrilatero. Lado d.
     * @param base Base del Cuadrilatero.
     * @param altura Altura del Cuadrilatero.
     */
    public Cuadrilatero(int alfa, int beta, float a, float b, float c, float d, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Método que devuelve el primer ángulo del Cuadrilatero. ángulo alfa.
     * @return El par de ángulos alfa del Cuadrilatero.
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Método que establece el primer ángulo del Cuadrilatero. ángulo alfa.
     * @param alfa El ángulo alfa del Cuadrilatero.
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Método que devuelve el tercer ángulo del Cuadrilatero. ángulo beta.
     * @return El par de ángulos beta del Cuadrilatero.
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Método que establece el segundo ángulo del Cuadrilatero. ángulo beta.
     * @param beta El ángulo beta del Cuadrilatero.
     */
    public void setBeta(int beta) {
        this.beta = beta;
    } 
    
    /**
     * Método que devuelve el lado 'a' del Cuadrilatero.
     * @return El lado 'a' del Cuadrilatero.
     */
    public float getA() {
        return a;
    }

    /**
     * Método que establece el lado 'a' del Cuadrilatero.
     * @param a El lado 'a' del Cuadrilatero.
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Método que devuelve el lado 'b' del Cuadrilatero.
     * @return El lado 'b' del Cuadrilatero.
     */
    public float getB() {
        return b;
    }

    /**
     * Método que establece el lado 'b' del Cuadrilatero.
     * @param b El lado 'b' del Cuadrilatero.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Método que devuelve el lado 'c' del Cuadrilatero.
     * @return El lado 'c' del Cuadrilatero.
     */
    public float getC() {
        return c;
    }

    /**
     * Método que establece el lado 'c' del Cuadrilatero.
     * @param c El lado 'c' del Cuadrilatero.
     */
    public void setC(float c) {
        this.c = c;
    }
 
    /**
     * Método que devuelve el lado 'd' del Cuadrilatero.
     * @return El lado 'd' del Cuadrilatero.
     */
    public float getD() {
        return d;
    }

    /**
     * Método que establece el lado 'd' del Cuadrilatero.
     * @param d El lado 'd' del Cuadrilatero.
     */
    public void setD(float d) {
        this.d = d;
    }

    /**
     * Método que devuelve la base del Cuadrilatero.
     * @return La base del Cuadrilatero.
     */
    public float getBase() {
        return base;
    }

    /**
     * Método que establece la base del Cuadrilatero.
     * @param base La base del Cuadrilatero.
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Método que devuelve la altura del Cuadrilatero.
     * @return La altura del Cuadrilatero.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Método que establece la altura del Cuadrilatero.
     * @param altura La altura del Cuadrilatero.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Método que devuelve y calcula el perímetro del Cuadrilatero.
     * @return El perimetro del Cuadrilatero.
     */
    @Override
    public float perimetro() {
        return a + b + c + d;
    }

    /**
     * Método que devuelve y calcula el área del Cuadrilatero.
     * @return El área del Cuadrilatero.
     */
    @Override
    public float area() {
        return 2 * base + 2 * altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", base=" + base + ", altura=" + altura + '}';
    }
}


    

    

