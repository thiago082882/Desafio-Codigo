public class Faturamento {

    public static void main(String[] args) {

        double[] faturamento = {1250.5, 500.0, 2000.0, 800.0, 1500.0, 1750.0, 900.0, 2500.0, 1200.0, 1000.0, 1350.0, 1800.0, 1900.0, 750.0, 3000.0, 950.0, 1300.0, 1100.0, 2400.0, 1750.0, 1700.0, 1200.0, 1300.0, 2200.0, 2000.0, 3000.0, 1250.0, 900.0, 800.0, 1500.0};

        double menor = faturamento[0];
        double maior = faturamento[0];
        double soma = 0;
        int diasAcimaDaMedia = 0;

        for (double valor : faturamento) {
            if (valor < menor) {
                menor = valor;
            }
            if (valor > maior) {
                maior = valor;
            }
            soma += valor;
        }

        double media = soma / faturamento.length;

        for (double valor : faturamento) {
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menor);
        System.out.println("Maior valor de faturamento: " + maior);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

    }
    }

