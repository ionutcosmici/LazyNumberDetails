package Proiect_2;

public class LazyNumberDetails {

	private int number;
	private boolean isPrimeNumber = false;
	private boolean isPerfectNumber = false;
	private boolean isMagicNumber = false;
	private boolean calcPrimeNumber = false;
	private boolean calcPerfectNumber = false;
	private boolean calcMagicNumber = false;


	public LazyNumberDetails(int number) {
		this.number = number;
	}

	public void updateNumber(int number) {
		this.calcPrimeNumber = false;
		this.calcPerfectNumber = false;
		this.calcMagicNumber = false;
		this.number = number;
		System.out.println("New number is: " + this.number);
	}

	public boolean isPrime() {
		if (calcPrimeNumber == false) {
			isPrimeNumber = isPrimeAlgorithm();
			calcPrimeNumber = true;
		}
		if(isPrimeNumber) {
			System.out.println(this.number + " is a Prime number!");
		}else {
			System.out.println(this.number + " is not a Prime number!");
		}
		return isPrimeNumber;
	}

	private boolean isPrimeAlgorithm() {
		System.out.println("Is Prime Algorithm called");
		for(int i =2; i <= this.number / 2; i++) {
			if(this.number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isPerfect() {
		if (calcPerfectNumber == false) {
			isPerfectNumber = isPerfectAlgorithm();
			calcPerfectNumber = true;
		}
		if(isPerfectNumber) {
			System.out.println(this.number + " is a Perfect number!");
		}else {
			System.out.println(this.number + " is not a Perfect number!");
		}
		return isPerfectNumber;
	}

	public boolean isPerfectAlgorithm() {
		System.out.println("Is Perfect Algorithm called");
		int i, Sum = 0;

		for(i = 1 ; i < this.number ; i++) {
			if(this.number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == this.number) {
			return true;
		} else {
			return false;
		}
	}

	public int reduceNumber () {
		int checker = this.number;
		int sum = 0;
		do {
			sum = 0;
			while (checker != 0) {
				int lastDigit = checker % 10;
				sum += lastDigit;
				checker /= 10;
			}
			checker = sum;
		} while (sum >= 10);

		return sum;
	}

	public boolean isMagic() {
		if (calcMagicNumber == false) {
			isMagicNumber = isMagicAlgoritm();
			calcMagicNumber = true;
		}
		if(isMagicNumber) {
			System.out.println(this.number + " is a Magic number!");	
		}else {
			System.out.println(this.number + " is not a Magic number!");		
		}
		return isMagicNumber;
	}

	public boolean isMagicAlgoritm() {
		System.out.println("Is Magic Algorithm called");
		int reducedSum = reduceNumber();
		return(reducedSum == 3 || reducedSum == 7 || reducedSum == 9);
	}
}
