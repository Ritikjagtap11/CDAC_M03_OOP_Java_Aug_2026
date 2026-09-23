
public class CharacterAlphabate {
	
	
	public int getAllIdx(StringBuffer str, char ch) {

		int idx = -1;

		for (int iTmp = 0; iTmp < str.length(); iTmp++) {

			if (str.charAt(iTmp) == ch) {

				idx = iTmp;
				break;
			}
		}

		return idx;
	}
}
