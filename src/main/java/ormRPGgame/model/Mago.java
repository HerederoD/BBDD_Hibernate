package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;

// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "Mago")
public class Mago {
    // @TODO completar las anotaciones de todos los atributos
    // PARA QUE COJONES ME IMPORTAS UN SET Y UN HASHSET SI NO LO VAS A USAR PA NAAAAAAAAAAAAAAAAAA
    @ManyToOne(optional = false)
    @JoinColumn(name = "Daga")
    @Column(nullable = false, length = 30)
    private String NombreU;
    @Column(nullable = false, length = 30)
    private String NombreM;
    @Column(nullable = false)
    private double Vida;
    @Column(nullable = false)
    private double TotalOro;
    @Column(nullable = false)
    private double Nivel;
    @ManyToOne(optional = false)
    @JoinColumn(name = "Daga")
    @Column(nullable = false)
    private Daga Daga;
    @Column(nullable = false)
    private double Mana;
    @Column(nullable = false)
    private String Apariencia;
    @Column(nullable = false)
    private double CargaT;

    public Mago(String nombre, Daga daga){
        // @TODO completar el constructor de la clase.
        //  Para ello es necesario un string con el nombre del mago y un objeto de la clase daga
        //  Inicialice el resto de atributos a los valores que considere oportunos
        NombreU = "Un user random";
        NombreM = nombre;
        Vida = Math.random() * 20;
        TotalOro = Math.random() * 20;
        Nivel = Math.random() * 20;
        Daga = daga;
        Mana = Math.random() * 20;
        Apariencia = "ALKSDLADNLASNDLASDLLKASND";
        CargaT = Math.random() * 20;
    }

    public String getnombre(){ return this.NombreM; }
}
