import java.util.Random;
public class Java_05_15_random_string 
{
	public static void main( String[] args )
	{ 
		String text;
		final String CHAR_LIST = "abcde";
		int randomIndex;
		int howManyStrings = 3;
		int lengthofEachString = 10;
		char c;
		for ( int i = 0; i < howManyStrings; i ++ )
		{
			text = new String("");
			for(int j = 0; j < lengthofEachString; j++)
			{
				randomIndex = new Random().nextInt(CHAR_LIST.length());
	      c = CHAR_LIST.charAt(randomIndex);
	      text += c;
			}
			System.out.println(text);
		}
	}
}