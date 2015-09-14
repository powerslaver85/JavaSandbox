/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaAusdruecke;

/**
 *
 * @author RSCHENK
 */
public class A {
    private int i;
    
    public A(int i) {
        this.i = i;
    }
    
    public void someMethod(X x) {
        int result = i + x.calculate(2, 3);
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        A a = new A(1);
        
        a.someMethod(new X() {
        public int calculate(int a, int b) {
            return a + b;
        }
    });
    }
    
}
