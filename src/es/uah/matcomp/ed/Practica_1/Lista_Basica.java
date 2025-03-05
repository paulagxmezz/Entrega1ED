package es.uah.matcomp.ed.Practica_1;

import java.util.ArrayList;

public class Lista_Basica<T> implements Lista<T> {
    private T[] elementos;
    private int maxElementos;
    private int numElementos;
    public Lista_Basica() {
        Object[] l = new Object[0];
        this.elementos = (T[]) l;
        this.maxElementos = 0;
        this.numElementos = 0;
    }
    public Lista_Basica(int maxElementos) {
        this.maxElementos = maxElementos;
        this.elementos = (T[]) new Object[maxElementos];
        this.numElementos = 0;
    }

    @Override
    public boolean add(T elemento) {
        Object[] nuevoElementos = new Object[this.maxElementos+1];
        if (this.maxElementos == 0) {
            nuevoElementos[0] = elemento;
            this.elementos = (T[]) nuevoElementos;
            this.maxElementos = 1;
        }
        else {
            for (int i = 0; i < this.maxElementos; i++) {
                nuevoElementos[i] = this.elementos[i];
            }
            this.elementos = (T[]) nuevoElementos;
            this.maxElementos = this.maxElementos + 1;
            this.elementos[this.maxElementos - 1] = elemento;
        }
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        for (int i = 0; i < this.maxElementos; i++) {
            if (this.elementos[i] == elemento){
                int restantes = this.maxElementos-1-i;
                for (int j = 0; j < restantes; j++) { //En caso de que el elemento buscado sea el ultimo, no entra en el bucle y se elimina al final del metodo)
                    this.elementos[i+j] = this.elementos[i+j+1];
                }
                //Creo una nueva lista con la longitud correcta(obviando el ultimo termino, que, por construccion, es el mismo que el penultimo)
                this.maxElementos = this.maxElementos - 1;
                Object[] nuevoElementos = new Object[this.maxElementos];
                for (int j = 0; j < this.maxElementos; j++) {
                    nuevoElementos[j] = this.elementos[j];
                }
                this.elementos = (T[]) nuevoElementos;
                return true;
            }
        }
        return false;
    }
    @Override
    public int getNumElementos() {
        this.numElementos = 0;
        for (int i = 0; i < this.maxElementos; i++) {
            if (this.elementos[i] != null) {
                this.numElementos++;
            }
        }
        return this.numElementos;

    }
    public void setElemento(int index, T elemento) {
        if (index < 0 || index >= this.maxElementos) {
            System.out.println("No se puede establecer el elemento");
            return;
        }
        this.elementos[index] = elemento;
    }
    @Override
    public Iterador<T> getIterador() {
        Iterador<T> mi_iterador = new Iterador<T>(elementos);
        return mi_iterador;
    }

}
