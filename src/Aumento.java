
public class Aumento{

	public void getAumento(Funcionario f) {
		String nome = f.getNome();
		String setor = f.getSetor();
		double aumento = f.getAumento();
		System.out.println("O funcionario com o nome de " + nome + " do setor " + setor +
			" recebeu um aumento de "+ aumento);
		
	}
	
}
