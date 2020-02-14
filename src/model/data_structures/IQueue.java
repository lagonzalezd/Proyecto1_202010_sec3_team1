package model.data_structures;

public interface IQueue<T extends Comparable<T>> {

    void enQueue(T pElemento);

    T deQueue();

    T peek();

    boolean estaVacia();

    int darLongitud();

}
