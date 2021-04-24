package Proiect_2;
																	//Proiect [P2] Exercitii - OOP I. Optimizarea performantei - Ionut Cosmici
public class Main {

	public static void main(String[] args) {
			
		LazyNumberDetails number = new LazyNumberDetails(23);
		
//		lnd.updateNumber(10); // (2)  **none (lazy eval.)**    -> no user action
//		lnd.updateNumber(17); // (3)  **none (lazy eval.)**    -> no user action
//		lnd.isPrime();        // (4)  !!intensiveComputation!! -> prime algorithm for 17
//		lnd.isPrime();        // (5)  **cached**               -> saved result from prime alg
//		lnd.updateNumber(28); // (6)  **none (lazy eval.)**    -> no user action
//		lnd.isPerfect();      // (7)  !!intensiveComputation!! -> perfect algorithm for 28
//		lnd.isPrime();        // (8)  !!intensiveComputation!! -> prime algorithm for 28
//		lnd.isPerfect();      // (9)  **cached**               -> saved result from perfect alg
//		lnd.isMagic();        // (10) !!intensiveComputation!! -> magic algorithm for 28
//		lnd.isPrime();        // (11) **cached**               -> saved result from prime alg
//		lnd.updateNumber(12); // (12) **none (lazy eval.)**    -> no user action
//		lnd.isMagic();        // (13) !!intensiveComputation!! -> magic algorithm for 12
//		lnd.isMagic();        // (14) **cached**               -> saved result from magic alg
		
		number.updateNumber(2147483647);
		System.out.println();
		
		long startTime = System.nanoTime();
		System.out.println(number.isPrime());
		long stopTime = System.nanoTime();
		System.out.println("Time: " + (double)(stopTime - startTime) / 1_000_000_000);
		
		System.out.println();
		startTime = System.nanoTime();
		System.out.println(number.isPrime());
		stopTime = System.nanoTime();
		System.out.println("Time: " + (double)(stopTime - startTime) / 1_000_000_000);
		
		System.out.println();
		startTime = System.nanoTime();
		System.out.println(number.isPerfect());
		stopTime = System.nanoTime();
		System.out.println("Time: " + (double)(stopTime - startTime) / 1_000_000_000);
		
		System.out.println();
		startTime = System.nanoTime();
		System.out.println(number.isPerfect());
		stopTime = System.nanoTime();
		System.out.println("Time: " + (double)(stopTime - startTime) / 1_000_000_000);
		
		System.out.println();
		startTime = System.nanoTime();
		System.out.println(number.isMagic());
		stopTime = System.nanoTime();
		System.out.println("Time: " + (double)(stopTime - startTime) / 1_000_000_000);
		
		System.out.println();
		startTime = System.nanoTime();
		System.out.println(number.isMagic());
		stopTime = System.nanoTime();
		System.out.println("Time: " + (double)(stopTime - startTime) / 1_000_000_000);
	}
}
