
public class q9 {

	public static void main(String[] args) {
		int i=30;
		float f=30f;
		double d=30.42;
		boolean b=false;
		
		String s1=String.valueOf(i);
		String s2=String.valueOf(f);
		String s3=String.valueOf(d);
		String s4=String.valueOf(b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		Integer w=new Integer(s1);
		Float x=new Float(s2);
		Double y=new Double(s3);
		Boolean z=new Boolean(s4);
		
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
