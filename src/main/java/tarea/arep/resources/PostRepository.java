package tarea.arep.resources;

import javax.enterprise.context.ApplicationScoped;

import tarea.arep.model.Post;
import io.quarkus.hibernate.orm.panache.PanacheRepository;  

@ApplicationScoped
public class PostRepository implements PanacheRepository<Post> {
}
