
public class Expediente extends Funcionario {


	public Expediente(String nome, String setor, String cargo) {
		super.setNome(nome);
		super.setSetor(setor);
		super.setCargo(cargo);
	}

	@Override
	public double getAumento() {
		switch (super.getCargo()) {
		case "coordenador":
			double calculo = super.getSalario();
			return calculo *= 0.3;

		case "analista":
			double calculo1 = super.getSalario();
			return calculo1 *= 0.1;

		case "assistente":
			System.out.print("Assistente de Expediente recebe uma bonificação apenas de: ");
			return 100;
		default:
			System.out.println("cargo errado. Verifique se digitou corretamente!");
		}
		return 0;
	}
}
