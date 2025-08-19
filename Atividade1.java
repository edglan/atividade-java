import java.util.Scanner;

public class Atividade1{
        public static void main(String[] args){

        int numero1 = 30;
        int numero2 = 54;

        int soma = numero1 + numero2;

        System.out.println(soma);

        //Declare uma variável do tipo double e atribua a ela o valor 5.67. Multiplique essa variável por 3 e imprima o resultado.


        double numero = 5.67;

        double soma2 = numero * 3;

        System.out.println(soma2);


        //4.Crie uma variável do tipo char e atribua a ela uma letra. Em seguida, imprima essa letra na tela.

        char letra = 'A';

        System.out.println(letra);

        boolean nome = true;

        System.out.println(nome);

        //6.Crie uma variável do tipo String e atribua a ela o seu nome. Concatene essa variável com a frase " é um aluno dedicado." e imprima o resultado.

        String nome3 = "Edglan";

        System.out.println(nome3 + "é um aluno aplicado");

        //7.Crie uma variável do tipo boolean chamada temCarteira e atribua a ela o valor false. Imprima a variável, em seguida, altere o valor para true e imprima novamente.

        boolean temcarteira = false;
        System.out.println(temcarteira);

        temcarteira = true;
            System.out.println(temcarteira);



        //8. Declare uma variável do tipo String chamada frase e atribua a ela a concatenação das palavras "Olá" e "Mundo".

        String str = "frase";
        System.out.println("frase" + "olá Mundo");


        //9.Crie uma variável do tipo int chamada numero1 e outra chamada numero2. Realize a soma, subtração, multiplicação e divisão entre esses números e atribua os resultados a variáveis correspondentes.

        int numero5 = 30;
        int numero6 = 30;

        int soma1 = numero5 + numero6;
        System.out.println(soma);
        int subtracao = numero5 - numero6;
        System.out.println(subtracao);
        int mult = numero5 * numero6;
        System.out.println(mult);
        int div = numero5 / numero6;
        System.out.println(div);

        //10.Declare uma variável do tipo double chamada saldo e atribua a ela o valor 500.50. Realize um depósito de 300.25 nessa conta e, em seguida, realize um saque de 150.75.

        double saldo = 500.50;
        saldo += 300.25;
        System.out.println(saldo);
        double saque = saldo - 150.75;
        System.out.println(saque);

        //11.Crie uma variável do tipo String chamada fruta1 e outra chamada fruta2. Concatene essas variáveis para formar a mensagem: "Eu gosto de [fruta1] e [fruta2]."

            String fruta1 = "banana";
            String fruta2 = "uva";

            System.out.println("eu gosto de fruta" + fruta1 +"e"+ fruta2);

        //12.Declare uma variável do tipo int chamada idadeAnos e atribua a ela sua idade em anos. Converta essa idade para meses e imprima o resultado.

        int idadeanos = 20;
        int multi = idadeanos * 12;

        System.out.println(multi);

        //13.Atribua um valor a uma variável e verifique se o número está entre 0 e 10.

            int strg = 5;

            if(strg < 0 && strg > 10){
                System.out.println("certo");
            }

        //14.Atribua um valor a uma variável e verifique se é um número par.

        int par = 10;
        if(par % 2 == 0){
            System.out.println("é um numero par");

        }

        //15.Atribua um valor a uma variável e verifique se é um número impar.

        int impar = 9;
        if(impar % 2 != 0){
            System.out.println("numero impar");
        }

        //16.Atribua um valor a uma variável e verifique se é múltiplo de 3.

        int multiplo1 = 9;
        if(multiplo1 % 3 == 0){
            System.out.println("é multiplo de 3");
        }

        //17.Atribua um valor a uma variável e verifique se é múltiplo de 5.

        int multiplo2 = 10;
        if(multiplo2 % 5 == 0){
            System.out.println("é multiplo de 5");
        }

        //18.Atribua um valor a uma variável e verifique se é múltiplo de 7.

        int multiplo7 = 14;
        if(multiplo7 % 7 == 0){
            System.out.println("é multiplo de 7");
        }

        //19.Faça um Programa que peça as 4 notas bimestrais e mostre a média.
            Scanner input = new Scanner(System.in);
            System.out.print("digite nota1");
            int n1 = input.nextInt();
            System.out.print("digite nota2");
            int n2 = input.nextInt();
            System.out.print("digite nota3");
            int n3 = input.nextInt();
            System.out.print("digite nota4");
            int n4 = input.nextInt();

            double media = (n1 + n2 + n3 + n4) / 4;
            System.out.println("a media é" + media);

        //20.Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

            System.out.print("Quando você ganha por hora: ");
            double valorHora = input.nextDouble();
            System.out.print("Quantas horas você trabalha por mês: ");
            double horasTrabalhadas = input.nextDouble();

            double salarioBruto = valorHora * horasTrabalhadas;
            System.out.print("Salário bruto: " + salarioBruto);
            double impostoDeRenda = salarioBruto * 0.11;
            System.out.print("Imposto de renda (11%): " + impostoDeRenda);
            double inss = salarioBruto * 0.08;
            System.out.print("INSS (8%): " + inss);
            double sindicato =  salarioBruto * 0.05;
            System.out.print("Sindicato (5%): " + sindicato);
            double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;
            System.out.print("Salario Liquido: " + salarioLiquido);

        }
}








