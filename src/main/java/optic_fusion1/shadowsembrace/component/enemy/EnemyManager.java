package optic_fusion1.shadowsembrace.component.enemy;

import java.util.HashMap;
import java.util.Random;
import optic_fusion1.engine.game.Game;

public class EnemyManager {

  private static final Random RANDOM = new Random();
  private static final HashMap<String, BaseEnemy> ENEMIES = new HashMap<>();
  private BaseEnemy[] ENEMIES_ARRAY;

  public void registerEnemies(Game game) {
    registerEnemy(new Ghoul(game));
    registerEnemy(new Skeleton(game));
    registerEnemy(new Vampire(game));
    registerEnemy(new Wraith(game));
    registerEnemy(new Zombie(game));
    ENEMIES_ARRAY = (BaseEnemy[]) ENEMIES.values().toArray();
  }

  private void registerEnemy(BaseEnemy enemy) {
    ENEMIES.putIfAbsent(enemy.getName(), enemy);
  }

  public BaseEnemy getEnemy() {
    return ENEMIES_ARRAY[RANDOM.nextInt(ENEMIES_ARRAY.length)];
  }

}
