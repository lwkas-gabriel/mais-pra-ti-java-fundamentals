import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá e seja bem-vindo!!");
        //calculadora();
        //palindromo("teste");
        //fibonacci(0);
        //inverteNumero();
        //anagramas();
        //jogo();
        //contadorPalavras();
    }

    public static void calculadora(){
        Scanner s = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        String op;

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

    public static void palindromo(String palavra){
        String word = palavra;
        String reverseWord = "";
        char caracter;

        for(int i = 0; i < word.length() ; i++){
            caracter = word.charAt(i);
            reverseWord = caracter + reverseWord;
        }

        if(word.equals(reverseWord)){
            String resultado = MessageFormat.format("{0} e {1} são palíndromos!", word, reverseWord);
            System.out.println(resultado);
        }else{
            System.out.println("A palavra informada não é um palíndromo");
        }

    }

    public static void fibonacci(int limite){
        int fibo1 = 0;
        int fibo2 = 1;
        int contador = 0;
        String fibo = "0 1";

        while(contador < limite){
            int next = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = next;
            fibo += " " + next;
            contador++;
        }
        System.out.println(fibo);
    }

    public static void inverteNumero(){
        try{
            Scanner s = new Scanner(System.in);
            int numero;

            System.out.println("Inserir numero: ");
            numero = s.nextInt();

            String toReverse = Integer.toString(numero);
            String reversed = "";

            for(int i = toReverse.length() - 1; i >= 0; i--){
                reversed += toReverse.charAt(i);
            }

            int numeroInvertido = Integer.parseInt(reversed);

            System.out.print(numeroInvertido);
        }catch(Exception e){
            System.out.println("erro de input!");
        }


    }

    public static void anagramas(){
        Scanner s = new Scanner(System.in);
        String firstWord;
        String secondWord;

        System.out.println("Inserir primeira palavra");
        firstWord = s.next();

        System.out.println("Inserir segunda palavra");
        secondWord = s.next();

        int contador = 0;

        for(int i = 0; i < firstWord.length(); i++){
            for(int j = 0; j < secondWord.length(); j++){
                if(firstWord.charAt(i) == secondWord.charAt(j)){
                    contador++;
                    break;
                }
            }
        }

        if(contador == firstWord.length()){
            System.out.println(firstWord +" e " + secondWord + " são anagramas");
        }else{
            System.out.println(firstWord +" e " + secondWord + " não são anagramas");
        }

    }

    public static void jogo(){
        try {
            int numeroDoJogo;
            Scanner s = new Scanner(System.in);
            numeroDoJogo = (int)(Math.random() * 50 + 1);
            System.out.println(numeroDoJogo);
            int check = Integer.MAX_VALUE;

            while(numeroDoJogo != check){
                System.out.println("Qual o número escolhido pelo sistema?");
                s = new Scanner(System.in);
                check = s.nextInt();

                if(numeroDoJogo != check){
                    System.out.println("Errado, tente novamente!");
                }else{
                    System.out.println("Parabéns, você acertou!! O numero era "+ check + "!!");
                }
            }
        }catch(Exception e){
            System.out.printf("erro no input!");
        }
    }

    public static void contadorPalavras(){
        Scanner s = new Scanner(System.in);
        String frase;
        int contador = 0;

        System.out.println("Inserir texto: ");
        frase = s.nextLine();

        for(int i = 0; i < frase.length(); i++){
            char ch = frase.charAt(i);

            if(Character.isLetter(ch)){
                contador++;
            }
        }

        System.out.println("A quantidade letras no seu texto é de " + contador);
    }
}