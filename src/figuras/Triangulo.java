/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 * Clase de un Triangulo dentro de un Poligono general.
 *
 * @author Janet García
 */
public class Triangulo extends Poligono {
    
    /**
     * Àngulo asociado al lado 'a' del Triangulo.
     */
    private int alfa;
    
    /**
     * Ángulo asociado al lado 'b' del Triangulo.
     */
    private int beta;
    
    /**
     * Ángulo asociado al lado 'c' del Triangulo.
     */
    private int gamma;
    
    /**
     * Primer lado del Triangulo. Lado a.
     */
    private float a;
    
    /**
     * Segundo lado del Triangulo. Lado b.
     */
    private float b;
    
    /**
     * Tercer lado del Triangulo. Lado c.
     */
    private float c;
    
    /**
     * Base del Triangulo.
     */
    private float base;
    
    /**
     * Altura del Triangulo.
     */
    private float altura;

    /**
     * Contructor de Triangulo vacío.
     */
    public Triangulo() {
    }

    /**
     * 
     * @param alfa Àngulo del lado 'a' del Triangulo.
     * @param beta Ángulo del lado 'b' del Triangulo.
     * @param gamma Ángulo del lado 'c' del Triangulo.
     * @param a Primer lado del Trinagulo. Lado a.
     * @param b Segundo lado del Triangulo. Lado b.
     * @param c Tercer lado del Triangulo. Lado c.
     * @param base Base del Triangulo.
     * @param altura Altura del Triangulo.
     */
    public Triangulo(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que devuelve el ángulo alfa del lado 'a' del Triangulo.
     * @return El ángulo alfa del Triangulo.
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Método que establece el ángulo alfa del lado 'a' del Triangulo.
     * @param alfa El ángulo alfa del Triangulo.
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Método que devuelve el ángulo beta del lado 'b' del Triangulo.
     * @return El ángulo beta del Triangulo.
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Método que establece el ángulo beta del lado 'b' del Triangulo.
     * @param beta El ángulo beta del Triangulo.
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }    
    
    /**
     * Método que devuelve el ángulo gamma del lado 'c' del Triangulo.
     * @return El ángulo gamma del Triangulo.
     */
    public int getGamma() {
        return gamma;
    }

    /**
     * Método que establece el ángulo gamma del lado 'c' del Triangulo.
     * @param gamma El ángulo gamma del Triangulo.
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
     * Método que devuelve el lado 'a' del Triangulo.
     * @return El lado 'a' del Triangulo.
     */
    public float getA() {
        return a;
    }

    /**
     * Método que establece el lado 'a' del Triangulo.
     * @param a El lado 'a' del Triangulo.
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Método que devuelve el lado 'b' del Triangulo.
     * @return El lado 'b' del Triangulo.
     */
    public float getB() {
        return b;
    }

    /**
     * Método que establece el lado 'b' del Triangulo.
     * @param b El lado 'b' del Triangulo.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Método que devuelve el lado 'c' del Triangulo.
     * @return El lado 'c' del Triangulo.
     */
    public float getC() {
        return c;
    }

    /**
     * Método que establece el lado 'c' del Triangulo.
     * @param c El lado 'c' del Triangulo.
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Método que devuelve la base del Triangulo.
     * @return La base del Triangulo.
     */
    public float getBase() {
        return base;
    }

    /**
     * Método que establece la base del Triangulo.
     * @param base La base del Triangulo.
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Método que devuelve la altura del Triangulo.
     * @return La altura del Triangulo.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Método que establece la altura del Triangulo.
     * @param altura La altura del Triangulo.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Método que devuelve y calcula el perímetro del Triangulo.
     * @return El perimetro del Triangulo.
     */
    @Override
    public float perimetro() {
        return a + b + c;
    }

    /**
     * Método que devuelve y calcula el área del Triangulo.
     * @return El área del Triangulo.
     */
    @Override
    public float area() {
        return base * altura / 2;
    }
    
    /**
     * Método que parsea un objeto en una cadena.
     * @return Los atributos del objeto como cadena.
     */
    @Override // Ésto es una anotación.
    public String toString() {
        return super.toString() + "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}