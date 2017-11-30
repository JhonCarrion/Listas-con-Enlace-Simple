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
public class Ejecutar {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();
        lista.agregar("hola");
        lista.agregar("mundo");
        lista.agregar("lista");
        System.out.println(lista.listar());
        System.out.println("tamaño: " + lista.getTamanio());
        lista.insrtar(0, "insertar");
        System.out.println(lista.listar());
        System.out.println();
        lista.editar(2, "mundos");
        System.out.println(lista.listar());
        System.out.println();
        lista.editar("mundos", "mundo");
        System.out.println(lista.listar());
        System.out.println();
        lista.eliminar("mundo");
        System.out.println(lista.listar());
        System.out.println();
        lista.vaciar();
        System.out.println(lista.listar());
    }
}
