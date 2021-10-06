//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of sum?
public class problem6 
{

	public static void main(String[] args) {
		int x=100;
		double s1=Math.pow((x*(x+1)/2),2);
	    double s2=x*(x+1)*(2*x+1)/6;
		System.out.println("(1+2+3+...+k)^2="+(int)s1);
		System.out.println("1^2+2^2+3^2+...+k^2="+(int)s2);
		System.out.println("Reqired difference="+(int)(s1-s2));
		System.out.println("Kshitiz Ranjan");
	}


}
//output:-Reqired difference=25164150... . 
