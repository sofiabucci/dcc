import java.util.Scanner;

public class Sum {
   public static void main(String[] args) {

      // Cria um objecto Scanner para ler da entrada padrão ("standard input")
      Scanner stdin = new Scanner(System.in);

      // Chama o método nextInt() para ir buscar o próximo inteiro
      int a = stdin.nextInt();
      int b = stdin.nextInt();

      // Imprime a soma dos dois números
      System.out.println(a+b);
   }

}