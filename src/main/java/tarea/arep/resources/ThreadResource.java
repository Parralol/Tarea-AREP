package tarea.arep.resources;

import tarea.arep.model.Thread;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/thread")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class ThreadResource {
    @Inject
    ThreadRepository repository;
    @POST
    @Transactional
    public void createHilo(Thread hilo) {
        repository.persist(hilo);
    }

    @SuppressWarnings("rawtypes")
    @GET
    @Transactional
    public List selectHilo() {
        return repository.listAll();
    }

}
