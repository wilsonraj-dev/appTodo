package br.edu.unipam.entity;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Tarefa extends AbstractEntity{
    
    private String descricao;
    private LocalDate datePrivate;
    
    @ManyToOne
    private Usuario usuario;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDatePrivate() {
        return datePrivate;
    }

    public void setDatePrivate(LocalDate datePrivate) {
        this.datePrivate = datePrivate;
    }
    
    
}
