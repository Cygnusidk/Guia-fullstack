package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data genera automáticamente: getters, setters, toString, equals, hashCode
// y un constructor con los campos @NonNull o final
@Data
// @AllArgsConstructor genera un constructor con TODOS los campos como parámetros
@AllArgsConstructor
// @NoArgsConstructor genera un constructor vacío (sin argumentos)
@NoArgsConstructor
public class Libro {

    public int id;
    public String isbn;
    public String titulo;
    public String editorial;
    public int fechaPublicacion;
    public String autor;

}
