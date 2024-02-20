/*
We can generate random numbers of types integers, float, double, long, booleans using this class.
We can pass arguments to the methods for placing an upper bound on the range of the numbers to be generated. For example, nextInt(6) will generate numbers in the range 0 to 5 both inclusive
The class Math contains various methods for performing various numeric operations such as, calculating exponentiation, logarithms etc. One of these methods is random(), this method returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. 
*/
import java.util.Random;
import java.util.*;
class GenerateRandomNumber{
	public static void main(String[] args){
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(1000));
		System.out.println(random.nextDouble());
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*100));
	}
}