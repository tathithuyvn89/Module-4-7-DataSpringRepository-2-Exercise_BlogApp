package myapp.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
public class Blog {
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String author;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Blog(long id, String author, String name, String content, Timestamp date, Category category) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.content = content;
        this.date = date;
        this.category = category;
    }

    private String content;
    private Timestamp date = new Timestamp(System.currentTimeMillis());
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Blog(String author, String content, Category category) {

        this.author = author;
        this.content = content;

        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog() {
    }

    public Blog(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public Blog(long id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;

    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
