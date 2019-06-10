package The_third.Prac_3;

class Dude {
	public String name;
	public int hp = 100;                                      
	public int mp = 0;
	
	public void sayName() {
		System.out.println(name);
	}
	
	public void punchFace(Dude target) {
		target.hp -=10;
	}
	
}

class Wizard extends Dude{
	String[] spells;

	public void cast(String spell) {
		mp -= 10;
	}

}

class GrandWizard extends Wizard{
	
	public void sayName() {
		System.out.println("Grand wizard" + name);
	}
	
}

public class Dude_Test{
	public static void main(String[] args) {
		Dude dude1 = new Dude();
		Wizard wizard1 = new Wizard();
		wizard1.hp += 1;
		wizard1.punchFace(dude1);
		dude1.punchFace(wizard1);
		GrandWizard grandWizard1 = new GrandWizard();
		grandWizard1.name = "Flash";
		grandWizard1.sayName();
		grandWizard1.punchFace(dude1);
		System.out.println(dude1.hp);
		System.out.println(wizard1.hp);
		System.out.println(grandWizard1.hp);
	}
}
	
		
