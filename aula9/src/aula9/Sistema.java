package aula9;

public class Sistema {
	public static void main(String [] args) {
		Funcionario func1 = new Funcionario(); // usando construtor vazio
		Funcionario func2 = new Funcionario("10016545958", 1500); // usando construtor 2 parametros
		
		func1.setNome("Matheus");
		func1.setUltimoCod();
		
		func2.setNome("Ane Caroline");
		func2.setUltimoCod();
		
		System.out.println("F1: " + func1.getNome() + " ultimo Cod " + func1.getUltimoCod());
		System.out.println("F2: " + func2.getNome() + " ultimo Cod " + func2.getUltimoCod());
		
		Funcionario func3 = new Funcionario("111111111111"); // usando construtor 1 parametro
		System.out.println("F3: " + func3.getNome() + " ultimo Cod " + func3.getUltimoCod());
		
		func1.setSalarioBase(1700.9);
		
		System.out.println("part. de lucros do Funcionario 1 e " +func1.calculaPl());
		func1.toString();
		
		Agencia ag1 = new Agencia();
		ag1.FuncAg = func1;
		// implemente um modo de visualizar todos os dados de agencia
		// inclusive os dados dos funcionarios 
		System.out.println(ag1.toString());
	}
}
