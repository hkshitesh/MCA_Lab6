package pkg1;

public class Ellipse extends Shape implements Eccentric 
{
	
	public double eccentricity(int a, int b) {
		
		return 0;
	}
	
	public double area(int a, int b) {
		
		return 0;
	}

	
	public double perimeter(int a, int b) {
		
		double p;
		p= 3.14*(Math.sqrt(2*(a*a+b*b)-((a-b)*(a-b))/2));
		return p;
	}

}
