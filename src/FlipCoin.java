
public class FlipCoin {
	public static void main(String[] args) {
		int numberOfFlips = 10;
		int heads = 0, tails = 0;
		for (int i = 0; i < numberOfFlips; i++) {
			double outcome = Math.random();
			if (outcome > 0.5)
				heads++;
			else
				tails++;
		}
		double percentageOfHead = ((double) heads / numberOfFlips) * 100;
		System.out.println("percentage of head is" + percentageOfHead);
		System.out.println("percentage of tail is " + (100 - percentageOfHead));

	}

}
