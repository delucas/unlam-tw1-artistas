package artistas.services;

import java.util.List;

import artistas.model.Artista;
import artistas.persistence.ArtistaDAO;
import artistas.persistence.ArtistaDAOImpl;

public class ArtistaService {

	private static ArtistaService instance = new ArtistaService();
	
	private ArtistaService() {}
	
	public static ArtistaService getInstance(){
		return instance;
	}
	
	public Artista altaArtista(String nombre){
		
		Artista miArtista = new Artista(nombre);
		
		ArtistaDAO dao = new ArtistaDAOImpl();
		dao.insert(miArtista);
		
		return miArtista;
		
	}
	
	public List<Artista> mazinger(){
		
		ArtistaDAO dao = new ArtistaDAOImpl();
		
		List<Artista> artistas = dao.findAll();
		
		return artistas;
		
	}
	
	
	
}
