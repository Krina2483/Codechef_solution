import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class JGAMES
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if((x+y)%2==0){
		        System.out.println("JANMANSH");
		    }
		    else{
		        System.out.println("JAY");
		    }
		}
	}
}