package src.TriangleTwo;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -



public class TriangleTwo
{
   private int size;
   private String letter;

	public TriangleTwo()
	{
	}

	public TriangleTwo( String let, int sz)
	{
		setTriangle(sz, let);

	}

	public void setTriangle(int count, String let)
	{
		size = count;
		letter = let;


	}

	public String getLetter()
	{
		return "#";
	}

	public String toString()
	{
		String output="";

		int count = size;
		while (count >= 0)
		{
			int row = 0;
			while (row <= count)
			{
				output = output + letter;
				row++;
			}
			output = output + "\n";
			count--;

		}





		return output+"\n";
	}
}