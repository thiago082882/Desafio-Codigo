
public class Distribuidora {

    public static void main(String[] args) {

        double faturamentoTotal = 208760.98; // faturamento total mensal da distribuidora
        double faturamentoSP = 67836.43; // faturamento mensal de SP
        double faturamentoRJ = 36678.66; // faturamento mensal de RJ
        double faturamentoMG = 29229.88; // faturamento mensal de MG
        double faturamentoES = 27165.48; // faturamento mensal de ES
        double faturamentoOutros = 19849.53; // faturamento mensal dos outros estados

        double percentualSP = (faturamentoSP / faturamentoTotal) * 100;
        double percentualRJ = (faturamentoRJ / faturamentoTotal) * 100;
        double percentualMG = (faturamentoMG / faturamentoTotal) * 100;
        double percentualES = (faturamentoES / faturamentoTotal) * 100;
        double percentualOutros = (faturamentoOutros / faturamentoTotal) * 100;

        System.out.println("Percentual de representação de cada estado:");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);

    }
}
