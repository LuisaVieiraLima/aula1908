public class Main
{
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Theo", 42, "Médico", 7.500);
        Funcionario funcionario2 = new Funcionario("Marta", 26, "Enfermeira", 8.000);
        Funcionario funcionario3 = new Funcionario("Pietra", 24, "Atendente", 4.500);
    	
    	
    System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: R$ " + funcionario1.getSalario());
        System.out.println("-------------------------");
 
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Idade: " + funcionario2.getIdade());
        System.out.println("Cargo: " + funcionario2.getCargo());
        System.out.println("Salário: R$ " + funcionario2.getSalario());
        System.out.println("-------------------------");
 
        System.out.println("Nome: " + funcionario3.getNome());
        System.out.println("Idade: " + funcionario3.getIdade());
        System.out.println("Cargo: " + funcionario3.getCargo());
        System.out.println("Salário: R$ " + funcionario3.getSalario());
    

	}
}
