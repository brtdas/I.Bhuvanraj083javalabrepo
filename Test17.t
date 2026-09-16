class A
{
 int i;
 int j;
 int k;
 A(int i)
 {
   this i=i;
 }
 A(int i,int j)
 {
   this.i=i;
   this.j=i;
 }
 A(int i,int j,int k)
 {
  this i=i;
  this j=j;
  this k=k;
 }
 void m()
 {
  System.out.println(i+j+k);
 }
}
class Test17t
{ 
  public static void main(String[] args)
  {
   Aa=newA(10);
   Aa=newA(10,20);
   Aa=newA(50,60,70);
  }
 }