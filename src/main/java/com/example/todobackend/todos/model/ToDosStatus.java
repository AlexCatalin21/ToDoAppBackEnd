package com.example.todobackend.todos.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "todos_statuses")
public class ToDosStatus {
    public enum Status {
        IN_PROGRESS, DONE
    }

    @Id
    private long Id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;
}
