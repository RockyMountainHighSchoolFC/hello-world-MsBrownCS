
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Hello World");
     
     System.out.println("Donald " + "duck");
     
     String theName = "Donald Duck";
     int len = theName.length();
     
     System.out.println(len);
     
     //Demonstration of substring with 1 argument - starting point
     String myPet = "Sparky the dog";
     String smallPart = myPet.substring(4);
     System.out.println(smallPart);
     
     //Demonstration of substring with 2 arguments - starting & ending point
     String myPet2 = "Sparky the dog";
     String smallPart2 = myPet.substring(4, 12);
     System.out.println(smallPart2);
     
     //Demonstration of toLowerCase & toUpperCase
     String bismark = "Dude, where's MY car?";
     System.out.println(bismark.toLowerCase());
     System.out.println("Dude, where's MY car?".toUpperCase());
     
     //Demonstration of escape sequences
     //add quotes into a string
     String s = "What \"is\" the right way?";
     System.out.println(s);
     //add a new line into a string
     String n = "here is one line \n and here is another.";
     System.out.println(n);
     //add a backslash within a string
     System.out.println("Path = c:\\my_file.doc");
     //add a tab in a string
     System.out.println("Name:\t\tAddress:");
     
     //Demonstration of the use of Methods
     String str = "Hello World Method";
     printGreeting(str);
	}
	
	public static void printGreeting(String x)
	{
		System.out.println(x);
	}
}

