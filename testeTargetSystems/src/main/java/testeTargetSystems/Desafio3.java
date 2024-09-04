package testeTargetSystems;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Desafio3
{
    public static void main(String[] args)
    {
        String jsonFilePath = "/dados.json";

        try
        {
            String jsonContent = readJsonFile(jsonFilePath);
            JSONArray jsonArray = new JSONArray(jsonContent);

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0.0;
            int diasComFaturamento = 0;

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                double valor = obj.getDouble("valor");

                if (valor > 0)
                {
                    if (valor < menorFaturamento)
                    {
                        menorFaturamento = valor;
                    }
                    if (valor > maiorFaturamento)
                    {
                        maiorFaturamento = valor;
                    }
                    somaFaturamento += valor;
                    diasComFaturamento++;
                }
            }

            if (diasComFaturamento == 0) {
                menorFaturamento = 0.0;
            }

            double mediaFaturamento = (diasComFaturamento == 0) ? 0 : somaFaturamento / diasComFaturamento;

            int diasAcimaDaMedia = 0;
            for (int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject obj = jsonArray.getJSONObject(i);
                double valor = obj.getDouble("valor");
                if (valor > mediaFaturamento)
                {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + menorFaturamento);
            System.out.println("Maior valor de faturamento: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento superior à média mensal: " + diasAcimaDaMedia);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static String readJsonFile(String filePath) throws IOException
    {
        InputStream is = Desafio3.class.getResourceAsStream(filePath);
        if (is == null)
        {
            throw new IOException("Recurso não encontrado: " + filePath);
        }

        StringBuilder jsonContent = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                jsonContent.append(line);
            }
        }
        return jsonContent.toString();
    }
}
