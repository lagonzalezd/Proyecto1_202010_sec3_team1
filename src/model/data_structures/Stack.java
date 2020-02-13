package model.data_structures;

public class Stack<T extends Comparable<T>> implements IStack<T> {

	// Atributos
	private Node<T> top;
	private int tamano;

	// Constructor
	public Stack() {
		top = null;
		tamano = 0;
	}

	/**
	 * Metodo para agregar un elemento a la pila.
	 *
	 * @param pT
	 */
	public void push(T pT) {
		Node nuevo = new Node(pT);
		if (estaVacia()) {
			top = nuevo;
		} else {
			nuevo.cambiarSiguiente(top);
			top = nuevo;
		}
		tamano++;
	}

	/**
	 * Metodo para tomar el primer elemento de la lista y elminarlo.
	 *
	 * @return Primer elemento
	 */
	public T pop() {
		T elemento = top.darElemento();
		if (estaVacia()) {
			return null;
		} else {
			top = top.darSiguiente();
			tamano--;
			return elemento;

		}
	}

	/**
	 * Se comprueba que la lista tenga por lo menos un elemento.
	 * @return True si lo está, false si tiene elementos.
	 */
	public boolean estaVacia() {
		return (top == null) ? true : false;
	}

	/**
	 * Se regresa la cantidad de elementos que estan en la pila.
	 * @return Tamaño de la pila.
	 */
	public int darTamano() {
		return tamano;
	}

	/**
	 * Se da el primer elemento sin eliminarlo de la pila.
	 * @return  Primer elemento en la pila.
	 */
	public T peek() {
		if (estaVacia()) {
			return null;
		} else {
			return top.darElemento();
		}
	}
}