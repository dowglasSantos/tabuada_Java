import java.util.Scanner;

public class Calculadora {
    Scanner s = new Scanner(System.in);

    private String menu = "";
    private Integer option;
    private Integer number;

    public void equacao() {
        System.out.print("Você deseja saber alguma tabuada? (sim ou não): ");
        menu = s.next();

        while (menu.equalsIgnoreCase("sim")) {
            System.out.println("Informe uma das opções:");
            System.out.println(" ");
            System.out.println("Digite 1 para ADIÇÃO:");
            System.out.println("Digite 2 para SUBTRAÇÃO:");
            System.out.println("Digite 3 para MULTIPLICAÇÃO:");
            System.out.println("Digite 4 para DIVISÃO:");

            option = s.nextInt();

            if(option.equals(1)) {
                System.out.println("ADIÇÃO:");
                System.out.print("Informe o numero que voce deseja saber a tabuada: ");
                number = s.nextInt();

                for(int i = 1; i <= 10; i++) {
                    System.out.println(number + " + " + i + " = " + (number + i));
                };
            }
            else if(option.equals(2)) {
                System.out.println("SUBTRAÇÃO:");
                System.out.print("Informe o numero que voce deseja saber a tabuada: ");
                number = s.nextInt();

                for(int i = 1; i <= 10; i++) {
                    System.out.println(number + " - " + i + " = " + (number - i));
                };
            }
            else if(option.equals(3)) {
                System.out.println("MULTIPLICAÇÃO:");
                System.out.print("Informe o numero que voce deseja saber a tabuada: ");
                number = s.nextInt();

                for(int i = 1; i <= 10; i++) {
                    System.out.println(number + " X " + i + " = " + (number * i));
                };
            }
            else if(option.equals(4)) {
                System.out.println("DIVISÃO:");
                System.out.print("Informe o numero que voce deseja saber a tabuada: ");
                number = s.nextInt();

                for(int i = 1; i <= 10; i++) {
                    Integer divisor = i * number;
                    System.out.println(divisor + " % " + number + " = " + (divisor / number));
                };
            };

            System.out.println("Você deseja saber alguma tabuada(sim / não)? ");
            menu = s.next();
        };

        System.out.println("Obrigado!!");
    };
}
