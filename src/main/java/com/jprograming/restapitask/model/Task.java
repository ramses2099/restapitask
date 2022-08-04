package com.jprograming.restapitask.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Task {

    @Id
    @SequenceGenerator(
            name = "task_sequence",
            sequenceName = "task_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "task_sequence"
    )
    private Long id;
    private String Title;
    private LocalDate Created;

    public Task() {
    }

    public Task(String title, LocalDate created) {
        Title = title;
        Created = created;
    }

    public Task(Long id, String title, LocalDate created) {
        this.id = id;
        Title = title;
        Created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public LocalDate getCreated() {
        return Created;
    }

    public void setCreated(LocalDate created) {
        Created = created;
    }
}
