import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
 * если они одинаковые, и false в противном случае.
 * Массивы могут быть любого типа данных,
 * но должны иметь одинаковую длину и содержать элементы одного типа.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strlst = new ArrayList<>(Arrays.asList("1.0f","2.0f"));
        ArrayList<String> strlst2 = new ArrayList<>(Arrays.asList("1.0f","2.0f","dfg"));
        ArrayList<String> strlst3 = new ArrayList<>(Arrays.asList("1.0f","dfg"));
        System.out.println(compareArrays(strlst,strlst2));
        System.out.println(compareArrays(strlst,strlst3));
    }

    public static <T> boolean compareArrays(ArrayList<T> array1, ArrayList<T> array2){
        return array1.size() == array2.size();
    }
}