
public class Dti extends Funcionario {


	//Construtor
	public Dti(String nome, String setor, String cargo) {
		super.setNome(nome);
		super.setSetor(setor);
		super.setCargo(cargo);
	}
	String a = " ";
	

	@Override
	public double getAumento() {
		switch(super.getCargo()) {
		case "coordenador":
			double calculo = super.getSalario();
			return calculo *= 0.30;
		case "analista":
			double calculo1 = super.getSalario();
			return calculo1 *= 0.20;
		case "assistente":
			double calculo2 = super.getSalario();
			return calculo2 *= 0.10;
		case "estagiario":
			return 80;
		default:
			System.out.println("cargo errado. Verifique se digitou corretamente!");
		}
		return 0;
	}
}