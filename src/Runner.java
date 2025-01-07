import static org.junit.Assert.assertEquals;

import com.sun.net.httpserver.Headers;
import org.junit.Test;

public class Runner {
  public static void main(String[] args) { System.out.println("Hello"); }

  @Test
  public void test() {
    assertEquals(1.5, new Helmet("Gold").getWeight(), 0.1);
    assertEquals(1, new BodyArmor("Leather").getChaMod());
    assertEquals(5, new Adventurer("Bob").getMaxHP());
    assertEquals(0, new Stats().getMaxMP());
    assertEquals(2, new Species("Elf").getIntMod());
    assertEquals(200, new Role("Paladin").getChaMod());
    assertEquals(1, new RangeWeapons(1, 1, 1, 1, 1, 1.0).getRange());
    assertEquals(15, new Philosophy("A").getKnowledge());
    assertEquals(
        2, new Origin("", "", "", "", "Intelligence", "Strength").getIntMod());
    assertEquals(0, new MeleeWeapon("a", 1, 1, 1.0, 1.0, 1).getStrMod());
    assertEquals(10, new Boots(true, "a", false).getRevisedStrength());
    assertEquals(0, new Gauntlets().getEquipmentID());
    assertEquals("Common",
                 new Gloves("Common", "", false, 0, 1, 1).getRarity());
    assertEquals(10.0, new Shield("wood").getWeight(), 0.1);
  }
}
