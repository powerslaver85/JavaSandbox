
package lambdaExamples;

/** FilterTest.java (Mit Lambda-Ausdruck)
 * Beispiel fuer Lambda-Ausdruecke I
 * Ein Lambda Ausdruck repraesentiert eine "anonyme Funktion".
 * Die Syntax ist aufgebaut aus einer Parameterliste, dem Operator
 * -> und einem Methodenrumpf
 * 
 * Beispiel Syntax:
 * (parameter) -> { body }
 * 
 * Beispiel:
 * x -> x * x
 * (x, y) -> x + y
 * (x, y) -> {return x + y;}
 * usw.
 * 
 * 
 * - Ein Lambda-Ausdruck kann keinen, einen oder mehrere Parameter haben.
 * - Parametertypen koennen explizit angegeben oder aus dem Kontext ermittelt werden.
 * - Bei nur einem Parameter duerfen die Klammern fehlen
 * - Mehrere Parameter werden durch Kommas getrennt und sind geklammert
 * - Der Rumpf eines Lambda-Ausdrucks kann keine, eine oder mehrere
 *   Anweisungen enthalten.
 * - Bei nur einer Anweisung kann auf geschweifte Klammern verzichtet werden.
 * 
 * 
 * @author RSCHENK
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


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
        
        //Hier vereinfacht der Lambda-Ausdruck filter(list, n -> n % 2 == 0) den Filtervorgung
        List<Integer> result = filter(list, n -> n % 2 == 0);
        
        for (int n : result) {
            System.out.println(n);
        } 
    }
    
}
