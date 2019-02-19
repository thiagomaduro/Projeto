
public class Index {
	public static void main(String[] args) {

		
		Funcionario exp = new Expediente("danii", "Expediente", "coordenador");
		exp.setSalario(500);
		
		Dti dti = new Dti("thiago", "Dti", "estagiario");
		dti.setSalario(5000);
		
		Diretoria dir = new Diretoria();
		dir.setSalario(10000.0);
		
		Aumento a = new Aumento();
		a.getAumento(dti);
		a.getAumento(exp);
		//a.getAumento(dir);
		
		
	}
}
