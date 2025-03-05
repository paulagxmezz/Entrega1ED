public class Elemento<T>{//Cada elemento<T> almacena un valor y tiene enlace al siguiente
    private T dato;//El nodo guarda el dato
    private Elemento<T> siguiente;//Apunta al siguiente nodo de la lista para poder enlazar
    Elemento (T dato){
        this.dato = dato;
        this.siguiente = null;//Inicialmemete no apunta a nada. Indica que es el ultimo
    }
    public T getDato() {
        return dato;
    }

    public Elemento<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Elemento<T> siguiente) {
        this.siguiente = siguiente;
    }
}



