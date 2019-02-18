
public class Dti extends Funcionario{

	String[] funcao = {"coordenador", "Analista", "Assistente", "Estagiario"};
	
	public Dti(String funcao){
				
	}
	@Override
	public double getAumento() {
		double calculo = super.getSalario();
		return calculo *= 0.10;
	}

}
