import java.security.SecureRandom;

public class playCraps {

	public static void main(String[] args)
	{
		SecureRandom randomNumber = new SecureRandom();
		
		boolean result = true;
		int firstScore = 0;
				
		for (int counter = 1; counter > 0; counter++)
		{
			int face1 = randomNumber.nextInt(6) + 1;
			int face2 = randomNumber.nextInt(6) + 1;
			
			int score = face1 + face2;
			
			System.out.printf("%d: %d + %d = %d%n", counter, face1, face2, score);
			
			if (counter == 1)
			{
				firstScore = score * 1;
			}
			
			if (counter == 1 && (score == 7 || score == 11))
			{
				result= true;
				break;
			}
			
			if (counter == 1 && (score == 2 || score == 3 || score == 12))
			{
				result = false;
				break;
			}
			
			if (counter > 1 && score == 7)
			{
				result = false;
				break;
			}
			
			if (counter > 1 && score == firstScore)
			{
				result = true;
				break;
			}
		}
		
		if (result)
			System.out.println("Congratulations, you Win!");
		else
			System.out.println("Sorry, you Lose!");
	}
}
