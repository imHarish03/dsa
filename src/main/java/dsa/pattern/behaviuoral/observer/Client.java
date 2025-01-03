package dsa.pattern.behaviuoral.observer;

public class Client {
	
	public static void main(String[] args) {
		Channel telusko= new Channel();
		
		Subscribers s1=new Subscribers("Usr 1");
		Subscribers s2=new Subscribers("Usr 2");
		Subscribers s3=new Subscribers("Usr 3");
		Subscribers s4=new Subscribers("Usr 4");
		
		s1.subsribeChannel(telusko);
		s2.subsribeChannel(telusko);
		s3.subsribeChannel(telusko);
		s4.subsribeChannel(telusko);
		
		telusko.upload("How observerWorks");
	}

}
