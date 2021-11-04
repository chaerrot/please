package evaluation;

public class Sum2And5
{
	public static void main(String[] args)
	{
		int sum = 0;
		int a = 2;
		int b = 5;
		
        for(int i=1 ; i<=1000 ; i++) {
        	if (i%a==0 || i%b==0) {
        		if ((i%a==0) && (i%b==0) ) { 
        			continue;
        		}
        		sum += i;
        	}
        }
        System.out.println("정답:"+sum);
	}
}
