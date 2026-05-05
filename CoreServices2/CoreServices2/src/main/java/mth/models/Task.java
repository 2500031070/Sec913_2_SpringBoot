package mth.models;

import jakarta.persistence.*;

@Entity
@Table(name = "task_master")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
}