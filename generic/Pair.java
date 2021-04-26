package generic;

public class Pair {
	private int f;
	private int s;
	public Pair(int f, int s)
	{
		this.f = f;
		this.s = s;
	}
	public int getf()
	{
		return f; 
	}
	public int gets()
	{
		return s;
	}
	public void sets(int f){
		this.f = f;		
	}
	public void setS(int s) {
		this.s = s;
	}
}
