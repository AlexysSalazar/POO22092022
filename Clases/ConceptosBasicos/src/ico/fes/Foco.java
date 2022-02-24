/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author win10-94
 */
public class Foco {
    private String color;
    private String tipo;
    private int Tamano;

    public Foco() {
    }

    public Foco(String color, String tipo, int Tamano) {
        this.color = color;
        this.tipo = tipo;
        this.Tamano = Tamano;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Foco{" + "color=" + color + ", tipo=" + tipo + ", Tamano=" + Tamano + '}';
    }
    
    
}
