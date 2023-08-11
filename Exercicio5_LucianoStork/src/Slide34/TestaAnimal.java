package Slide34;

public class TestaAnimal {

	public static void main(String[] args) {
		Animal vet[] = new Animal[10]; 
		vet[0] = new Homem();
		vet[1] = new Homem();
		vet[2] = new Homem();
		vet[3] = new Cao();
		vet[4] = new Cao();
		vet[5] = new Cao();
		vet[6] = new Cao();
		vet[7] = new Gato();
		vet[8] = new Gato();
		vet[9] = new Gato();

		for(int i = 0; i < vet.length; i++) {
			vet[i].fala();
		}
	}
}