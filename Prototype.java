import java.util.Scanner;
import java.util.Random;
public class ShadowsEmbrace 
{
	
	//SYSTEM VARIABLES
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	
	//PLAYER VARIABLES
	int playerHP = 100;
	int maxPlayerHP = r.nextInt(300);
	String playerName;
	int playerDamage = r.nextInt(25);
	int maxDamage = r.nextInt(40);
	int choice;
	int role;
	String playerWeapon;
	
	//OTHER GAME VARIABLES
	int monsterHP = r.nextInt(25);
	String monster[] = {"Skeleton", "Ghoul", "Wraith", "Zombie","Vampire",};
        String monsterRandomizer = monster[r.nextInt(monster.length)];
	int monsterCounter = 2;
	
	
	//ITEMS
	
	int healLeft = 3;
	int reviveLeft;
	int key;
		
	public static void main(String[] args) 
	{

		ShadowsEmbrace game;
		game = new ShadowsEmbrace();	
		
		game.playerSetUp(); 	
		game.startUp();
	}
	
	public void playerSetUp(){
		
	        System.out.println("\t------------------------------------------------"); 
	        System.out.println("\n\tWelcome to Shadow's Embrace.");
	        System.out.print("\tYour adventure begins here. Please enter a name: ");
		playerName = s.nextLine();
		System.out.println("\t------------------------------------------------"); 
		
		System.out.print("\n\tHello " + playerName + ", let's pick a role!");
		System.out.println("\n\t1. Warrior 	");
		System.out.println("\t2. Mage");
		System.out.println("\t3. Archer");
		System.out.print("Select: ");
		
		role = s.nextInt();
		
		System.out.println("\t------------------------------------------------"); 
		
		//ROLES OR CLASSES TO SELECT
		
		if (role == 1)
		{
			maxPlayerHP = r.nextInt(140);
			
			
			System.out.println("Class: Warrior.");
			playerWeapon = "Long Sword";
			playerDamage = playerDamage + maxDamage;
			playerHP = playerHP + maxPlayerHP;
			System.out.println("Player Weapon: " + playerWeapon);
			System.out.println("Player HP: " + playerHP);
			System.out.println("Possible Damage: " + playerDamage);
			System.out.println("Health Potions Left: " + healLeft);
			
		
		}
		
		else if (role == 2)
		{
			maxPlayerHP = r.nextInt(140);
			maxDamage = r.nextInt(100);
			
			System.out.println("Class: Mage.");
			playerWeapon = "Staff";
			playerDamage = playerDamage + maxDamage;
			playerHP = playerHP + maxPlayerHP;
			System.out.println("Player Weapon: " + playerWeapon);
			System.out.println("Player HP: " + playerHP);
			System.out.print("Possible Damage: " + playerDamage);
			System.out.println("Health Potions Left: " + healLeft);
			
		
		}
		
		else if (role == 3)
		{
			maxPlayerHP = r.nextInt(200);
			maxDamage = r.nextInt(75);
			
			System.out.println("Class: Archer.");
			playerWeapon = "Bow";
			playerDamage = playerDamage + maxDamage;
			playerHP = playerHP + maxPlayerHP;
			System.out.println("Player Weapon: " + playerWeapon);
			System.out.println("Player HP: " + playerHP);
			System.out.print("Possible Damage: " + playerDamage);
			System.out.println("Health Potions Left: " + healLeft);
		}
		
		else
		{
			System.out.println("Invalid Command");
		}
	}	
	
	public void startUp(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println(playerName +" You are a man fighting for Nessa. You must rescue her in order for you to successfully finish this mission!");
		System.out.println("But beware of dangerous underground creatures that you may encounter!");
		System.out.println("You need to defeat 3 boss in order for you to sucessfully retrieve her");
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("[1]: Continue Walking");
		System.out.println("[2]: Exit Game");
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
			System.out.println("Invalid Command");
			startUp();
		}
	}
	
	

	public void monsterFight()
	{
		while (monsterCounter > 0)
		{
			monsterCounter--;
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.println("You encountered a " + monsterRandomizer + "!\n");
			System.out.println("Choose:");
			System.out.println("[1:] Fight");
			System.out.println("[2:] Run");
			System.out.println("\n------------------------------------------------------------------\n");
			System.out.print("Select: ");
			choice = s.nextInt();
		
			if(choice==1)
			{
				fight();
			}
			
			else if (choice == 2)
			{
			System.out.println("You can't run!" + monsterRandomizer + " killed you");
			}
		}
	}
	
	
	public void fight()
	{
		monsterRandomizer = monster[r.nextInt(monster.length)];
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("\t>Your HP: "+ playerHP);
		System.out.println("\t>Monster HP: " + monsterHP);
		System.out.println("Choose:");
		System.out.println("\n[1:] Attack");
		System.out.println("[2:] Run");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.print("Select: ");
		choice = s.nextInt();
		
		if(choice==1)
		{
			attack();
		}
		
		else if(choice==2)
		{
			System.out.println("You can't run!" + monsterRandomizer + " killed you");
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
		//int playerDamage = r.nextInt(25);
		
		System.out.println("");
		System.out.println("There are " + monsterCounter + " enemies left!");
		System.out.println("You attacked the monster and dealt " + playerDamage + " damage!");
		
		monsterHP = monsterHP - playerDamage;
		
		System.out.println("Monster HP: " + monsterHP);
		System.out.println("Please enter (1) to continue");
		
		if(monsterHP<=0)
		{
			win(); 
		} 
		
		else if(monsterHP > 0)
		{
			fight();
			
			if(playerHP<=0)
			{ 
				dead(); 
			} 
			
			else if(playerHP>0)
			{
				fight();
			}
		}
		else if(playerHP<=0)
			{ 
				dead(); 
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
		String monsterRandomizer = monster[r.nextInt(monster.length)];
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

