package Q6;

/**
 * Figure.java
 *
 *
 * Created: Tue Jan 13 19:41:56 2004
 *
 * @author Adrienne Decker
 * @version
 */

public abstract class Figure
{
   public Figure ()
   {
   }

   public Figure(Figure figure)
   {
   }

   public void erase()
   {
      for ( int i = 0; i < 15; i++) {
		System.out.println();
      } // end of for ()
   }

   public abstract void draw();

   public void center()
   {
      this.erase();
      this.draw();
   }

}// Figure