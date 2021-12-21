package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
// Como en nuestra BBDD la Daga son los padres, es decir, un atributo, voy a ponerle una unidad de atributo: su nombre
public class Daga {
    // @TODO completar las anotaciones de todos los atributos
    @OneToMany(mappedBy = "Daga")
    @Column(nullable = false, length = 30)
    private String name;

    public Daga(String nombre) {
        // @TODO completar el constructor de la clase.
        name = nombre;
    }

    public String getnombre() {
        return this.name;
    }
}
