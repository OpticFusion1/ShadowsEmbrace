package optic_fusion1.shadowsembrace.component.enemy;

import java.util.Random;
import optic_fusion1.engine.component.Component;
import optic_fusion1.engine.game.Game;

public class BaseEnemy extends Component {

  private static final Random RANDOM = new Random();
  private int damageChance;
  private int hpChance;
  private int maxHP;
  private int maxDamage;

  public BaseEnemy(int damageChance, int hpChance, int maxHP, int maxDamage, String name, Game game) {
    super(name, game);
    this.damageChance = damageChance;
    this.hpChance = hpChance;
    this.maxHP = maxHP;
    this.maxDamage = maxDamage;
  }

  public int getHP() {
    int monsterHP = RANDOM.nextInt(hpChance);
    if (monsterHP <= maxHP) {
      monsterHP = maxHP;
    }
    return monsterHP;
  }

  public int getDamage() {
    int monsterDamage = RANDOM.nextInt(damageChance);
    if (monsterDamage <= 20) {
      monsterDamage = maxDamage;
    }
    return monsterDamage;
  }

  @Override
  public void tick() {
  }

  @Override
  public void render() {
  }

}
