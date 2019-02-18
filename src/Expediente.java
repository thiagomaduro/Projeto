
public class Expediente extends Funcionario {
	
	@Override
	public  double  getAumento() {
		double calculo = super.getSalario();
		return calculo *= 0.2;
	}
}
