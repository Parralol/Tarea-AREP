package tarea.arep.resources;

import tarea.arep.model.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class UserResource {

    @Inject
    UserRepository repository;

    @POST
    @Transactional
    public void createUsuario(User usuario) {
        repository.persist(usuario);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void updateUsuario(@PathParam("id") Long id, User usuario) {
        User existingUsuario = repository.findById(id);
        if (existingUsuario != null) {
            // Actualizar los campos del usuario existente
            existingUsuario.setName(usuario.getName());
            existingUsuario.setEmail(usuario.getEmail());
            existingUsuario.setPass(usuario.getPass());
        }
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deleteUsuario(@PathParam("id") Long id) {
        repository.deleteById(id);
    }

    @GET
    @Path("/{id}")
    public User getUsuario(@PathParam("id") Long id) {
        return repository.findById(id);
    }

    @GET
    public List<User> getAllUsuarios() {
        return repository.listAll();
    }
}