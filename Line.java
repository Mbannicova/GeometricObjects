package geometry;

public class Line {
	 // properties
	  public int startX;
	  public int endX;
	  public int startY;
	  public int endY;


	  // constructor
	  public Line(int startX,int startY,int endX,int endY) {
		if (startX == endX && startY == endY) { 
			System.err.println("Error!");}
	   
		
		else {
			
			 this.startY = startY;
			 this.startX = startX;
			 this.endX   = endX;
			 this.endY   = endY;}
		
	  } 
	  
	  public  void printCoords(int startX,int startY,int endX,int endY) {
		  
		  System.out.println("[" + startX + ":" + startY + " -----> [" + endX + ":" + endY + "]");
		  
	  }
	  
	  public  int length(int startX,int startY,int endX,int endY) {
		  int a = endX - startX;
		  int b = endY - startY;
		  int c = 2;
		  
		  
		 double intermResult = (Math.pow(a, c) + Math.pow(b, c));
		 int result = (int)Math.round(Math.sqrt(intermResult));
		// int integerResult = (int)result;
		 //double rest =  result - integerResult;
		 //if (rest >= 0.5) {
			// integerResult++;
		// }
		  
		  return result;
	      
		  
	  }

}
