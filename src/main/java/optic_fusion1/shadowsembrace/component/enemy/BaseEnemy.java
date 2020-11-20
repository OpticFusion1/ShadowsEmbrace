package optic_fusion1.shadowsembrace.component.enemy;

import java.util.Random;
import optic_fusion1.engine.component.Component;

public class BaseEnemy extends Component {

  private static final Random RANDOM = new Random();
  private int damageChance;
  private int hpChance;
  private int maxHP;
  private int maxDamage;

  public BaseEnemy(String name, int damageChance, int maxDamage, int hpChance, int maxHP) {
    super(name);
    this.damageChance = damageChance;
    this.hpChance = hpChance;
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

}
