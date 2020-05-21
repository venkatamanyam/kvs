class AA
{ 
public  void m1()
 {
    System.out.println("Hellow111");
 }
}
class B extends AA
{ 
  static int i=9;
public static void m2()
 {
  System.out.println("Hellow222  "+i);
 }
}




class A
{ 
public static void main(String[] a)
 {
   
   B b=new B();
    b.m2();
System.out.println("-----------------");
System.out.println(b.i);
System.out.println("-----------------");
   B.m2();
 
}}