package Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class PostUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;

    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Post post;

    public PostUser(String nomUser){

    }

    public PostUser(long id, String name, Post post) {
        this.id = id;
        this.name = name;
        this.post = post;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Post getPost() {
        return post;
    }

    @Override
    public String toString() {
        return "PostUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", post=" + post +
                '}';
    }
}
