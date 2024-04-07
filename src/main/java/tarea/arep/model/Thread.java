package tarea.arep.model;

import javax.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import java.util.List;

@Entity
public class Thread extends PanacheEntity{
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Post getParentPost() {
        return parentPost;
    }

    public void setParentPost(Post parentPost) {
        this.parentPost = parentPost;
    }
    
    public Thread getParentThread() {
        return parentThread;
    }

    public void setParentThread(Thread parentThread) {
        this.parentThread = parentThread;
    }
}
