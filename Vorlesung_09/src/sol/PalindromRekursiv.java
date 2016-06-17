package sol;

public class PalindromRekursiv {
	
	public static void main(String[] args) {
		System.out.println(checkPalindrom("lagerregal"));
	}
	
	public static boolean checkPalindrom(String word)
    {
        if(word.length() == 0 || word.length() == 1)
        {
            return true;
        }
        else if(word.charAt(0) == word.charAt(word.length() - 1))
        {
            //System.out.println(word);
            word = word.substring(1, word.length() - 1);
            //System.out.println(word);
            return checkPalindrom(word);
        }
        else
        {
            return false;
        }
    }

}
