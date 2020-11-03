import java.util.Random;
import java.util.Scanner;
public class Prototype
{
	
	public static void main(String[] args) 
	{
		//Variables
	    Scanner s = new Scanner(System.in);
	    Random r = new Random();
	    int monsterHP = 15;
	    int playerHP = 100;
	    int playerChoice;
		
		//Introduction to the game
	    
	    System.out.println("--------------------------------------");
	    System.out.println("Welcome to Shadow's Embrace");
	    System.out.print("Please enter your name: ");
	    String user = s.nextLine();
	    System.out.println("Welcome  " + user + " Please press ENTER to start");   	
	}

	public void gameStart()
	{
		 //START OF GAME
	    System.out.println("--------------------------------------"); 
	    System.out.println("");
	}
	

}	
