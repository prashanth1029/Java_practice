package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int values;
//		values = 100 200 300 gives error
		int []val = new int[100];
		
		val[0] = 12;
		val[99] = 109;
//		val[2] = "hello";
		System.out.println(val[0]);
		System.out.println(val[99]);
		System.out.println(val[50]);
//		System.out.println(val[100]);
		System.out.println(val.length);
		
		double []dbl = new double[100];
		
		dbl[0] = 12.12;
		dbl[99] = 1090.88;
		System.out.println(dbl[0]);
		System.out.println(dbl[99]);
		System.out.println(dbl[50]);
//		System.out.println(dbl[100]);
		System.out.println(dbl.length);
		
		float []flt = new float[100];
		
		flt[0] = 12112.12f;
		flt[99] = 10455545490.88f;
		System.out.println(flt[0]);
		System.out.println(flt[99]);
		System.out.println(flt[50]);
//		System.out.println(flt[100]);
		System.out.println(flt.length);	
		
		long []lng = new long[100];
		
		lng[0] = 121122121122l;
		lng[99] = 1045554549088l;
		System.out.println(lng[0]);
		System.out.println(lng[99]);
		System.out.println(lng[50]);
//		System.out.println(lng[100]);
		System.out.println(lng.length);		
		
		String []words = new String[] {"My", "Name", "is"};
		
		System.out.println(words[2]);
		
		String []str = new String[10];
		
		str[0] = "prashi";
		str[9] = "imti";
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[str.length-1]);
		
		str = new String[20];
		System.out.println(str[0]);
		
	}

}
