package tarea.arep.resources;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import tarea.arep.model.Post;
import java.util.List;

@Path("/post")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class PostResource {

    @Inject
    PostRepository repository;

    @POST
    @Transactional
    public void createPost(Post post) {
        repository.persist(post);
    }

    @SuppressWarnings("rawtypes")
    @GET
    @Transactional
    public List selectPosts() {
        return repository.listAll();
    }

}
