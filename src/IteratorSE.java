public class IteratorSE<T> implements Iterator<T> {
    Elemento <T> actual;//Nodo en el que estamos
    Elemento<T> previo;//Se utiliza para eliminar elementos de la lista

    public IteratorSE(Elemento <T> actual) {
        this.actual = actual;
        this.previo = null;
    }
    public boolean hasNext(){
        return actual != null;
    }

        public T next() {
            if (actual == null) return null; // Retorna null en lugar de lanzar una excepción
            T dato = actual.getDato();
            actual = actual.getSiguiente();
            return dato;
        }
    public void remove() {
        if (previo == null) {
            // No se puede eliminar si no se ha llamado a next() previamente
            return;
        }

        if (previo == actual) {
            // Si el nodo previo es igual al nodo actual, significa que estamos intentando eliminar el primer nodo
            // Cambiar cabeza a actual.getSiguiente() (el siguiente nodo después de cabeza)
            actual = actual.getSiguiente();
        } else {
            // Eliminar un nodo intermedio: hacer que el previo apunte al siguiente de actual
            previo.setSiguiente(actual.getSiguiente());
        }

        previo = null; // Limpiar el nodo previo para evitar eliminación múltiple sin llamar a next()
    }






}



