package tarea.arep.model;

import javax.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import java.util.List;

@Entity
@Cacheable
public class Thread extends PanacheEntityBase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    
    public String name;

    @OneToMany(mappedBy = "thread", cascade = CascadeType.ALL)
    public List<Post> posts; 

    @ManyToMany(mappedBy = "threads", cascade = CascadeType.ALL)
    public List<User> users; 

    @OneToOne(mappedBy = "thread", cascade = CascadeType.ALL)
    public Post parentPost;

    @OneToOne(mappedBy = "thread", cascade = CascadeType.ALL)
    public Thread parentThread;

    

    public Thread() {
    }

    public Thread(Long id, String name, List<Post> posts, List<User> users, Post parentPost, Thread parentThread) {
        this.id = id;
        this.name = name;
        this.posts = posts;
        this.users = users;
        this.parentPost = parentPost;
        this.parentThread = parentThread;
    }

    @Embedded
    public Long getId() {
        return id;
    }

    @Embedded
    public void setId(Long id) {
        this.id = id;
    }

    @Embedded
    public String getName() {
        return name;
    }

    @Embedded
    public void setName(String name) {
        this.name = name;
    }

    @Embedded
    public List<Post> getPosts() {
        return posts;
    }

    @Embedded
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Embedded
    public List<User> getUsers() {
        return users;
    }

    @Embedded
    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Embedded
    public Post getParentPost() {
        return parentPost;
    }

    @Embedded
    public void setParentPost(Post parentPost) {
        this.parentPost = parentPost;
    }
    
    @Embedded
    public Thread getParentThread() {
        return parentThread;
    }

    @Embedded
    public void setParentThread(Thread parentThread) {
        this.parentThread = parentThread;
    }
}
