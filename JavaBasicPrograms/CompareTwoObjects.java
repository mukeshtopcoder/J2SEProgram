class CompareTwoObjects{
	public static void main(String[] args){
		Double d = Double.valueOf(123.4545);
		Integer i = Integer.valueOf(45);
		Float f = Float.valueOf(123.4545f);
		Float fl = Float.valueOf(123.4545f);
		System.out.println("Objects Are Equal : "+d.equals(i));
		System.out.println("Objects Are Equal : "+d.equals(123.4545));
		System.out.println("Objects Are Equal : "+d.equals(f));
		System.out.println("Objects Are Equal : "+f.equals(fl));
	}
}
// d.equals(f) will be false
// Values are equal but type of objects are different
// .equals compare both data-type and content
// Float fl = Float.valueOf(123.4545f); This is autoboxing
/*
In Java, it's recommended to use the static factory methods or autoboxing whenever possible instead of directly using constructors for these wrapper classes. For Double, you can use the valueOf(double) method, and for Long, you can use the valueOf(long) method. Here's how you can modify your code to avoid the deprecated constructors:
*/