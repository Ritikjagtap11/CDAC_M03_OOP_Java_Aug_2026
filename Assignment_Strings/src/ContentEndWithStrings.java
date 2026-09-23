
public class ContentEndWithStrings {

	public boolean contentEndWithStrings(char st1LIstr1,char st1LIstr2,char str2LIstr1, char str2LIstr2) 
	{
		boolean Istrue = false;
		if ((st1LIstr1 == str2LIstr1) && (st1LIstr2 == str2LIstr2)) {
			Istrue = true;
		}
		return Istrue;
	}
}
