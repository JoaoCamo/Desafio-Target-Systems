package testeTargetSystemsTest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

import testeTargetSystems.*;

public class DesafioTest {

    @Test
    public void testDesafio1() {
        int soma = Desafio1.Soma();

        assertEquals(91, soma, "A soma deve ser 91");
    }

    @Test
    public void testDesafio2() {
        assertTrue(Desafio2.isFibonacci(0), "0 deve ser Fibonacci");
        assertTrue(Desafio2.isFibonacci(1), "1 deve ser Fibonacci");
        assertTrue(Desafio2.isFibonacci(2), "2 deve ser Fibonacci");
        assertTrue(Desafio2.isFibonacci(3), "3 deve ser Fibonacci");
        assertFalse(Desafio2.isFibonacci(4), "4 não deve ser Fibonacci");
    }

    @Test
    public void testDesafio3() throws IOException {
        InputStream is = getClass().getResourceAsStream("/dados.json");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder jsonContent = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            jsonContent.append(line);
        }

        JSONArray jsonArray = new JSONArray(jsonContent.toString());

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;
        int diasComFaturamento = 0;

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            double valor = obj.getDouble("valor");

            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaFaturamento = somaFaturamento / diasComFaturamento;

        int diasAcimaDaMedia = 0;
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            double valor = obj.getDouble("valor");
            if (valor > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

        assertEquals(373.7838, menorFaturamento, "Menor valor de faturamento");
        assertEquals(48924.2448, maiorFaturamento, "Maior valor de faturamento");
        assertEquals(10, diasAcimaDaMedia, "Número de dias acima da média");
    }

    @Test
    public void testDesafio4() {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double totalFaturamento = sp + rj + mg + es + outros;

        double percentualSp = (sp / totalFaturamento) * 100;
        double percentualRj = (rj / totalFaturamento) * 100;
        double percentualMg = (mg / totalFaturamento) * 100;
        double percentualEs = (es / totalFaturamento) * 100;
        double percentualOutros = (outros / totalFaturamento) * 100;

        assertEquals(37.53, percentualSp, 0.01, "Percentual SP");
        assertEquals(20.29, percentualRj, 0.01, "Percentual RJ");
        assertEquals(16.17, percentualMg, 0.01, "Percentual MG");
        assertEquals(15.03, percentualEs, 0.01, "Percentual ES");
        assertEquals(10.98, percentualOutros, 0.01, "Percentual Outros");
    }

    @Test
    public void testDesafio5() {
        String input = "Exemplo";
        String esperado = "olpmexE";
        String resultado = Desafio5.inverterString(input);
        assertEquals(esperado, resultado, "A string deve ser invertida corretamente");
    }
}
