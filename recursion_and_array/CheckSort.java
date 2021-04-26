package recursion_and_array;
public class CheckSort {
		public static boolean sort(int a[], int stin)
		{ 	
			if(stin>=a.length-1)
			{
				return  true;
			} 
			if(a[stin]>=a[stin+1])
			{
				return false;
			}
			boolean ans = sort(a,stin+1);
			return ans;
		}
		public static boolean sort(int a[]) {
			return sort(a,0);
		}
		public static void main(String[] args) {
			int a[]= {2,3,4,1};
			System.out.println(sort(a,0));
			
		}
}




