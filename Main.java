package coom.mehmet.miniproje;

public class Main {
public static void main(String[] args) {
	
	ProducerConsumer pc=new ProducerConsumer();
	
	
	Thread producer=new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			pc.producer();
		}
	});
	Thread consumer=new Thread(new Runnable() {
		
		@Override
		public void run() {
			pc.consumer();
		}
	});
	producer.start();
	consumer.start();
	
	
	try {
		producer.join();
		consumer.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
