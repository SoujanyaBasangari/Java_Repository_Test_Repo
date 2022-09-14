//clone 1
public static int riddle(int x, Point p){
      x = x+7;
      //p.x += 2;
      return x+p.x+p.y;
   }
   
 //clone 2  
public static double distance(Point p1, Point p2){
      int dx = p2.x - p1.x;
      int dy = p2.y - p1.y;
      return Math.sqrt(dx*dx+dy*dy);
}
//clone 3
public static Point findCenter(Rectangle box){
      int x = box.x + box.width / 2;
      int y = box.y + box.height / 2;
      return new Point(x, y);
}
//clone 4   
Rectangle box1 = new Rectangle(2,4,7,9);
Point p1 = findCenter(box1);
printPoint(p1);
box1.grow(1, 1);
Point p2 = findCenter(box1);
printPoint(p2);
      
   /*
   p2.x += 1;
   printPoint(p1);
   printPoint(p2);
   */

public static void printPoint(Point p){
      System.out.println("("+p.x+", "+p.y+")");
}
//clone 5
public static Point findCenter(Rectangle box){
      int x = box.x + box.width / 2;
      int y = box.y + box.height / 2;
      return new Point(x,y);
}
//clone 6
public static BigInteger pow(int x, int n) {
      if (n == 0) 
         return BigInteger.valueOf(1);
      // find x to the n/2 recursively
      BigInteger t = pow(x, n/2);
      // if n is even, the result is t squared
      // if n is odd, the result is t squared times x
      if (n % 2 == 0) {
         return t.multiply(t);
      } 
      else {
         return t.multiply(t).multiply(BigInteger.valueOf(x));
      } 
   }
   
 //clone 7
import java.math.BigInteger;

public class Big{
   public static void main(String args[]){
      BigInteger integer = BigInteger.valueOf(2147483647);
      System.out.println(integer.add(BigInteger.ONE).pow(10));
      for (int i=0;i<30;i++){
         System.out.println(i+": "+factorial(i));
      }
   }
   public static BigInteger factorial(int number){
      BigInteger result = BigInteger.valueOf(1);
      for (int i = number;i>0;i--){
         result = result.multiply(BigInteger.valueOf(i));
      }
      return result; 
   }
   // Imutable; According to documentation...; No Value to change
}

//clone 8
public class Date{
   public static void main(String args[]){
      Date birthday = new Date();
      System.out.println(birthday.year+" "+birthday.month+" "+birthday.day);
   }
   public int year;
   public int month;
   public int day;
   public Date(int year, int month, int day){
      this.year = year;
      this.month = month;
      this.day = day;
   }
   public Date(){
      this(2001,4,17);
   }
}

//clone 9

public class Rational{
   public static void main(String args[]){
      Rational	temp1	= new	Rational();
      temp1.setNumerator(17);
      temp1.setDenominator(-12);
      temp1.printRational();
      Rational	temp2	= new	Rational(temp1.getDenominator(),15);
      temp2.negate();
      temp2.invert();
      System.out.println(temp2+" "+temp2.add(temp1)+" "+temp2.toDouble());
   }
   private int	numerator;
   private int	denominator;
   public void	setNumerator(int numerator){
      this.numerator	= numerator;
      this.correct();
   }
   public int getNumerator(){
      return this.numerator;
   }
   public void	setDenominator(int denominator){
      this.denominator = denominator;
      this.correct();
   }
   public int getDenominator(){
      return this.denominator;
   }
   public Rational(){
      this(0,1);
   }
   public Rational(Rational that){
      this(that.numerator,that.denominator);
   }
   public Rational(int numerator, int denominator){
      this.set(numerator,denominator);
   }
   public void	set(Rational that){
      this.set(that.numerator, that.denominator);
   }
   public void	set(int numerator, int denominator){
      this.numerator	= numerator;
      this.denominator = denominator;
      this.correct();
   }
   public void	printRational(){
      System.out.println(this.numerator+"/"+this.denominator);
   }
   public String toString(){
      return this.numerator+"/"+this.denominator;
   }
   public void	negate(){
      this.numerator	= -this.numerator;
   }
   public void	invert(){
      this.numerator+=this.denominator;
      this.denominator=this.numerator-this.denominator;
      this.numerator=this.numerator-this.denominator;
      this.correct();
   }
   public Double toDouble(){
      return (double)this.numerator	/ this.denominator;
   }
   public Rational reduce(){
      int gcd = gcd();
      return new Rational(this.numerator / gcd,	this.denominator / gcd);
   }
   public int gcd(){
      return gcd(this.numerator,	this.denominator);
   }
   private int	gcd(int m,int n){
      if	(m	% n == 0) {
         return n;
      } 
      else {
         return gcd(n,m	% n);
      }
   }
   public Rational add(Rational that){
      int newNumerator = this.numerator *	that.denominator + that.numerator *	this.denominator;
      int newDenominator =	this.denominator * that.denominator;
      Rational	result =	new Rational(newNumerator,	newDenominator).reduce();
      result.correct();
      this.set(result);
      return result;
   }
   private void correct(){
      if	(this.denominator	< 0){
         this.negate();
         this.denominator = -this.denominator;
      }
   }
}

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
