package Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String postData;

    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    PostUser user;

    Date dateTime;

    @OneToMany(mappedBy = "documents", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<PostComment> commentsList;

    public Post(long id, String postData, PostUser user, Date dateTime, List<PostComment> commentsList) {
        this.id = id;
        this.postData = postData;
        this.user = user;
        this.dateTime = dateTime;
        this.commentsList = commentsList;
    }

    public long getId() {
        return id;
    }

    public String getPostData() {
        return postData;
    }

    public PostUser getUser() {
        return user;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public List<PostComment> getCommentsList() {
        return commentsList;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", postData='" + postData + '\'' +
                ", user=" + user +
                ", dateTime=" + dateTime +
                ", commentsList=" + commentsList +
                '}';
    }
}



