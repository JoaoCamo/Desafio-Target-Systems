package testeTargetSystems;

import java.util.Scanner;

public class Desafio2
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
    
    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int num)
    {
        if (num < 0)
        {
            return false;
        }

        int a = 0, b = 1;

        // Calcula a sequência até que o número atual seja maior ou igual ao número informado
        while (a < num)
        {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return a == num;
    }
}
