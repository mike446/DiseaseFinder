import java.util.*;

public class symp extends patrec{
	
	//URL myURL = new URL("http://example.com/");
	String link = "<a href=\"https://www.mayoclinic.org/diseases-conditions/common-cold/symptoms-causes/syc-20351605\" </a>";

	// instance variables so that we can call it into other methods 
	private Object[][] values = new Object[2][3];
	//Object a= values[1][0];	
   // Object b= values[1][1];	 
    //Object c= values[1][2];
  Scanner in = new Scanner(System.in);
  /**
   * constructor 
   * @param patientName
   * @param patientAge
   * @param patientEmail
   */
  
  public symp(String patientName, int patientAge, String patientEmail) {
    super(patientName, patientAge, patientEmail);
  }
  
  
  
  public Object getQuestion() {
	  System.out.println("\nWelcome to Disease Finder! \n");
	  
	  
	  
	  values = new Object[2][3];
	  values[0][0] = "fever";
	  values[0][1] = "headache";
	  values[0][2] = "fatigue";
	  for (int i = 0;i<3;i++){
	    System.out.print("One a scale from 1 to 3 enter you level of "+ values[0][i] +": " );
	         int choice = in.nextInt(); 
	    if(choice == 0){		
	    values[1][i] = 0;
	    }
	      else{
	    	  while(choice < 1 ||choice > 3){
	      System.out.print("please enter a number between 1 and 3: ");
	      choice = in.nextInt();}
	      }
		  //choice = Integer.parseInt(values.toString());
	    values[1][i] = choice;
	  }
    int a = (int)values[1][0];
    int b = (int)values[1][1];
    int c = (int)values[1][2];
    if(a==3 && b == 3 && c == 2 ){
      return "covid";
    }
    else if (a == 3 && b == 2 && c ==2){
      return "severe cold" + link;
    }
    else if(a == 2 && b == 2  && c == 2  ){
      return "minor cold";
    }
    else if(a == 3 && b == 3  && c == 3){
      return "Adem";
    }
	else if(a == 2 && b == 3  && c == 1){
      return "migrane";
  }
	else if(a == 1 && b == 2  && c == 1){
      return "vasciltis";
  }
	else if(a == 1 && b == 2  && c == 3){
      return "fibromyalgi";
  }
	else if(a == 3 && b == 3  && c == 2){
      return "Covid";
	}
	else{
		return "Please consult with a physician ";
	}
}
}