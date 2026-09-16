class FarmAnimal
{
  String name;
  String habitat;
  String food;
  String sound;
  // Parameterized constructor
  FarmAnimal(String name,String habitat,String food,String sound)
  {
    this.name=name;
	this.habitat=habitat;
	this.food=food;
	this.sound=sound;
   }
    void displayInfo()
	{
	  System.out.println("Animal:"+ name);
	  System.out.println("Stays at:"+ habitat);
	  System.out.println("Eats:"+ habitat);
	  System.out.println("Makes sound:"+ sound);
	  System.out.println("------------\n");
	 }
   }
   public class FarmApp{
   public static void main(String[] args){
    FarmAnimal cow = new FarmAnimal("Cow","Barn","Grass","Moo");
	FarmAnimal duck = new FarmAnimal("Duck","Pond","Grains","Quack");
	cow.displayInfo();
	duck.displayInfo();
	  }
	}