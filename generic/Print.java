package generic;
public class Print {
	public static <T extends PrintImp> void printarray(T a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i].print();
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer a[] = new Integer[5];
		String s[] = new String[5];
		for(int i=0;i<5;i++)
		{
			a[i]=i+1;
		}
		for(int j=0;j<5;j++)
		{
			s[j]="ab";
		}
		Stu s1[] = new Stu[5];
		for(int k=0;k<5;k++)
		{
			s1[k]=new Stu();
		}
		printarray(s1);
		//printarray(a);
		//printarray(s);
	}

}
