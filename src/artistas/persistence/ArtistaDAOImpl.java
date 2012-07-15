package artistas.persistence;

import java.util.LinkedList;
import java.util.List;

import artistas.model.Artista;

public class ArtistaDAOImpl implements ArtistaDAO {

	public List<Artista> findAll() {
		List<Artista> artistas = new LinkedList<Artista>();
		artistas.add(new Artista("John Lennon"));
		artistas.add(new Artista("Paul McCartney"));
		
		return artistas;
	}

	@Override
	public void insert(Artista miArtista) {
		// guardo en la base, por ejemplo
		
	}

}
