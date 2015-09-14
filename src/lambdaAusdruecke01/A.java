/*
 * Uebergabe der Methode calculate and someMethod mittels "anonymer Klasse"
 */
package lambdaAusdruecke01;

/**
 *
 * @author RSCHENK
 */
public class A {
    private int i;
    
    public A(int i) {
        this.i = i;
    }
    
    public void someMethod(Xlegacy x) {
        int result = i + x.calculate(2, 3);
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        A a = new A(1);
        
        a.someMethod(new Xlegacy() {
        public int calculate(int a, int b) {
            return a + b;
        }
    });
    }
    
}
