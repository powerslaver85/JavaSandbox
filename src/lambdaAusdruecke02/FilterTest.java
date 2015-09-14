/*
 * Funktionsinterface am Beispiel von java.util.function -> Predicate<>
 */
package lambdaAusdruecke02;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
/**
 *
 * @author RSCHENK
 */
public class FilterTest {
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        
        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        
        List<Integer> result = filter(list, new Predicate<Integer>(){
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        });
        for (int n : result) {
            System.out.println(n);
        }
    }
    
}
