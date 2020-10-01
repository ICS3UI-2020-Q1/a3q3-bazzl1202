import java.util.Scanner;
/**
 * Asks for the letter of your grade and tells you the percentage range it is in.
 * @author Liana Bazzarella 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // get the user letter grade input
    System.out.println("Please enter a letter grade");
    String letterGrade = input.nextLine();

    //determine the letter grade percentage range
    switch(letterGrade){
      case "A": 
      System.out.println("This is between 80% and 100%");
      break;
      case "B":
      System.out.println("This is between 70% and 79%");
      break; 
      case "C":
      System.out.println("This is between 60% and 69%");
      break;
      case "D":
      System.out.println("This is between 50% and 59%");
      break;
      case "F":
      System.out.println("This is between 0% and 49%");
      break;
      default:
      System.out.println("Invalid letter grade");
    }
    
  }
}
