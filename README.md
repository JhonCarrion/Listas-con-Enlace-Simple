# Listas-con-Enlace-Simple
Las listas son estructuras de datos que ofrecen un cierto tipo de flexibilidad al manipularlas ya que no tienen un tamaño fijo, es decir, se pueden alargar o acortar según surja la necesidad; los arreglos para ser usados se debe asignar el tamaño que ocuparan en la memoria. Esta característica se debe a que los arrays hacen un uso ineficiente de la memoria. Gracias a la asignación dinámica de variables, se pueden implementar listas de modo que la memoria física utilizada se corresponda con el número de elementos de la tabla; para ello, se recurre a las referencias (apuntadores) que hacen un uso más eficiente de la memoria.

Una lista enlazada es una colección o secuencia de elementos dispuestos uno detrás de otro, en la que cada elemento se conecta al siguiente elemento por un “enlace” o “referencia”. La idea básica consiste en construir una lista cuyos elementos, llamados nodos, se componen de dos partes (campos o atributos): la primera parte contiene la información y es, por consiguiente, un valor de un tipo genérico, y la segunda parte es una referencia que apunta (enlaza) al siguiente elemento de la lista.

Las listas básicamente se forman del enlace de nodos los cuales funcionan como contenedores para almacenar la información y enlace al siguiente nodo.

El presente proyecto tiene como finalidad hacer una representación del funcionamiento de las colecciones tipo lista en el lenguaje de programación java, en este lenguaje existen varias formas de representar listas, pero en este caso se hace uso de punteros mediante referencia a objetos.

 # 1. Características
 
  - Para hacer uso de tipos de datos genéricos se asigna la clase genérica <T>, la que deberá ser remplazada por el tipo de dato o clase a la que pertenecerá la información.
  - Para acceder a la información de la lista se accede a ella mediante el primer nodo.
  - Para acceder a un valor o posición especifico se recorre toda la lista.
  - Las operaciones devuelven verdadero si todo ha ido bien de lo contrario devolverán un valor de falso.
 
 # 2. Funciones
 
  - agregar (T informacion): agrega el valor al final de la lista.
  - agregarAlInicio (T informacion): agrega el valor al inicio de la lista.
  - insertar (T buscar, T informacion): inserta el valor después del valor de referencia en la lista. 
  - insertar (int posicion, T informacion): inserta el valor después de la posición de referencia en la lista.
  - eliminar (T buscar): elimina el nodo con el valor que coincida con la referencia. 
  - eliminar (int posicion): elimina el nodo con la posición que coincida con la referencia. 
  - editar (T buscar, T informacion): actualiza la información de nodo con el valor que coincida con la referencia.
  - editar (int posicion, T informacion): actualiza la información de nodo con la posición que coincida con la referencia.
  - estaVacio (): retorna true si la lista está vacía, false en caso contrario. 
  - contiene (T referencia): retorna la true si el elemento existe en la lista, false caso contrario.
  - vaciar (): elimina la lista
  - getTamanio(): retorna el valor entero de la cantidad de elementos que contiene la lista.
  - getPosicion(T informacion): retorna el valor entero de la posición en la que se encuentra un determinado elemento.
  - get(int posicion): devuélvele la información contenida por la lista en la posición enviada, según el tipo de dato asignado. 
  - listar (): retorna un String con los elementos de la lista y su posición.

El código esta hecho en java y contiene dos clases, las cuales son:
 - Lista
 - Nodo
