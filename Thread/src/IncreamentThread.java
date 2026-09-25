
public class IncreamentThread implements Runnable {

	/*
	 * Data objData;
	 * 
	 * public IncreamentThread(Data objData) { super(); this.objData = objData; }
	 */

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Increments");
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
