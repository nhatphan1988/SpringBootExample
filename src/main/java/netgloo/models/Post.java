package netgloo.models;

import javax.persistence.*;

/**
 * Created by apple on 8/28/16.
 */
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String author;
    private String likes;
    private String unlikes;
    private String content;
    private String time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getUnlikes() {
        return unlikes;
    }

    public void setUnlikes(String unlikes) {
        this.unlikes = unlikes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Post(long id)
    {
        this.id = id;

    }

    public Post(int id, String author, String likes, String unlikes, String content, String time) {
        this.id = id;
        this.author = author;
        this.likes = likes;
        this.unlikes = unlikes;
        this.content = content;
        this.time = time;
    }
}