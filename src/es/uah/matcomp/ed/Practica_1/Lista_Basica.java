package es.uah.matcomp.ed.Practica_1;

import java.util.ArrayList;

public class Lista_Basica<T> implements Lista<T> {
    private T[] elementos;
    public Lista_Basica() {
        Object[] l = new Object[0];
        this.elementos = (T[]) l;
    }

    @Override
    public boolean add(T elemento) {
        Object[] nuevoElementos = new Object[this.elementos.length+1];
        if (this.elementos.length == 0) {
            nuevoElementos[0] = elemento;
            this.elementos = (T[]) nuevoElementos;
        }
        else {
            for (int i = 0; i < this.elementos.length; i++) {
                nuevoElementos[i] = this.elementos[i];
            }
            this.elementos = (T[]) nuevoElementos;
            this.elementos[this.elementos.length - 1] = elemento;
        }
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == elemento){
                int restantes = this.elementos.length-1-i;
                for (int j = 0; j < restantes; j++) { //En caso de que el elemento buscado sea el ultimo, no entra en el bucle y se elimina al final del metodo)
                    this.elementos[i+j] = this.elementos[i+j+1];
                }
                //Creo una nueva lista con la longitud correcta(obviando el ultimo termino, que, por construccion, es el mismo que el penultimo)
                Object[] nuevoElementos = new Object[this.elementos.length-1];
                for (int j = 0; j < this.elementos.length-1; j++) {
                    nuevoElementos[j] = this.elementos[j];
                }
                this.elementos = (T[]) nuevoElementos;
                return true;
                }
            }
        return false;
        }
        @Override
        public int getNumElementos() {return this.elementos.length;}
    @Override
    public Iterador<T> getIterador() {
        Iterador<T> mi_iterador = new Iterador<T>(elementos);
        return mi_iterador;
    }

}
