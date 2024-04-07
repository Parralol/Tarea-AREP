package tarea.arep.resources;

import javax.enterprise.context.ApplicationScoped;

import tarea.arep.model.Thread;
import io.quarkus.hibernate.orm.panache.PanacheRepository;


@ApplicationScoped
public class ThreadRepository implements PanacheRepository<Thread> {
}
