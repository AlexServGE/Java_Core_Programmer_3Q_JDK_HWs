import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Описать собственную коллекцию - список на основе массива. Каоллекция должна иметь
 * возможность хранить любые типы данных, иметь методы добавления и удаления элементов
 *
 * Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
 * чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
 */
public class MyCollection<T> implements Iterable<T> {
    public List<T> array;
    private int arraySize;
    private int index;

    {
        this.array = new ArrayList<>();
        this.arraySize = 0;
        this.index = 0;
    }

    public MyCollection(){

    }


    public MyCollection(ArrayList<T> array){
        this.array = array;
        this.arraySize = array.size();
    }

    public T getByIndex(int index){
        return array.get(index);
    }

    public void add(T element){
        this.array.add(element);
        this.arraySize = array.size();
    }

    public void remove(int index){
        this.array.remove(index);
        this.arraySize = array.size();
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "array=" + array +
                ", arraySize=" + arraySize +
                ", index=" + index +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this);
    }

    static class MyIterator<T> implements Iterator<T>{

        private MyCollection<T> arrayIter;
        private int index = 0;

        MyIterator(MyCollection<T> array){
            this.arrayIter = array;
        }

        @Override
        public boolean hasNext() {
            return this.index < arrayIter.arraySize;
        }

        @Override
        public T next() {
            return arrayIter.getByIndex(index++);
        }
    }
}
