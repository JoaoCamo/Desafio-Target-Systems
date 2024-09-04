package testeTargetSystems;

public class Desafio1
{
	public static void main(String[] args)
	{
        System.out.println(Soma());
    }
	
	public static int Soma()
	{
		int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE)
        {
            K = K + 1;
            SOMA = SOMA + K;
        }

        return SOMA;
	}
}
