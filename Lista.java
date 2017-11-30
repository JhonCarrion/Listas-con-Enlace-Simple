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
public class Lista<T> {

    private Nodo<T> primero;
    private int tamanio = 0;

    /**
     * ingresar informacion por separado.
     */
    public Lista() {
    }

    /**
     * Lista creada con valor inicial
     *
     * @param primero Valor inicial de la lista.
     */
    public Lista(Nodo<T> primero) {
        this.primero = primero;
    }

    public int getTamanio() {
        return tamanio;
    }

    public boolean estaVacio() {
        return (primero == null);
    }

    public boolean contiene(T referencia) {
        Nodo aux = primero;
        boolean encontrado = false;
        while (aux != null && encontrado != true) {
            if (referencia == aux.getInformacion()) {
                encontrado = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }

    public int getPosicion(T info) throws Exception {
        if (contiene(info)) {
            Nodo aux = primero;
            int cont = 0;
            while (info != aux.getInformacion()) {
                cont++;
                aux = aux.getSiguiente();
            }
            return cont;
        } else {
            throw new Exception("Valor inexistente en la lista.");
        }
    }

    public boolean agregar(T info) {
        Nodo nuevo = new Nodo();
        nuevo.setInformacion(info);
        if (estaVacio()) {
            primero = nuevo;
        } else {
            Nodo aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
        return true;
    }

    public void agregarAlInicio(T info) {
        Nodo nuevo = new Nodo();
        nuevo.setInformacion(info);
        if (estaVacio()) {
            primero = nuevo;
        } else {
            nuevo.setSiguiente(primero);
            primero = nuevo;
        }
        tamanio++;
    }

    public void insertar(T buscar, T informacion) {
        Nodo nuevo = new Nodo();
        nuevo.setInformacion(informacion);
        if (!estaVacio()) {
            if (contiene(buscar)) {
                Nodo aux = primero;
                while (aux.getInformacion() != informacion) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(siguiente);
                tamanio++;
            }
        }
    }

    public void insrtar(int posicion, T informacion) {
        if (posicion >= 0 && posicion <= tamanio) {
            if (posicion == 0) {
                agregarAlInicio(informacion);
            } else {
                if (posicion == tamanio) {
                    agregar(informacion);
                } else {
                    Nodo nuevo = new Nodo();
                    nuevo.setInformacion(informacion);
                    Nodo aux = primero;
                    for (int i = 0; i < (posicion - 1); i++) {
                        aux = aux.getSiguiente();
                    }
                    Nodo siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            tamanio++;
        }
    }

    public T get(int posicion) throws Exception {
        if (posicion >= 0 && posicion < tamanio) {
            if (posicion == 0) {
                return primero.getInformacion();
            } else {
                Nodo<T> aux = primero;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                return aux.getInformacion();
            }
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }

    public boolean editar(T buscar, T informacion) {
        if (contiene(buscar)) {
            Nodo aux = primero;
            while (aux.getInformacion() != buscar) {
                aux = aux.getSiguiente();
            }
            aux.setInformacion(informacion);
            return true;
        } else {
            return false;
        }
    }

    public boolean editar(int posicion, T informacion) {
        if (posicion >= 0 && posicion < tamanio) {
            if (posicion == 0) {
                primero.setInformacion(informacion);
            } else {
                Nodo aux = primero;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setInformacion(informacion);
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(T buscar) {
        if (contiene(buscar)) {
            if (primero.getInformacion() == buscar) {
                primero = primero.getSiguiente();
            } else {
                Nodo aux = primero;
                while (aux.getSiguiente().getInformacion() != buscar) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);
            }
            tamanio--;
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(int posicion) {
        if (posicion >= 0 && posicion < tamanio) {
            if (posicion == 0) {
                primero = primero.getSiguiente();
            } else {
                Nodo aux = primero;
                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamanio--;
            return true;
        } else {
            return false;
        }
    }

    public boolean vaciar() {
        primero = null;
        tamanio = 0;
        return true;
    }

    public String listar() {
        String out = "";
        if (!estaVacio()) {
            Nodo aux = primero;
            int i = 0;
            while (aux != null) {
                out += i + ".[ " + aux.getInformacion().toString() + " ]" + " ->  ";
                aux = aux.getSiguiente();
                i++;
            }
        }
        return out;
    }
}
