class A 
{
    int i = 10;
    int j = 20;
}

class B extends A 
{
    int i = 30;
    int j = 40;

    void m() 
	
	{
        System.out.println(super.i); // Accesses A's i
        System.out.println(super.j); // Accesses A's j
    }
}

class Test18t 

{
    public static void main(String[] args) 
	{
        B b = new B(); // Corrected "Bb=newB();"
        b.m(); 
    }
}
