import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        calc.detalhesTaxas();
        calc.calculaPreço();
        calc.total();
    }
}
