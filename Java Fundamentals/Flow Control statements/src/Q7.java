
public class Q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var = 'A';
		if (var >= 'a' && var <= 'z')
			System.out.println(var+"->"+(char)(var-32));				//lowercase to uppercase
		
	     else
	    	 System.out.println(var+"->"+(char)(var+32)); 			//uppercase to lowercase
	}
}
