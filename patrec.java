/**
@author Mikias Tadesse and Kidus Paulos 
@version Fall 1302  
*/
import java.util.*;
public abstract class patrec {
  // imports the scanner object 
  Scanner in = new Scanner(System.in);
  // instance variables
  private String patientName = "";
  private int patientAge = 0;
  private String patientEmail;

  /**
   * Constructor 
   * @param patientName
   * @param patientAge
   * @param patientEmail
   */
  public patrec(String patientName, int patientAge, String patientEmail) {
	System.out.print("Please enter your name: ");
    this.patientName = in.next();
	System.out.print("Please enter your age: ");    
    this.patientAge = in.nextInt();
    System.out.print("Please enter your email: ");
    this.patientEmail = in.next();
  }

  // method header for abstract class getQuestions
  public abstract Object getQuestion();
 
  /*
   * toString that prints the name, age, and email of the patient
   */
  public String toString() {
    return "\nname: " + patientName + "\nage: " + patientAge + "\nemail: " + patientEmail + "\nDisease: "+ getQuestion();
  }
}