package Animal;

public class Principal {

	public static void main(String[] args) {
		 Cachorro rover, fido;
		 Animal anim;
		 rover = new Cachorro();
		 anim = rover;
		 fido = (Cachorro)anim;
		System.out.println("Fido" + fido.falar());
		System.out.println("Rover" + rover.falar());
		

	}

}
