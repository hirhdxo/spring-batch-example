package com.example.springbatch.entity;

import com.example.springbatch.enums.Grade;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Grade grade;

    @Column
    private boolean activeStatus;

    public void changeActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }
}
