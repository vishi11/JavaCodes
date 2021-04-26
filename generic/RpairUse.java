package generic;

public class RpairUse {

	public static void main(String[] args) {
//		Rpair<String> r = new Rpair<String>("Vishal","chandra"); 
//		System.out.println(r.getf());
//		System.out.println(r.gets());
		Rpair<Integer, String> r1 = new Rpair<Integer,String>(24,"Vishal");
		System.out.println(r1.getf());
		System.out.println(r1.gets());
		int a = 10;
		int b = 20;
		int c = 30;
		Rpair<Integer, Integer> intenal = new Rpair<Integer, Integer>(a, b);
		Rpair<Rpair<Integer, Integer>, Integer> p3 = new Rpair<Rpair<Integer,Integer>, Integer>(intenal, c);
		System.out.println(p3.gets());
		System.out.println(p3.getf().getf());
		System.out.println(p3.getf().gets());
		
	}

}
