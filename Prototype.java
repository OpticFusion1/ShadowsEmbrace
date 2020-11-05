import java.util.Scanner;
import java.util.Random;
public class ShadowsEmbrace 
{
	/*
	AUTHORS NOTE:
	This is only a prototype of the game not the final product/final storyline	
	*/
	
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	int playerHP = 100;
	String playerName;
	int choice;
	int monsterHP = r.nextInt(25);
	String monster[] = {"Skeleton", "Warrior" , "Archer"};
        int monsterRandomizer = r.nextInt(monster.length);
	int monsterCounter = 2;
	int key;
		
	public static void main(String[] args) 
	{

		ShadowsEmbrace game;
		game = new ShadowsEmbrace();	
		
		game.playerSetUp(); 	
		game.startUp();
	}
	
	public void playerSetUp(){
		
	    System.out.println("------------------------------------------------"); 
	    System.out.println("\nWelcome to Shadow's Embrace.");
	    System.out.print("Your adventure begins here. Please enter a name: ");
		
	    playerName = s.nextLine();
	    System.out.println();
	    System.out.println("Hello " + playerName + ", let's start the game!");	
		
		
	}	
	
	public void startUp(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println(playerName +" You are a man fighting for Nessa. You must rescue her in order for you to successfully finish this mission!");
		System.out.println("But beware of dangerous underground creatures that you may encounter!");
		System.out.println("You need to defeat 3 boss in order for you to sucessfully retrieve her");
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("1: Continue Walking");
		System.out.println("2: Exit Game");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.print("Select: ");
		choice = s.nextInt();
		
		if(choice==1)
		{
			monsterFight();		
		}
			
		
		else if(choice==2)
		{
			System.out.println("You left the game.");
		}
		
		
		else
		{
			startUp();
		}
	}
	
	
	
	
	
	
	public void monsterFight()
	{
		while (monsterCounter > 0)
		{
			monsterCounter--;
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("You encountered a " + monster[monsterRandomizer] + "!\n");
			System.out.println("Choose:");
			System.out.println("1: Fight");
			System.out.println("2: Run");
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.print("Select: ");
			choice = s.nextInt();
		
			if(choice==1)
			{
				fight();
			}
			
			else if (choice == 2)
			{
			    System.out.println("You can't run!" + monster[monsterRandomizer] + " killed you");
			}
		}
	}
	
	
	
	public void fight()
	{
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("\t>Your HP: "+ playerHP);
		System.out.println("\t>Monster HP: " + monsterHP);
		System.out.println("Choose:");
		System.out.println("\n1: Attack");
		System.out.println("2: Run");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.print("Select: ");
		choice = s.nextInt();
		
		if(choice==1)
		{
		    attack();
		}
		else if(choice==2)
		{
		    System.out.println("You can't run!" + monster[monsterRandomizer] + " killed you");
		}
		else
		{
		    fight();
		}
		if (monsterHP <= 0)
		{
		    monsterHP = r.nextInt(25);
		}
	}
	
	public void attack()
	{
		int playerDamage = r.nextInt(25);
		//int newMonsterHP; FOR TESTING PURPOSES
		System.out.println("");
		System.out.println(monsterCounter + " enemies left!");
		System.out.println("You attacked the monster and gave " + playerDamage + " damage!");
		
		monsterHP = monsterHP - playerDamage;
		
		System.out.println("Monster HP: " + monsterHP);
		System.out.println("Please enter (1) to continue");
		
		if(monsterHP<1)
		{
		    win(); 
		} 
		
		else if(monsterHP > 0)
		{
		    fight();
			
			
			
			if(playerHP<1)
			{ 
			    dead(); 
			} 
			
			else if(playerHP>0)
			{
			    fight();
			}
		}
		
		
	}
	
	public void dead()
	{
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You are dead!!!");
		System.out.println("\n\nGAME OVER");
		System.out.println("\n------------------------------------------------------------------\n");
		
	}
	
	public void win()
	{
		if(monsterCounter == 0)
		{
		    System.out.println("\n------------------------------------------------------------------\n");
		    System.out.println("You killed all the monster!");
		    System.out.println("The monster dropped a key to the dungeon!");
		    System.out.println("You obtaind a key!\n\n");
		    System.out.println("1: Continue to the dungeon");
		    System.out.println("\n------------------------------------------------------------------\n");
		}
		key = 1;
		
		choice = s.nextInt();
		if(choice==1)
		{
			//SOON 
			//TO ENTER OR TO GO TO DUNGEON TO FIGHT THE BOSS
		}
		else
		{
			win();
		}
		
	}
	
	
	
	public void firstBossFight()
	{
		
	}
	
	public void secondBossFight()
	{
		
	}
	
	public void finalBossFight()
	{
		
	}
	
	
	
	public void ending()
	{
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Work");
		System.out.println("in");
		System.out.println("Progress ");
		System.out.println("\n------------------------------------------------------------------\n");
	}
	
}

