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
