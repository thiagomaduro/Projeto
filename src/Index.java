
public class Index {
	public static void main(String[] args) {

		
		Funcionario exp = new Expediente("dani", "Expediente", "coordenador");
		exp.setSalario(2600);
		
		
		Dti dti = new Dti("Thiago", "Dti", "analista");
		dti.setSalario(1170);
		
		Diretoria dir = new Diretoria();
		dir.setSalario(10000.0);
		
		Aumento a = new Aumento();
		a.getAumento(dti);
		a.getAumento(exp);
		//a.getAumento(dir);
		
		
	}
}
