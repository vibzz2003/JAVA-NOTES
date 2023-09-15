public class sorry { 
	public static void main(String[] args) { 
		String[] message = {"Please Forgive Me", "I won't do it Again", "I Love You"}; //Add as many messages as you want to show your feelings 
		while(true) { 
			System.out.println("I'm Sorry, " + message[(int) (Math.random() * message.length)]);
        }            
	} 
} 