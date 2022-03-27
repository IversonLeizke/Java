public class DadosDeTempoSemanais {
	static int NUMDIAS = 7;
	private double[] qtdChuva= new double[NUMDIAS];
	private double[] pressaoMedia = new double[NUMDIAS];
	double chuvaMedia;
	double chuvaMaxima;

	void setDados(double[] chuva, double[] pressao) {
		this.qtdChuva = chuva;
		this.pressaoMedia = pressao;
	}

	void calculaEstatisticas() {
		chuvaMaxima = 0.0;
		double somaChuva = 0.0;
		for (int i = 0; i < qtdChuva.length; i++) {
			if (qtdChuva[i] >= chuvaMaxima)
				chuvaMaxima = qtdChuva[i];
			somaChuva += qtdChuva[i];
		}
		chuvaMedia = somaChuva / qtdChuva.length;
	}

	double getChuvaMedia() {
		return chuvaMedia;
	}
    
	double getChuvaMaxima() {
		return chuvaMaxima;
	}
}