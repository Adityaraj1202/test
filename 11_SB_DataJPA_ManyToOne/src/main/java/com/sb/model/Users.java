package com.sb.model;

import javax.persistence.*;

@Entity
@Table(name = "users3", catalog = "test")
public class Users {

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ORACLE_DB_SEQ_ID")
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "name")
    private String name;
    private Integer salary;
    private String teamName;

    public Users() {
    }

    public Integer getId() {
        return id;
    }

    public Users setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Users setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getSalary() {
        return salary;
    }

    public Users setSalary(Integer salary) {
        this.salary = salary;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public Users setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
}
