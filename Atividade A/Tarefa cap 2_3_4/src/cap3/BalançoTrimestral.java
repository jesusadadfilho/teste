package cap3;

public class Balan�oTrimestral {
	public static void main(String args[]) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMar�o = 17000;
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMar�o;
		double mediaMensal = gastosTrimestre / 3;
		System.out.println(gastosTrimestre);
		System.out.println("Valor da media mensal � :"+ mediaMensal);
		
	}

}
