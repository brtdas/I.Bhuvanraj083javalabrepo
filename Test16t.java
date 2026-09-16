class Student3 {
    int    rollNo;
    String name;
    double cgpa;

    Student3() {                         
        rollNo = 0; name = "brt"; cgpa = 0.0;
    }
    Student3(int r, String n) {          
        rollNo = r; name = n; cgpa = 0.0;
    }
    Student3(int r, String n, double g) { 
        rollNo = r; name = n; cgpa = g;
    }
    void show() {
        System.out.printf("%d | %s | %.2f%n", rollNo, name, cgpa);
    }
}

public class Test16t {
    public static void main(String[] args) 
	{
        new Student3().show();
        new Student3(101, "bhuvan").show();
        new Student3(102, "teja", 9.2).show();
    }
}