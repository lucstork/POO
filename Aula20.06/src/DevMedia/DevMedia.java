package DevMedia;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DevMedia {

  public static void main(String[] args) throws IOException {
    String nome;
    char sexo;
    int idade, altura;
    double pc;  // peso corporal
    double GEB; // gasto energ�tico basal

    FileInputStream arq = new FileInputStream("java.txt");
    DataInputStream lerArq = new DataInputStream(arq);

    nome = lerArq.readUTF();
    sexo = lerArq.readChar();
    idade = lerArq.readInt();
    pc = lerArq.readDouble();
    altura = lerArq.readInt();

    // calculando o gasto energ�tico basal
    if ((sexo == 'M') || (sexo == 'm'))
       GEB = 66.47 + (13.75 * pc) + (5 * altura) - (6.76 * idade);
    else
       GEB = 655.1 + (9.56 * pc) + (1.85 * altura) - (4.67 * idade);

    System.out.printf("Nome..................: %s\n", nome);
    System.out.printf("Sexo..................: %c\n", sexo);
    System.out.printf("Idade.................: %d anos\n", idade);
    System.out.printf("Peso Corporal.........: %.2f kgs\n", pc);
    System.out.printf("Altura................: %d cm\n", altura);
    System.out.printf("Gasto Energ�tico Basal: %.0f kcal/dia\n", GEB);

    arq.close();
  }
}