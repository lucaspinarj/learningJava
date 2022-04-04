package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}

		System.out.println("Fim :)");
	}

	// exceção não checada ou não verificada
	static void geraErro1() /*throws RuntimeException */ {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	//exceção checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}

}
