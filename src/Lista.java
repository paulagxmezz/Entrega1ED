public interface Lista<T> {
    boolean add (T elemento);
    boolean delete(T elemento);
    Iterator<T> getIterador();
    int getNumElem();

}
