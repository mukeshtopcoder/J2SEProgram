class myClass{
	public void myFun(){
		System.out.print("I am Calling by an Object/Instance");
	}
}
class CreateObject{
	public static void main(String[] args){
		myClass obj = new myClass();
		obj.myFun();
	}
}