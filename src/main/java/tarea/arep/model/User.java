package tarea.arep.model;

import javax.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Cacheable
@Table(name = "Users")
public class User extends PanacheEntityBase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true, nullable = false)
    public Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "email")
    public String email;

    @Column(name = "pass")
    public String pass;

    public User() {
    }

    public User(Long id, String name, String email, String pass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
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
    public String getEmail() {
        return email;
    }

    @Embedded
    public void setEmail(String email) {
        this.email = email;
    }

    @Embedded
    public String getPass() {
        return pass;
    }

    
    public void setPass(String pass) {
        this.pass = pass;
    }

    
}
