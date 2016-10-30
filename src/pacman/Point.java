/*
 * Developed by 10Pines SRL
 * License: 
 * This work is licensed under the 
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/3.0/ 
 * or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, 
 * California, 94041, USA.
 *  
 */
package pacman;

public class Point {

	int x;
	int y;
	
	public Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean equals (Object anObject){
		if(anObject==null) return false;
		return (anObject instanceof Point) && equalsPoint((Point) anObject);
	}
	
	public boolean equalsPoint (Point aPoint) {
		return x==aPoint.x() && y==aPoint.y();
	}
	
	public int x() {
		return x;
	}
	
	public int y(){
		return y;
	}
	
	public Point plus(Point aPoint){
		return new Point (x+aPoint.x(),y+aPoint.y());
	}
}
