package model.data_structures;

public interface IStack<T extends  Comparable<T>> {


    void push(T pT);

    T pop();

    boolean estaVacia();

    int darTamano();

    T peek();

}