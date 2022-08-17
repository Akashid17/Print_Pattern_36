
import java.lang.*;
import java.io.*;

class PatternX
{
	void Display(int iNo1, int iNo2)
	{
		if(iNo1 == 0 || iNo2 == 0)
		{
			if(iNo1 == iNo2)
			{
				System.out.println("Unable to Print Pattern, Both Values are Zero");
			}
			if(iNo1 == 0)
			{
				System.out.println("Unable to Print Pattern, Rows count is Zero");
			}
			if(iNo2 == 0)
			{
				System.out.println("Unable to Print Pattern, Columns count is Zero");
			}
		}
		else
		{
			if(iNo1 < 0)
			{
				iNo1 = -iNo1;
			}
			if(iNo2 < 0)
			{
				iNo2 = -iNo2;
			}

			for(int i = 1; i <= iNo1; i++)
			{
				for(int j = 1; j <= iNo2; j++)
				{
					if(i == j || i == 1 || i == iNo1 || j == 1 || j == iNo2)
                    {
                        System.out.print(j+"\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
				}
				System.out.println();
			}
		}
	}
}

class Main
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));    

		System.out.println("Enter Count of Rows");
		int iValue1 = Integer.parseInt(bobj.readLine());

		System.out.println("Enter Count of Columns");
		int iValue2 = Integer.parseInt(bobj.readLine());

		PatternX pobj = new PatternX();
		pobj.Display(iValue1,iValue2);
	}
}