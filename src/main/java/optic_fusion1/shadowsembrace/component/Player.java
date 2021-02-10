package optic_fusion1.shadowsembrace.component;

import java.util.Random;
import optic_fusion1.engine.component.Component;
import optic_fusion1.engine.game.Game;

public class Player extends Component {

  private Random r = new Random();
  private int playerHP = 100;
  private int maxPlayerHP = r.nextInt(300);
  private int playerDamage = r.nextInt(25);
  private int maxPlayerDamage;
  private int choice;
  private int role;
  private String playerWeapon;

  public Player(String name, Game game) {
    super(name, game);
  }

  public Random getR() {
    return r;
  }

  public void setR(Random r) {
    this.r = r;
  }

  public int getPlayerHP() {
    return playerHP;
  }

  public void setPlayerHP(int playerHP) {
    this.playerHP = playerHP;
  }

  public int getMaxPlayerHP() {
    return maxPlayerHP;
  }

  public void setMaxPlayerHP(int maxPlayerHP) {
    this.maxPlayerHP = maxPlayerHP;
  }

  public int getPlayerDamage() {
    return playerDamage;
  }

  public void setPlayerDamage(int playerDamage) {
    this.playerDamage = playerDamage;
  }

  public int getMaxPlayerDamage() {
    return maxPlayerDamage;
  }

  public void setMaxPlayerDamage(int maxPlayerDamage) {
    this.maxPlayerDamage = maxPlayerDamage;
  }

  public int getChoice() {
    return choice;
  }

  public void setChoice(int choice) {
    this.choice = choice;
  }

  public int getRole() {
    return role;
  }

  public void setRole(int role) {
    this.role = role;
  }

  public String getPlayerWeapon() {
    return playerWeapon;
  }

  public void setPlayerWeapon(String playerWeapon) {
    this.playerWeapon = playerWeapon;
  }

  @Override
  public void tick() {
  }

  @Override
  public void render() {
  }

}
