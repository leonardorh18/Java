public class Main{
    public static void main(final String args[]) {
        System.out.println("Questão 1 (Mostrar na tela 'Olá mundo')\n");

        System.out.println("Olá mundo");

        System.out.println("Questão 2 (Mostrar a soma de A + B )\n");

        int a = 2;
        int b = 2;
        System.out.println("Resultado da soma de A + B = "+(a+b));
        System.out.println("Questão 3 (Java de 0 até 50)\n");
        for(int i = 0; i <= 50; i++){
            System.out.println("Java "+i);
        }

        System.out.println("Questão 4 (Tabela do 5)\n");
        for(int j = 0; j <= 10; j++){
            System.out.println(j+"x * 5 = "+(j * 5));
        }

        System.out.println("Questão 5 (imprimir)\n");

        for(int i = 0; i <= 3; i++){
            System.out.print("Um java ");
            for(int j = 0; j != i+1, j++ ){
                System.out.println("atrapalha ");
            }
            System.out.print("muita gente ");
        }
    }
}