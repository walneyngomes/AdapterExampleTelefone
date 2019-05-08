import java.util.ArrayList;

public class CelularSmartPhone {
	// Tornar uma interface adaptavel;
	ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();

	public void addPessoa(Pessoa pessoa) {
		agenda.add(pessoa);

	}

	public void removerPessoa(Pessoa pessoa) {
		for (Pessoa p : agenda) {
			if (p == pessoa) {
				agenda.remove(p);
			}
		}

	}

	public void atualizarFavorito(Pessoa pessoa, boolean status) {
		for (Pessoa p : agenda) {
			if (p == pessoa) {
				p.setFavorito(status);
			}
		}
	}

}
