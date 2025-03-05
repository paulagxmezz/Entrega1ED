package es.uah.matcomp.ed.Practica_1;

public class Iterador<T> {
    private T[] elementos;
    private int posicionActual;

    public Iterador(T[] elementos) {
        this.elementos = elementos;
        this.posicionActual = 0;
    }

    public boolean hasNext() {
        return posicionActual < elementos.length;
    }

    public T next() {
        if (!hasNext()) {
            return null;
        }
        this.posicionActual = (this.posicionActual + 1);
        return elementos[this.posicionActual-1];
    }

    public void delete() {
        int restantes = this.elementos.length-1-posicionActual;
        for (int j = 0; j < restantes; j++) {
                    this.elementos[posicionActual+j] = this.elementos[posicionActual+j+1];
                }
                //Creo una nueva lista con la longitud correcta(obviando el ultimo termino, que, por construccion, es el mismo que el penultimo)
                Object[] nuevoElementos = new Object[this.elementos.length-1];
                for (int j = 0; j < this.elementos.length-1; j++) {
                    nuevoElementos[j] = this.elementos[j];
                }
                this.elementos = (T[]) nuevoElementos;
            }
}


