public class Armor extends Equipment {
  private int strMod;
  private int chaMod;
  private int dexMod;
  private int intMod;
  private int wisMod;
  private int conMod;

  public int calculateDamageReduction() { return 0; }

  public int getStrMod() { return this.strMod; }
  public int getChaMod() { return this.chaMod; }
  public int getDexMod() { return this.dexMod; }
  public int getIntMod() { return this.intMod; }
  public int getWisMod() { return this.wisMod; }
  public int getConMod() { return this.conMod; }
}