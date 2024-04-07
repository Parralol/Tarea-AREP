package tarea.arep.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Thread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<Post> posts; 
    @ManyToMany
    private List<User> users; 
    @OneToOne
    private Post parentPost;
    @OneToOne
    private Thread parentThread;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((posts == null) ? 0 : posts.hashCode());
        result = prime * result + ((users == null) ? 0 : users.hashCode());
        result = prime * result + ((parentPost == null) ? 0 : parentPost.hashCode());
        result = prime * result + ((parentThread == null) ? 0 : parentThread.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Thread other = (Thread) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (posts == null) {
            if (other.posts != null)
                return false;
        } else if (!posts.equals(other.posts))
            return false;
        if (users == null) {
            if (other.users != null)
                return false;
        } else if (!users.equals(other.users))
            return false;
        if (parentPost == null) {
            if (other.parentPost != null)
                return false;
        } else if (!parentPost.equals(other.parentPost))
            return false;
        if (parentThread == null) {
            if (other.parentThread != null)
                return false;
        } else if (!parentThread.equals(other.parentThread))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Thread [id=" + id + ", name=" + name + ", posts=" + posts + ", users=" + users + ", parentPost="
                + parentPost + ", parentThread=" + parentThread + "]";
    }


    
}
