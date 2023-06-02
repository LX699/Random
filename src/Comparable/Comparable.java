package Comparable;

public interface Comparable<T> {
    
    public abstract boolean isIgual(T objeto);
    
    public abstract String isMayor(T objeto);

    public abstract String isMenor(T objeto);
}
