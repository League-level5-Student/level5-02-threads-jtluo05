package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	int j;

	ThreadedGreeter(int i) {
		j = i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: " + j);
		
		ThreadedGreeter tg = new ThreadedGreeter(j + 1);
		
		if (j <= 50) {
			Thread t = new Thread(tg);
			t.start();
			
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
