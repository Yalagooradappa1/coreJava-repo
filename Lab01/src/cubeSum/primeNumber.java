/**
 * Name : Yalagooradappa Hebbal
 * Description : Assignment1
 * Date :
 */
package cubeSum;

import java.util.Scanner;

public class primeNumber {

	public static void getInput(int n)
	{
		
		int cnt=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		if(cnt==2)
		{
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number to print Prime Sequance : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Prime Numbers are :");
		for(int i=1;i<=n;i++)
		{
			getInput(i);	
		}
	}
}
