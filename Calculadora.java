import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);

        String soma = "+";
        String subtracao = "-";
        String divisao = "/";
        String multiplicacao = "*";
        System.out.println("Escolha a operacao:");
        String operacaoEscolhida = calculadora.next();
        System.out.println("Digite um Valor:");
        Integer primeiroValor = calculadora.nextInt();
        System.out.println("Digite um segundo Valor:");
        Integer segundoValor = calculadora.nextInt();

        if (operacaoEscolhida.equals(soma)){

            Integer resultado = primeiroValor + segundoValor;
            System.out.println("O resultado final e :" + resultado);
        }else if(operacaoEscolhida.equals(subtracao)){
            Integer resultado1 = primeiroValor - segundoValor;
            System.out.println("O resultado final e : " + resultado1);

        }else if(operacaoEscolhida.equals(divisao)){
            Integer resultado2 = primeiroValor / segundoValor;
            System.out.println("O resultado final e:" + resultado2);
        }else if(operacaoEscolhida.equals(multiplicacao)){
            Integer resultado3 = primeiroValor * segundoValor;
            System.out.println("O resultado final e:" +resultado3);
    }}
}
