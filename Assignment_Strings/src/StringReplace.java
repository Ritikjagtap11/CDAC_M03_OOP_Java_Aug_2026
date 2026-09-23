public class StringReplace {

	public void replaceString(StringBuffer str, String oldWord, String newWord) {

		int startIdx = str.indexOf(oldWord);

		if (startIdx != -1) {

			str.replace(startIdx, startIdx + oldWord.length(), newWord);

		}
	}
}