package coom.mehmet.miniproje;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
	Random rnd=new Random();
	BlockingQueue<Integer> que=new ArrayBlockingQueue<Integer>(10);
	int value;
	
	public void producer() {
		while (true) {
		try {
			Thread.sleep(1000);
		
			 value= rnd.nextInt(100);
			que.put(value);
			System.out.println("Ekledim Kanka= "+value);
		//	System.out.println("QUE size= "+que.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Hata= "+e);
		}
		}
	}
	public void consumer() {
		while(true) {
			try {
				Thread.sleep(5000);
				 value=que.take();
				System.out.println("ALdım Kanka :"+value );
				System.out.println("Array Size= " +que.size());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}


