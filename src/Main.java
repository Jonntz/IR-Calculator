import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        //  De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
        //  De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
        //  De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
        double salary;
        float discount;
        double tax;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salario: ");
        salary = scanner.nextDouble();

        if(salary >= 1900.0 && salary <= 2800.0) {
            discount = 7.5F;
            tax = salary * discount / 100;
            System.out.println("O IR é de " + discount + "% e pode deduzir na declaração o valor de R$" + tax);
        } else if(salary >= 2800.01 && salary <= 3751.0) {
            discount = 15F;
            tax = salary * discount / 100;
            System.out.println("O IR é de " + discount + "% e pode deduzir na declaração o valor de R$" + tax);
        } else if(salary >= 3751.01 && salary <= 4664.00) {
            discount = 22.5F;
            tax = salary * discount / 100;
            System.out.println("O IR é de " + discount + "% e pode deduzir na declaração o valor de R$" + tax);
        }
    }
}