package tarea.arep.model;


import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Cacheable
@Table(name = "posts")
public class Post extends PanacheEntityBase{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
    public Long id;

    @Column(name = "content")
    public String content;

    @Column(name = "user")
    public Long user_id;
    
    @Column(name = "stream_id")
    public Long stream_id;
  

    public Post() {

    }

    public Post(Long user_id, Long stream_id, String content) {
        this.user_id = user_id;
        this.stream_id = stream_id;
        this.content = content;
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
    public String getContent() {
        return content;
    }

    @Embedded
    public void setContent(String content) {
        this.content = content;
    }

    @Embedded
    public Long getUser_id() {
        return user_id;
    }

    @Embedded
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    @Embedded
    public Long getStream_id() {
        return stream_id;
    }

    
    public void setStream_id(Long stream_id) {
        this.stream_id = stream_id;
    }

    

}
