/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

import java.util.Vector;

/**
 *
 * @author abelq
 */
public class Mesa {
    
    private int id;
    private int numero;
    private Vector<Cliente> listaClientes;
    private Vector<Trabajador> listaTrabajadores;
    private Vector<Plato> listaPlatos;
    private Vector<Bebida> listaBebidas;

    public Mesa(int id, int numero, Vector<Cliente> listaClientes, Vector<Trabajador> listaTrabajadores, Vector<Plato> listaPlatos, Vector<Bebida> listaBebidas) {
        this.id = id;
        this.numero = numero;
        this.listaClientes = listaClientes;
        this.listaTrabajadores = listaTrabajadores;
        this.listaPlatos = listaPlatos;
        this.listaBebidas = listaBebidas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Vector<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Vector<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Vector<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(Vector<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public Vector<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(Vector<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    public Vector<Bebida> getListaBebidas() {
        return listaBebidas;
    }

    public void setListaBebidas(Vector<Bebida> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }
    
    
}
