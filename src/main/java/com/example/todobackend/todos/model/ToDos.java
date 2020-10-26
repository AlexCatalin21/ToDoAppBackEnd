package com.example.todobackend.todos.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "todos")
public class ToDos {
    @Id
    private long id;
    @NotNull @Lob
    private String description;
    @NotNull
    private Date creationDate;
    @NotNull
    private Date expiringDate;
    @NotNull
    private int estimatedDays;
    @NotNull
    private int allocatedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "todos_status_id", referencedColumnName = "id")
    @NotNull
    private ToDosStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "todos_type_id", referencedColumnName = "id")
    @NotNull
    private ToDosType type;


}
