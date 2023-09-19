package application.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(nam="generos")
public class Genero {
    @Id 
    @GeneratedValue(strategy=GeneratationType.IDENTITY)
    private int id;
    private String nome;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome() {
        this.nome = nome;
    }
}