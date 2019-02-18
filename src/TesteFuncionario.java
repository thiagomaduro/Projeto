
public class TesteFuncionario {
	public static void main(String[] args) {

		Expediente exp = new Expediente();
		exp.setSalario(1000);
		
		Dti dti = new Dti("Coordenador");
		dti.setSalario(5000);
		//System.out.println(dti.getAumento());
		
		Aumento a = new Aumento();
		a.getAumento(dti);
		a.getAumento(exp);
		
		
	}
}
