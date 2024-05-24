import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.print("\nDigite o primeiro parâmetro: ");
        int parametroUm = Integer.parseInt(input.nextLine());
        System.out.print("\nDigite o segundo parâmetro: ");
        int parametroDois = Integer.parseInt(input.nextLine());

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("\nO segundo parâmetro deve ser maior que o primeiro.\n");
        }
       
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
