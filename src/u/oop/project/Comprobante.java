/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author abelq
 */
public class Comprobante {
    
    private int id;
    private String tipo;
    private Date fecha;
    private Mesa mesa;

    public Comprobante(int id, String tipo, Date fecha, Mesa mesa) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.mesa = mesa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
}
