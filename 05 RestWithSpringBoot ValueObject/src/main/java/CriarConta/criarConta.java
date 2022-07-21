package CriarConta;

public class criarConta {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(02202005);
		p1.setDono("michel");
		p1.abrirConta("CC");
		p1.sacar(2);
		p1.depositar(50);
		p1.estadoAtual();
		
		


	}

}
