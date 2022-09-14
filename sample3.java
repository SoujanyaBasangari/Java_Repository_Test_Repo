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
