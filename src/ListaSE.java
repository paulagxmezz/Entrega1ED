abstract class ListaSE<T> implements Lista<T>{
    private Elemento<T> cabeza;
    int numElementos;
    public ListaSE(){
        this.cabeza = null;
    }
    @Override
    public boolean add(T elemento) {
        Elemento<T> temporal = new Elemento<>(elemento);
        temporal.setSiguiente(this.cabeza);
        this.cabeza = temporal;
        this.numElementos++;
        return true; // Se retorna true indicando que el elemento fue agregado correctamente
    }

    @Override
    public boolean delete(T elemento) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.getDato().equals(elemento)) {
            cabeza = cabeza.getSiguiente();
            numElementos--;
            return true;
        }
        Elemento<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato().equals(elemento)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                numElementos--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false; // Elemento no encontrado
    }




}
