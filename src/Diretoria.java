
public class Diretoria extends Funcionario {

	@Override
	public double getAumento() {
		System.out.print("A diretoria tem um aumento de 50%: ");
		double resultado = super.getSalario();
		return resultado *= 0.5;
	}

	
}
