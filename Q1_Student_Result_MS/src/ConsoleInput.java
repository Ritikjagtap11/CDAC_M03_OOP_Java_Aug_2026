import java.io.IOException;

public class ConsoleInput {

	public String getString() {
		String  string = "";
		try {
			byte[] arr = new byte[100];
			int length = System.in.read(arr);
			byte[] finalArr = new byte[length-2];
			System.arraycopy(arr, 0, finalArr, 0, length-2);
			string = new String(finalArr);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return string;
	}
	
	public int getInt() {
		return Integer.parseInt(getString());
	}
	public float getFloat() {
		return Float.parseFloat(getString());
	}
}
