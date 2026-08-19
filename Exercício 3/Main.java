public class Main
{
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Viviane", 5500.0, "Administração", 6, 16);
		
		System.out.println("=============Gerente==============");
		gerente.apresentarGerente();
		
		
	    double valorTotal = 5500.0;
        double porcentagem = 16;
        double resultado = (valorTotal * porcentagem) / 100.0;
        System.out.println("O bônus é de: " + resultado);
        double novoSalario = valorTotal + resultado;
        System.out.println("Salário total: " + novoSalario);
	}
}
