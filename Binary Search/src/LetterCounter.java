public class LetterCounter 
{
	private int count;
	private char letter;
	public LetterCounter(int count, char letter)
	{
		this.count = count;
		this.letter = letter;
	}
	public void setLetter(char letter)
	{
		this.letter = letter;
	}
	public void setCounter(int count)
	{
		this.count += count;
	}
	public void set(LetterCounter second)
	{
		this.count = second.getCounter();
		this.letter = second.getLetter();
	}
	public char getLetter()
	{
		return letter;
	}
	public int getCounter()
	{
		return count;
	}
	public boolean equals(LetterCounter second)
	{
		if(this.letter == second.getLetter())
			return true;
		else
			return false;
	}
	public int compareTo(LetterCounter second)
	{
		if(this.equals(second))
			return 0;
		else if(this.letter < second.getLetter())
			return -1;
		else
			return 1;
	}
	public String toString()
	{
		String output = "";
		output = letter + " " + count;
		return output;
	}
}
