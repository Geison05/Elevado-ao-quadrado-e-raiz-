import java.util.Scanner;
import java.text.DecimalFormat;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    DecimalFormat formatador = new DecimalFormat("0.00");
    //variavel
    double numero = 0.0,
           potencia = 0.0,
           raiz = 0.0;
   //entrada
   System.out.println("Digite um numero real :");
   numero = leitor.nextDouble();
   // processamento
   potencia = Math.pow(numero,2);
   raiz = Math.sqrt(numero);
   //saida 
   System.out.println("Número ao quadrado :" + potencia);
   System .out.println("Raiz Quadrada :" + formatador.format(raiz));

  }
}