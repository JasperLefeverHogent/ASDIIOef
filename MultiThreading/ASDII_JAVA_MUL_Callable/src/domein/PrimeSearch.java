package domein;

import java.util.concurrent.Callable;
import java.util.Random;
import java.math.BigInteger;
import java.security.SecureRandom;

public class PrimeSearch implements Callable<BigInteger> {
	
	static Random prng = new SecureRandom();
	int n;

	public PrimeSearch(int bitsize) {
		n = bitsize;
	}

	public BigInteger call() {
		return BigInteger.probablePrime(n, prng);
	}
}
