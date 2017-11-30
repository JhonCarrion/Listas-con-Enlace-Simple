/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author alex
 */
public class Nodo<T> {

    private T informacion;
    private Nodo siguiente = null;

    public T getInformacion() {
        return informacion;
    }

    public void setInformacion(T informacion) {
        this.informacion = informacion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
