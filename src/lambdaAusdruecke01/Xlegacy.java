/*
 *    void m();
    boolean equals(Object obj);
    
    default void a() {
        System.out.println("Hallo");
}
 */
package lambdaAusdruecke01;

/**
 *
 * @author RSCHENK
 */
@FunctionalInterface
public interface Xlegacy {
    int calculate(int a, int b);
}
