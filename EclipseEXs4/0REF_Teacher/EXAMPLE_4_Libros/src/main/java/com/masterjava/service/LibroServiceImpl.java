package com.masterjava.service;
	import java.util.ArrayList;
	import java.util.List;
	import org.springframework.stereotype.Service;
	import com.masterjava.modelos.Libro;

@Service
public class LibroServiceImpl implements LibroService {
    private List<Libro> libros;

    public LibroServiceImpl() {
        libros = new ArrayList<>(List.of(
                new Libro(1, "asdfw", "wef"),
                new Libro(2, "afghw", "hre"),
                new Libro(3, "yuffw", "iuh"),
                new Libro(4, "sdfwt", "dfw"),
                new Libro(5, "opuie", "cas")
        ));
    }

    @Override
    public List<Libro> libros() {
        return libros;
    }

    @Override
    public Libro buscarLibro(int isbn) {
        for(Libro libro : libros)
        {
            if(libro.getIsbn() == isbn)
            {
                return libro;
            }
        }
        return null;
    }
    
//	@Override
//	public Libro buscarLibro(int isbn) {
//		return libros.stream()
//			.filter(libro -> libro.getIsbn() == isbn)
//			.findFirst()
//			.orElse(null);
//	}

    @Override
    public void altaLibro(Libro libro) {
        libros.add(libro);
    }
    
//    @Override
//	public void altaLibro(Libro libro) {
//		if(!libros.contains(libro)) {
//			libros.add(libro);
//		}
//	}

    @Override
    public void actualizarLibro(Libro libro) {
        for(int i = 0; i < libros.size(); i++)
        {
            if(libros.get(i).getIsbn() == libro.getIsbn())
            {
                libros.set(i, libro);
                break;
            }
        }
    }

//	@Override
//	public void actualizarLibro(Libro libro) {
//		Libro lib = buscarLibro(libro.getIsbn());
//		if (lib!=null) {
//			lib.setTitulo(libro.getTitulo());
//			lib.setTematica(libro.getTematica());
//		}
//	}
    
    
    @Override
    public List<Libro> eliminarLibro(int isbn) {
        libros.removeIf(libro -> libro.getIsbn() == isbn);
        return libros;
    }
    
}

