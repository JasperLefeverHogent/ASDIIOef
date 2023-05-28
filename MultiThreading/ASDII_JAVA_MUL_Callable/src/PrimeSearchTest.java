import java.math.BigInteger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import domein.PrimeSearch;

public class PrimeSearchTest {
	public static void main(String args[]) {
		
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Future<BigInteger> p = pool.submit(new PrimeSearch(16));
		Future<BigInteger> q = pool.submit(new PrimeSearch(16));
		
		try // de waarden opvragen die de Callables hebben teruggegeven:
		{
			System.out.printf("%8d%n%8d%n", p.get(), q.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("De methode call heeft een exception geworpen.");
			e.printStackTrace();
		}
		pool.shutdown();
		System.exit(0);
	}
}
