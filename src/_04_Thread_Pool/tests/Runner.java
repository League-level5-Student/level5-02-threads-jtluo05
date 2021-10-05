package _04_Thread_Pool.tests;

public class Runner {
public static void main(String[] args) {
	WorkQueue wq= new WorkQueue();
	System.out.println("Total threads: "+ wq.getThreadCount());
	try {
		Thread.sleep(1000);
	} catch(InterruptedException e) {
		
	}
	
	wq.shutDown();
	
}
}
