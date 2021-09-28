package _04_Thread_Pool.tests;

import java.util.Iterator;

public class WorkQueue implements Runnable{
private Thread[] threads;
private boolean isRunning=true;

public WorkQueue(){
	int totalThreads= Runtime.getRuntime().availableProcessors()-1;
	threads= new Thread[totalThreads];
}
	
public int getThreadCount() {
	return threads.length;
}

public void shutDown() {
	isRunning=false;
}



	@Override
	public void run() {
		while(isRunning) {
			System.out.println("Output from thread #" + Thread.currentThread().getId());
		}
		// TODO Auto-generated method stub
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(this);
			threads[i].start();
		}
		
		
		
	}

}
