
public class Pessoa {
	private String name;
	private String cpf;
	private int idade;
	private String religiao;
	private boolean favorito;
	CelularTijolão AdapterCelular = new AdapterCelular();

	public void addPessoa(Pessoa pessoa) {
		AdapterCelular.addPessoa(pessoa);
	}

	public void removerPessoa(Pessoa pessoa) {
		AdapterCelular.removerPessoa(pessoa);
	}

	public void atualizarFavorito(Pessoa pessoa, boolean status) {
		AdapterCelular.atualizarFavorito(pessoa, status);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getReligiao() {
		return religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}

	public boolean isFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}

}
