package gravadora;

import java.util.ArrayList;
import java.util.List;

public class Album {

	private String nomeAlbum;
	private Integer anoLancamento;
	private List<Musica> musicas;

	public Album(String nomeAlbum, Integer anoLancamento) {
		this.nomeAlbum = nomeAlbum;
		this.anoLancamento = anoLancamento;
		this.musicas = new ArrayList<>();
	}

	public void adicionarMusica(Musica musica) {
		musicas.add(musica);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Álbum: ").append(nomeAlbum).append("\n");
		sb.append("Ano de Lançamento: ").append(anoLancamento).append("\n");
		sb.append("Músicas:\n");
		for (Musica musica : musicas) {
			sb.append(musica).append("\n");
		}
		return sb.toString();
	}
}
