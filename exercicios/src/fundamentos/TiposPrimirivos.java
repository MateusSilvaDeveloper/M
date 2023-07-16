package fundamentos;

public class TiposPrimirivos {

	public static void main(String[] args) {
		// Informaçoes do funcionários 
		
		// Tipos numéricos inteiros
		byte anosdeEmpresa = 23;
		short numerodeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumulados =2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; //true
		
		// tipo caractere 
		char status  = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosdeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numerodeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumulados);
		
		System.out.println(id + ": ganha " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status "+ status);
	}

}
