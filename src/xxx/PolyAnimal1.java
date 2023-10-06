package xxx;

public class PolyAnimal1  {
	
	public static void main(String[] args) {
		
		Animal[] e = new Animal[3];
		e[0]= new Animal(3,8.0f);
		e[1]= new Elephant(5,1200.0f,"大象");
		e[2]= new Elephant(8,1300.0f,"大象寶寶");
		
		for(int i=0;i<e.length;i++) {
		     e[i].speak();
		}
	}
        
	   
		
	

}
