
package lambdaExamples;

/**
 * Das Folgende Programm zeigt an verschiedenen Beispielen wie mit 
 * Lambda-Ausdruecken Operationen in Java Vereinfacht werden koennen.
 * @author RSCHENK
 */
public class LambdaBeispiel {
   public static void main(String args[]){
      LambdaBeispiel tester = new LambdaBeispiel();
		
      //Mit Typendeklaration
      MathOperation addition = (int a, int b) -> a + b;
		
      //Ohne Deklaration
      MathOperation subtraction = (a, b) -> a - b;
		
      //Mit Return-Statement in Geschw. Klammern
      MathOperation multiplication = (int a, int b) -> { return a * b; };
		
      //Ohne Return-Statement
      MathOperation division = (int a, int b) -> a / b;
		
      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		
      //Ohne Klammerung (message)
      GreetingService greetService1 = message ->
      System.out.println("Hello " + message);
		
      //Mit Klammerung
      GreetingService greetService2 = (message) ->
      System.out.println("Hello " + message);
		
      greetService1.sayMessage("Mahesh");
      greetService2.sayMessage("Suresh");
   }
	
   interface MathOperation {
      int operation(int a, int b);
   }
	
   interface GreetingService {
      void sayMessage(String message);
   }
	
   private int operate(int a, int b, MathOperation mathOperation){
      return mathOperation.operation(a, b);
   }
}