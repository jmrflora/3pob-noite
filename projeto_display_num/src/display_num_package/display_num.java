package display_num_package;

public class display_num {
	
	public display_num() {	
	}
	
	public void imprimeDivisaoInt(int n1,int n2) {
		System.out.print("divisao de inteiros:" + n1 + "/" +n2);
		int n3 = n1/n2;
		System.out.println(n3);
	}
	public int retornaDivisaoInt(int n1,int n2) {
		System.out.print("divisao de inteiros:" + n1 + "/" +n2);
		int n3 = n1/n2;
		return n3;
	}
	public void imprimeDivisaoDbl(double n1,double n2) {
		System.out.print("divisao de double:" + n1 + "/" + n2);
		double n3 = n1/n2;
		System.out.println(n3);
	}
	public double retronaDivisaoDbl(double n1,double n2) {
		System.out.print("divisao de double:" + n1 + "/" + n2);
		double n3 = n1/n2;
		return n3;
	}
	
}
