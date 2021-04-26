package generic;

public class Rpair<T,V> {
	private T f;
	private V s;
	public Rpair(T f, V s)
	{
		this.f = f;
		this.s = s;
	}
	public T getf()
	{
		return f; 
	}
	public V gets()
	{
		return s;
	}
	public void sets(T f){
		this.f = f;		
	}
	public void setS(V s) {
		this.s = s;
	}
}
