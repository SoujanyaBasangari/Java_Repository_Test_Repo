//clone 10

public class Tile{
   public static void main(String args[]){
      Tile aTile = testTile();
      aTile.setValue(20);
      printTile(aTile);
      System.out.println(aTile.equals(testTile())+" "+aTile.getLetter());
   }
   private char letter;
   private int value;
   public Tile(char letter, int value){
      this.letter = letter;
      this.value = value;
   }
   public static void printTile(Tile tile){
      System.out.println("A tile with "+tile.letter+" and "+tile.value);
   }
   public static Tile testTile(){
      Tile tile = new Tile('Z',10);
      printTile(tile);
      return tile;
   }
   public String toString(){
      return "A tile with "+this.letter+" and "+this.value;
   }
   public boolean equals(Tile that){
      return this.letter == that.letter && this.value == that.value;
   }
   public char getLetter(){
      return this.letter;
   }
   public void setLetter(char letter){
      this.letter = letter;
   }
   public int getValue(){
      return this.value;
   }
   public void setValue(int value){
      this.value = value;
   }
}


// clone 11

public class Time{

   public static void main(String[] args){
      Time time = new Time();
      time.increment(3600*8+6*60+5);
      System.out.println(time);
   }

   public int hour;
   public int minute;
   public double second;
   public Time(int hour, int minute, double second){
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }
   public Time(){
      this(0,0,0);
   }
   public String toString(){
      return this.hour+":"+this.minute+":"+this.second;
   }
   public void increment(double seconds) {
      this.second += seconds;
      this.minute += this.second / 60;
      this.second %= 60;
      this.hour += this.minute / 60;
      this.minute %= 60;
   }
}
