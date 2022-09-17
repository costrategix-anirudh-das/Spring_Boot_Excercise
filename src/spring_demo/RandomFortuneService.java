package spring_demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	// create an array of strings
		private String[] data = { 
				"Random Fortune 1",
				"Random Fortune 2",
				"Random Fortune 3"
		};
		
		// create a random number generator
		private Random myRandom = new Random();
			
		@Override
		public String getFortune() {
			
			// pick a random string from the array
			int index = myRandom.nextInt(data.length);
			
			String theFortune = data[index];
			
			return theFortune;
		}


}
