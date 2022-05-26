/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209parte2;

/**
 *
 * @author win10-94
 */
public class circulo implements figura {
    private float radio;

    public circulo() {
    }

    public circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return figura.PI * (this.radio*this.radio);
    }
    
    
}
