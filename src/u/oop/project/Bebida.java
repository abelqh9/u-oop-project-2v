/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author abelq
 */
public class Bebida extends Producto {
    
    private String temperatura;

    public Bebida(String temperatura, int id, String nombre, double precio) {
        super(id, nombre, precio);
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Bebida{" + "temperatura=" + temperatura + '}';
    }
    
    
    
}
