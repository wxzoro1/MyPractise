package The_third.Prac_3;


public interface Fighter {
	public void fight();
}
interface Lover{
	public void love();
}
class Man1{
	
}
class Hero extends Man1 implements Fighter,Lover{
	public void fight() {
		
	}
	public void love() {
		
	}
}