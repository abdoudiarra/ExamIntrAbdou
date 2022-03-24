package Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class PostComment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    PostUser commentateur;
    String commentaire;

    public PostComment(long id, PostUser commentateur, String commentaire) {
        this.id = id;
        this.commentateur = commentateur;
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "id=" + id +
                ", commentateur=" + commentateur +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }
}
