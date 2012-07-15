package artistas.persistence;

import java.util.List;

import artistas.model.Artista;

public interface ArtistaDAO {

	
	public List<Artista> findAll();

	public void insert(Artista miArtista);
	
	
}
