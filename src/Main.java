import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        calculadora();
    }

    public static void calculadora(){
        Scanner s = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        String op = "";

        try {
            System.out.println("Insira o primeiro numero:");
            primeiroNumero = s.nextInt();

            System.out.println("Insira o segundo numero:");
            segundoNumero = s.nextInt();

            System.out.println("Insira a operação desejada:");
            op = s.next();

            if(op.equals("+")){
                int resultado = primeiroNumero + segundoNumero;
                String soma = MessageFormat.format("{0} + {1} = {2}", primeiroNumero, segundoNumero, resultado);
                System.out.println(soma);
            }else if(op.equals("-")){
                int resultado = primeiroNumero - segundoNumero;
                String soma = MessageFormat.format("{0} - {1} = {2}", primeiroNumero, segundoNumero, resultado);
                System.out.println(soma);
            }else if(op.equals("*")){
                int resultado = primeiroNumero * segundoNumero;
                String soma = MessageFormat.format("{0} * {1} = {2}", primeiroNumero, segundoNumero, resultado);
                System.out.println(soma);
            }else if(op.equals("/")){
                int resultado = primeiroNumero / segundoNumero;
                String soma = MessageFormat.format("{0} / {1} = {2}", primeiroNumero, segundoNumero, resultado);
                System.out.println(soma);
            }else{
                System.out.println("inválido, verifique a operação inserida!");
            }
        }catch (InputMismatchException e){
            System.out.println("erro nos parâmetros de entrada!!");
        }
    }
}