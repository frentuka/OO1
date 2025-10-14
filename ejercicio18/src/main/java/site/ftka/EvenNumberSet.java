package site.ftka;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class EvenNumberSet<Integer> implements Set<Integer> {

    private Set<Integer> set = new java.util.HashSet<>();

    public EvenNumberSet() {}
    public EvenNumberSet(Set<Integer> set) {
        this.set = set;
    }

    /*
        Se utilizará la implementación de la clase Set.
        Se modificará el método add para que solo agregue números pares.
        El resto de los métodos se delegarán a la instancia de Set.
     */

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return set.iterator();
    }

    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    public boolean add(Integer integer) {
        return (int)integer % 2 == 0 && set.add(integer);
    }

    @Override
    public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return set.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return set.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return set.removeAll(c);
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
