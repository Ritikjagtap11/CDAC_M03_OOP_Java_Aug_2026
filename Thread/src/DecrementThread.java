
public class DecrementThread extends Thread{

	/*
	 * Data objData;
	 * 
	 * public DecrementThread(Data objData) { super(); this.objData = objData; }
	 */

	@Override
	public void run() {
		try {

			while (true) {
				System.out.println("Decrements");
				Thread.sleep(50);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
