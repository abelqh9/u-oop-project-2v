/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author abelq
 */
public class Plato extends Producto {
    
    private String sabor;

    public Plato(String sabor, int id, String nombre, double precio) {
        super(id, nombre, precio);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Plato{" + "sabor=" + sabor + '}';
    }
    
}
