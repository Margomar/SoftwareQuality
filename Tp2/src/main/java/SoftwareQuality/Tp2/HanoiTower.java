package SoftwareQuality.Tp2;
import java.util.*;

public class HanoiTower

{
	public static int N;
	/* Creating MyStack array */
	public static MyStack[] tower = new MyStack[4];


	public static void main(String[] args)

	{

		Scanner scan = new Scanner(System.in);


		/* Accepting number of disks */

		System.out.println("Enter number of disks");
		int num = scan.nextInt();
		N = num;
		tower[1] = new MyStack(N);
		tower[2] = new MyStack(N);
		tower[3] = new MyStack(N);
		toh(num);
        scan.close();
	}

	/* Function to push disks into MyStack */

	public static void toh(int n)

	{

		for (int d = n; d > 0; d--)

			tower[1].push(d);

		display();

		move(n, 1, 2, 3);

	}

	/* Recursive Function to move disks */

	public static void move(int n, int a, int b, int c)

	{

		if (n > 0)

		{

			move(n-1, a, c, b);
			int d = tower[a].head();
			tower[a].pop();
			tower[c].push(d);
			display();
			move(n-1, b, a, c);

		}

	}

	/* Function to display */

	public static void display()

	{

		System.out.println(" A | B | C");

		System.out.println("---------------");

		for(int i = N - 1; i >= 0; i--)

		{

			String d1 = " ", d2 = " ", d3 = " ";

			try

			{
				d1 = String.valueOf(tower[1].getStack()[i]);
			}

			catch (Exception e){

			}

			try

			{
				d2 = String.valueOf(tower[2].getStack()[i]);
			}

			catch(Exception e){

			}

			try

			{
				d3 = String.valueOf(tower[3].getStack()[i]);
			}

			catch (Exception e){

			}

			System.out.println(" "+d1+" | "+d2+" | "+d3);

		}

		System.out.println("\n");

	}

}