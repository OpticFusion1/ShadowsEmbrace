package optic_fusion1.shadowsembrace.component.enemy;

import java.util.HashMap;
import java.util.Random;

public class EnemyManager {

  private static final Random RANDOM = new Random();
  private static final HashMap<String, BaseEnemy> ENEMIES = new HashMap<>();
  private BaseEnemy[] ENEMIES_ARRAY;

  public void registerEnemies() {
    registerEnemy(new Ghoul());
    registerEnemy(new Skeleton());
    registerEnemy(new Vampire());
    registerEnemy(new Wraith());
    registerEnemy(new Zombie());
    ENEMIES_ARRAY = (BaseEnemy[]) ENEMIES.values().toArray();
  }

  private void registerEnemy(BaseEnemy enemy) {
    ENEMIES.putIfAbsent(enemy.getName(), enemy);
  }

  public BaseEnemy getEnemy() {
    return ENEMIES_ARRAY[RANDOM.nextInt(ENEMIES_ARRAY.length)];
  }

}
