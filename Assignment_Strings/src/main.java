
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.Get character Idx
//		GetCharacterIndex getcharacter = new GetCharacterIndex();
//		System.out.print("Enter a string: ");
//		String str = ConsoleInput.getString();
//		StringBuffer string = new StringBuffer(str);
//		System.out.print("Enter a index: ");
//		int idx = ConsoleInput.getInt();
//		System.out.println("Original String = " + str);
//		if (idx < string.length())
//			System.out.println("The character at position " + idx + " is " + getcharacter.getCharacterIdx(string, idx));
//		else
//			System.out.println("Invalid Index");

		// 2. compare two strings lexicographically
//		CompareLexicographically compareLex = new CompareLexicographically();
//		System.out.print("Enter a string: ");
//		String str1 = ConsoleInput.getString();
//		StringBuffer string1 = new StringBuffer(str1);
//		System.out.print("Enter a string: ");
//		String str2 = ConsoleInput.getString();
//		StringBuffer string2 = new StringBuffer(str2);
//		
//		if(compareLex.compareLexicographically(string1, string2) < 0 )
//			System.out.println(string1 + " <-is less than-> " + string2);
//		else if(compareLex.compareLexicographically(string1, string2) > 0 )
//			System.out.println(string1 + " <-is grather than-> " + string2);
//		else
//			System.out.println(string1 + " <-is equal than-> " + string2);
		
		// 3.
//		ContentEndWithStrings content = new ContentEndWithStrings();
//		System.out.print("Enter a string1: ");
//		String str1 = ConsoleInput.getString();
//		StringBuffer string1 = new StringBuffer(str1);
////		String lastTwoStr1 = string1.substring(string1.length()-2,string1.length()-1);
//		char str1LastIdxChar1 = string1.charAt(string1.length() - 1);
//		char str1LastIdxChar2 = string1.charAt(string1.length() - 2);
//		
//		System.out.print("Enter a string2: ");
//		String str2 = ConsoleInput.getString();
//		StringBuffer string2 = new StringBuffer(str2);
////		String lastTwoStr2 = string2.substring(string2.length()-2,string2.length()-1);
//		char str2LastIdxChar1 = string2.charAt(string2.length() - 1);
//		char str2LastIdxChar2 = string2.charAt(string2.length() - 2);
//		
//		if(content.contentEndWithStrings(str1LastIdxChar1,str1LastIdxChar2,str2LastIdxChar1,str2LastIdxChar2))
//		{
//			System.out.println(string1 +" ends with " +" '" +str1LastIdxChar2+str1LastIdxChar1 +"' & '" +str2LastIdxChar2+str2LastIdxChar1 +"' both same "+ true);    
//		}
//		else
//			System.out.println(string1 +" ends with " +" '" +str1LastIdxChar2+str1LastIdxChar1+"' & "+string2 +" ends with " +"'" +str2LastIdxChar2+str2LastIdxChar1 +"' not same "+ false);           
//		
		
		
		//4.
//		CharacterAlphabate charAlph = new CharacterAlphabate();
//
//		System.out.print("Enter a string: ");
//
//		String str = ConsoleInput.getString();
//
//		StringBuffer string = new StringBuffer(str.toLowerCase());
//
//
//		// a to j
//		for (char ch = 'a'; ch <= 'j'; ch++) {
//			System.out.print(ch + " ");
//		}
//
//		System.out.println();
//
//		System.out.println("===========================");
//
//		for (char ch = 'a'; ch <= 'j'; ch++) {
//			System.out.print(charAlph.getAllIdx(string, ch) + " ");
//		}
//
//		System.out.println();
//		System.out.println();
//
//
//		// k to t
//		for (char ch = 'k'; ch <= 't'; ch++) {
//			System.out.print(ch + " ");
//		}
//
//		System.out.println();
//
//		System.out.println("===========================");
//
//		for (char ch = 'k'; ch <= 't'; ch++) {
//			System.out.print(charAlph.getAllIdx(string, ch) + " ");
//		}
//
//		System.out.println();
//		System.out.println();
//
//
//		// u to z
//		for (char ch = 'u'; ch <= 'z'; ch++) {
//			System.out.print(ch + " ");
//		}
//
//		System.out.println();
//
//		System.out.println("=================");
//
//		for (char ch = 'u'; ch <= 'z'; ch++) {
//			System.out.print(charAlph.getAllIdx(string, ch) + " ");
//		}
		
		
		//5.
//		StringReplace strReplace = new StringReplace();
//
//		System.out.print("Enter a string: ");
//
//		String str = ConsoleInput.getString();
//
//		StringBuffer string = new StringBuffer(str);
//
//		System.out.print("Enter a word to replace: ");
//
//		String oldWord = ConsoleInput.getString();
//
//		System.out.print("Enter new word: ");
//
//		String newWord = ConsoleInput.getString();
//
//		System.out.println("Original string: " + string);
//
//		strReplace.replaceString(string, oldWord, newWord);
//
//		System.out.println("New String: " + string);
		
		//6.
		
		UpperCase upperCase= new UpperCase();
		
		System.out.print("Enter a string: ");
		
		String str = ConsoleInput.getString();
		
		StringBuffer string = new StringBuffer(str);
		
		System.out.println("Original string: " + string);
		
		upperCase.upperCase(string);
		
		System.out.println("String in uppercase: " + string);
		
		
		//7.
//		ReverseString reverseString= new ReverseString();
//		
//		System.out.print("Enter a string: ");
//		
//		String str = ConsoleInput.getString();
//		
//		StringBuffer string = new StringBuffer(str);
//		
//		System.out.println("The given string is: " + string);
//		
//		reverseString.reverseStr(string);
//		
//		System.out.println("The string in reverse order is: " + string);
	}

}
