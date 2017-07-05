package com.advantio.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Devv-Kiev-2 on 23.06.2017.
 */
@Entity
@Table(name = "Comment")
public class Comment {

    @Id
    @Column(name = "commentId")
    private Long id;
    @Column(name = "text")
    private String text;
    @Column(name = "email")
    private String email;
    @Column(name = "date")
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "blogId")
    private Blog blog;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
