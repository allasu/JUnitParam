package core;

public class PrimeNumbersChecker {

	public Boolean checkNumber(final Integer primeNumber) {
		for (int i = 2; i < (primeNumber / 2); i++){
			if (primeNumber % i == 0){
				return false;
			}
		}
		return true;
	}
}
