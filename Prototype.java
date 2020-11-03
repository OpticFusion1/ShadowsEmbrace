import java.util.Random;
import java.util.Scanner;
public class Prototype
{
	//Variables
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    int heal = 3;
    int monsterHP = 10;
    int playerHP = 100;
    int monsterAttack = r.nextInt(10);
    int playerChoice;
    int subChoice;
    int attackDamage = r.nextInt(30);
    String user;
	
	public static void main(String[] args) 
	{
		
		Prototype game = new Prototype();
		game.playerSetup();
		game.gameStart();
		game.monsterFight();
	}

	public void playerSetup()
	{
	    System.out.println("------------------------------------------------"); 
	    System.out.println("Welcome to Shadow's Embrace.");
	    System.out.print("Your adventure begins here. Please enter a name: ");
	    user = s.nextLine();
	}
	
	public void gameStart()
	{
		 //START OF GAME
	        System.out.println("------------------------------------------------"); 
		System.out.println(user +" You are a man fighting for your love of your life! You must rescue her in order for you to successfully finish this mission!");
		System.out.println("(Press ENTER to proceed.)");
		s.nextLine();		
		
	}
	
	public void monsterFight()
	{
		String monster = "First Monster";
		System.out.println(monster + " has arrived!");
		System.out.println("What do you want to do?");
		System.out.println("1. Attack");
		System.out.println("2. Ignore");
		System.out.println("3. Run");
		playerChoice = s.nextInt();
		
		if (playerChoice == 1)
		{
			
			playerHP = playerHP - monsterAttack;
			monsterHP = monsterHP - attackDamage;
			
			System.out.println("You attacked the monster for " + attackDamage + " HP! " + "The Monsters HP is currently " + monsterHP);
			System.out.println("");
			System.out.println("The monster attacked you for " + monsterAttack + " HP!" + " Your health is currently " + playerHP);
			System.out.println("");
				if (monsterHP > 0 )
				{
					System.out.println("What do you want to do?");
					System.out.println("1. Attack");
					System.out.println("2. Heal");
					System.out.println("3. Run");
					subChoice = s.nextInt();
					if (subChoice == 1) 
					{
						System.out.println("You killed the monster! It's time to continue and find your love of your life.");
					}
				} 
				else
				{
					System.out.println("What do you want to do?");
					System.out.println("1. Heal");
					System.out.println("2. Run");
					subChoice = s.nextInt();
					
					if (subChoice == 1)
					{
						heal--;
						System.out.println("You used your heal your HP is now back to full. You have " + heal + " heals left");
					}
				}
			
		}
		
		
	}

}	

