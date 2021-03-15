/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipam.teste;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wiljr
 */
@Entity
@Table(name = "tarefa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarefa.findAll", query = "SELECT t FROM Tarefa t"),
    @NamedQuery(name = "Tarefa.findById", query = "SELECT t FROM Tarefa t WHERE t.id = :id"),
    @NamedQuery(name = "Tarefa.findByDescricao", query = "SELECT t FROM Tarefa t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "Tarefa.findByDataPrevista", query = "SELECT t FROM Tarefa t WHERE t.dataPrevista = :dataPrevista"),
    @NamedQuery(name = "Tarefa.findByDataTermino", query = "SELECT t FROM Tarefa t WHERE t.dataTermino = :dataTermino"),
    @NamedQuery(name = "Tarefa.findByDataCriacao", query = "SELECT t FROM Tarefa t WHERE t.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "Tarefa.findByDataAlteracao", query = "SELECT t FROM Tarefa t WHERE t.dataAlteracao = :dataAlteracao")})
public class Tarefa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataPrevista")
    @Temporal(TemporalType.DATE)
    private Date dataPrevista;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataTermino")
    @Temporal(TemporalType.DATE)
    private Date dataTermino;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataCriacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataAlteracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAlteracao;

    public Tarefa() {
    }

    public Tarefa(Integer id) {
        this.id = id;
    }

    public Tarefa(Integer id, String descricao, Date dataPrevista, Date dataTermino, Date dataCriacao, Date dataAlteracao) {
        this.id = id;
        this.descricao = descricao;
        this.dataPrevista = dataPrevista;
        this.dataTermino = dataTermino;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarefa)) {
            return false;
        }
        Tarefa other = (Tarefa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.unipam.teste.Tarefa[ id=" + id + " ]";
    }
    
}
