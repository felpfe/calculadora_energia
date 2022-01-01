import java.util.Scanner;

public class Calculadora {
    float consumokWh;

    Scanner teclado = new Scanner(System.in);

    public void detalhesTaxas() {
        System.out.println("-- TAXAS --");
        System.out.println("- Tarifa B1 = Consumo até 30Kwh");
        System.out.println("- Tarifa B2 = Consumo até 100kWh");
        System.out.println("- Tarifa B3 = Consumo até 220kWh ");
        System.out.println("- Tarifa B4 = Consumo acima de 220kWh");
    }

    public void calculaPreço() {
        System.out.println("Informe o Consumo de energia");
        int consumo = teclado.nextInt();
        if (consumo <= 30) {
            consumokWh = (float) (consumo * 0.09414);
            System.out.println("A tarifa é B1 e o total é: " + consumokWh + " por kWh");
        }
        if (consumo > 30 && consumo <= 100) {
            consumokWh = (float) (consumo * 0.16138);
            System.out.println("A tarifa é B2 e o total é: " + consumokWh + " por kWh");
        }
        if (consumo > 100 && consumo <= 220) {
            consumokWh = (float) (consumo * 0.24206);
            System.out.println("A tarifa é B3 e o total é: " + consumokWh + " por kWh");
        }
        if (consumo > 220) {
            consumokWh = (float) (consumo * 0.26896);
            System.out.println("A tarifa é B4 e o total é: " + consumokWh + " por kWh");
        }
    }
    public void total() {
        System.out.println("Quantas horas de consumo de energia? ");
        float horas = teclado.nextInt();
        System.out.println("o total é: " + consumokWh * horas + " reais");
    }
}

