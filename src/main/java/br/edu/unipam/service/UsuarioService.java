package br.edu.unipam.service;

import br.edu.unipam.entity.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UsuarioService {
    
        @PersistenceContext(name = "pu_todo")
    private EntityManager entityManager;
        
    public Usuario salvarUsuario(Usuario usuario){
        entityManager.persist(usuario);
        return usuario;
    }
    
    //Encontrar usuários por id
    public Usuario localizarPorId(Long id){
        Usuario userBd = entityManager.find(Usuario.class, id);
        return userBd;
    }
    
    //Remover   
    public void remover (Long id){
        Usuario user = localizarPorId(id);
        if (user != null){
            entityManager.remove(user);
        }
    }
    
    //Editar
    public Usuario editar(Usuario usuario){
        Usuario userBd = localizarPorId(usuario.getId());
                if(userBd != null){
                    entityManager.merge(usuario);
                    return usuario;
                }
        return null;
    }
    
   
    //Listar todos os usuários
    public List<Usuario> listarTodos()
    {
        //return entityManager.createQuery("select u from Usuario u ordey by u.nome", Usuario.class).getResultList();
        return entityManager.createNamedQuery(Usuario.GET_ALL_USERS, Usuario.class).getResultList();
    }
}
