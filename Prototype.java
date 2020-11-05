import java.util.Random;
import java.util.Scanner;
public class Prototype
{
	//System Variables
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    int playerChoice;
    int subChoice;
    String user;
    
    //Player Variables
    int heal = 3;
    int playerHP = 100;
    int attackDamage = r.nextInt(30);
    String playerWeapon;
    
    //Items
    int key;
    
    //Monster/Enemy Variables
    int monsterAttack[] = {5,10,15,20,25};
    int monsterHP = 50;
    int monsterCount = 10;
    String monster[] = {"Skeleton", "Warrior" , "Archer"};
    int monsterRandomizer = r.nextInt(monster.length);
    
	
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
	    System.out.println("\nWelcome to Shadow's Embrace.");
	    System.out.print("Your adventure begins here. Please enter a name: ");
	    user = s.nextLine();
	}
	
	public void gameStart()
	{
		 //START OF GAME
	 	System.out.println("\n------------------------------------------------"); 
	 	System.out.println(user +" You are a man fighting for your love of your life! You must rescue her in order for you to successfully finish this mission!");
       	 	System.out.println("(Press ENTER to proceed.)");
	 	s.nextLine();		
		
	}
	
	
	public void monsterFight()
	{
		monsterHP = 50;
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You encountered " + monster[monsterRandomizer]);
		System.out.println("Monster HP: " + monsterHP);
		System.out.println("\n1: Attack");
		System.out.println("2: Run");
		System.out.println("\n------------------------------------------------------------------\n");
		
		subChoice = s.nextInt();
		
		if(subChoice==1)
		{
			attack();
		}
		else if(subChoice==2)
		{
			System.out.println("There's no running in here! its either you fight or you die.");
			System.out.println("The " + monster[monsterRandomizer] + " killed you");
			dead();
		}
		else
		{	
			monsterFight();
		}
		
	}
	
	
	
	public void attack()
	{
		
		int playerDamage = r.nextInt(50);
		
	
		
		System.out.println("You attacked the monster and gave " + playerDamage + " damage!");
		int monsterHP = 50;
		monsterHP = monsterHP - playerDamage;
		
		System.out.println("Monster HP: " + monsterHP);
		
		if(monsterHP<1)
		{ 
			monsterKilled(); 
		} 
		
		else if(monsterHP>0)
		{
			int monsterDamage =0;
			
			monsterDamage = new java.util.Random().nextInt(4);
			
			System.out.println("The monster attacked you and gave " + monsterDamage + " damage!");
			
			playerHP = playerHP - monsterDamage;
			
			System.out.println("Player HP: " + playerHP);
			
			if(playerHP<1)
			{
				dead(); 
			} 
			
			else if(playerHP>0)
			{
				attack();
			}
		}
		
		
	}
	
	
	public void monsterKilled()
	{
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You killed the monster!");
		System.out.println("The monster dropped the key towards the dungeon!");
		System.out.println("You obtained the key!\n\n");
		System.out.println("1. Go to dungeon");
		System.out.println("2. Exit");
		subChoice = s.nextInt();
		
		key = 1;
		
		if (subChoice == 1 )
		{
			bossFight();
		}
		
		else 
		{
			System.out.println("You left the game. You FAILED");
		}
	
	}
	
	
	public void dead()
	{
		System.out.println("You died game over.");
	}
	
	public void bossFight()
	{
		//System.out.println("Test");
		s.nextLine();
	}
	
	public void ending()
	{
	}
}	
