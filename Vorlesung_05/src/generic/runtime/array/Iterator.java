package generic.runtime.array;

public interface Iterator<E> {

    boolean hasNext();
    E next();
    void remove();
}
