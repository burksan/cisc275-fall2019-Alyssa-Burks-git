public class Dog extends Animal{
	public Dog(String name, int legs){
		this.name = name;
		this.legs = legs;
		}
	
	@Override
	public String toString() {
		return name + legs;
		}
		}