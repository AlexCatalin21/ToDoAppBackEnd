package com.example.todobackend.todos.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "todos_types")
public class ToDosType {
    public enum Type {
        HOME, WORK, FREE_TIME
    }

    @Id
    private long Id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Type type;
}
