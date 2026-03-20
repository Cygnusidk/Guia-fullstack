package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import java.util.ArrayList;
import java.util.List;

public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }
    public Libro buscarPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    public Libro guardar(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }

    public Libro actualizar (Libro libro) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i <listaLibros.size(); i++) {
            if(listaLibros.get(i).getId() == libro.getId()) {
                id = libro.getId();
                idPosicion = i;
            }
        }
        Libro libroActualizar = new Libro();
        libroActualizar.setId(id);
        libroActualizar.setTitulo(libro.getTitulo());
        libroActualizar.setAutor(libro.getAutor());
        libroActualizar.setFechaPublicacion(libro.getFechaPublicacion());
        libroActualizar.setEditorial(libro.getEditorial());
        libroActualizar.setIsbn(libro.getIsbn());

        listaLibros.set(idPosicion, libroActualizar);
        return libroActualizar;
    }

    public void eliminar(int id) {

        Libro libro = buscarPorId(id);
        if (libro != null) {
            listaLibros.remove((libro));
        }
    }

}

