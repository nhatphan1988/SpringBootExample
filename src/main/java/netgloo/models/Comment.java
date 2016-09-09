package netgloo.models;

import javax.persistence.*;

/**
 * Created by apple on 8/28/16.
 */
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String author;
    private String likes;
    private String unlikes;
    private String content;
    private String time;

    public Comment(long id, String author, String likes, String unlikes, String content, String time) {
        this.id = id;
        this.author = author;

        this.likes = likes;
        this.unlikes = unlikes;
        this.content = content;
        this.time = time;
    }


}
