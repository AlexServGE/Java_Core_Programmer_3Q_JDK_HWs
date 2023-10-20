/**
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары.
 */
public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key,V value){
        this.key = key;
        this.value = value;
    }

    public K getFirst() {
        return this.key;
    }

    public V getSecond() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + this.getFirst() +
                ", value=" + this.getSecond() +
                '}';
    }
}
