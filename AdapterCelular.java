
public class AdapterCelular implements CelularTijolão {
	CelularSmartPhone alvo;

	public AdapterCelular() {
		this.alvo = new CelularSmartPhone();
	}

	@Override
	public void addPessoa(Pessoa pessoa) {
		alvo.addPessoa(pessoa);

	}

	@Override
	public void removerPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		alvo.removerPessoa(pessoa);

	}

	@Override
	public void atualizarFavorito(Pessoa pessoa, boolean status) {
		alvo.atualizarFavorito(pessoa, status);

	}

}
