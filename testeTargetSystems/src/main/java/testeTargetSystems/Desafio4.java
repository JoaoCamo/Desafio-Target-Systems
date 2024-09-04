package testeTargetSystems;

public class Desafio4
{
	public static void main(String[] args)
	{
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double totalFaturamento = sp + rj + mg + es + outros;

        System.out.printf("Percentual de representação por estado:%n");
        System.out.printf("SP: %.2f%% (R$ %.2f)%n", (sp / totalFaturamento) * 100, sp);
        System.out.printf("RJ: %.2f%% (R$ %.2f)%n", (rj / totalFaturamento) * 100, rj);
        System.out.printf("MG: %.2f%% (R$ %.2f)%n", (mg / totalFaturamento) * 100, mg);
        System.out.printf("ES: %.2f%% (R$ %.2f)%n", (es / totalFaturamento) * 100, es);
        System.out.printf("Outros: %.2f%% (R$ %.2f)%n", (outros / totalFaturamento) * 100, outros);
    }
}
