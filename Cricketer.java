public class Cricketer {
	static String boardName;
	static String countryName;
	
	
	String cricketerName;
	int jerceyNumber;
	int highestScore;
	
	public static void main(String[] args) {
		System.out.println("Welcome to cricket team");
		boardName="BCCI";
		countryName="INDIA";
		
//		object one
		Cricketer cricket=new Cricketer();
		
		cricket.cricketerName="Dhoni";
	    cricket.jerceyNumber=7;
	    cricket.highestScore=67;
	    System.out.println(boardName);
	    System.out.println(countryName);
	    System.out.println(cricket.cricketerName);
	    System.out.println(cricket.jerceyNumber);
	    System.out.println(cricket.highestScore);
		
//   object two
	    
	 
	    cricket.cricketerName="rahul";
	    cricket.jerceyNumber=21;
	    cricket.highestScore=99;
	    System.out.println(boardName);
	    System.out.println(countryName);
	    System.out.println(cricket.cricketerName);
	    System.out.println(cricket.jerceyNumber);
	    System.out.println(cricket.highestScore);
// object three
		
	    
	    cricket.cricketerName="ruturaj";
	    cricket.jerceyNumber=6;
	    cricket.highestScore=56;
	    System.out.println(boardName);
	    System.out.println(countryName);
	    System.out.println(cricket.cricketerName);
	    System.out.println(cricket.jerceyNumber);
	    System.out.println(cricket.highestScore);
	   
// object four
	    cricket.cricketerName="rahane";
	    cricket.jerceyNumber=9;
	    cricket.highestScore=100;
	    System.out.println(boardName);
	    System.out.println(countryName);
	    System.out.println(cricket.cricketerName);
	    System.out.println(cricket.jerceyNumber);
	    System.out.println(cricket.highestScore);
		
		

	}

}
