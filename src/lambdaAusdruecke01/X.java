/*
 * Im gegensatz zu Xlegacy verweist X mittels Lambda Ausdruecken auf die entspr.
 * anonymen Klassen.
 */
package lambdaAusdruecke01;

/**
 *
 * @author RSCHENK
 */

@FunctionalInterface
public interface X {
    void m();
    
    boolean equals(Object obj);
    
    default void a() {
        System.out.println("Hallo");
    }
    static void b() {
        System.out.println("Welt");
    }
}
