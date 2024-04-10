//Write a Java program to compare two Vector collections
import java.util.Vector;
class CompareTwoVector{
	public static void main(String[] args){
		Vector<Integer> vc1 = new Vector<>();
		Vector<Integer> vc2 = new Vector<>();
		vc1.add(23);
		vc1.add(67);
		vc1.add(64);
		vc1.add(77);
		vc1.add(43);
		vc1.add(82);
		vc2.add(12);
		vc2.add(23);
		vc2.add(64);
		vc2.add(78);
		vc2.add(72);
		System.out.println("Our 1st Vector : "+vc1);
		System.out.println("Our 2nd Vector : "+vc2);
		System.out.println("Size of 1st Vector : "+vc1.size());
		System.out.println("Size of 2nd Vector : "+vc2.size());
		int count=0;
		for(int i=0;i<vc1.size();i++)
			for(int j=0;j<vc2.size();j++)
				if(vc1.get(i)==vc2.get(j))
					count++;
		System.out.print("Elements Match Found : "+count);
	}
}