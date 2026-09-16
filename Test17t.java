class A
{
 int i;
 int j;
 int k;
 A(int i)
 {
   this.i = i;
 }
 A(int i, int j)
 {
   this.i = i;
   this.j = i;
 }
 A(int i, int j, int k)
 {
  this.i = i;
  this.j = j;
  this.k = k;
 }
 void m()
 {
  System.out.println(i + j + k);
 }
}

class Test17t
{ 
  public static void main(String[] args)
  {
   A a1 = new A(10);
   A a2 = new A(10, 20,10);
   A a3 = new A(50, 60, 70);
   
   // Call m() to see output
   a1.m(); // i=10, j=0, k=0 -> prints 10
   a2.m(); // i=10, j=10, k=10 -> prints 40
   a3.m(); // i=50, j=60, k=70 -> prints 180
  }
}
