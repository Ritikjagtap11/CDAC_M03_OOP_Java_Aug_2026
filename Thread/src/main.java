public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Data objData = new Data();
		
		IncreamentThread incThread =  new IncreamentThread();
		Thread finalthread = new Thread(incThread);
		finalthread.start();
		
		DecrementThread target = new DecrementThread();
		target.start();
		
		Runnable r = ()->{
			
			try {
				while(true) {
					System.out.println("Vivek Lvda");
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		};
		
		Thread thread = new Thread(r);
		thread.start();
		
		
		
		
		
		
		
		
		/*
		 * Thread decThread = new Thread(target);
		 * 
		 * decThread.start();
		 */
		
		
		

	}

}
