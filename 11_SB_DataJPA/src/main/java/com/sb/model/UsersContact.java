package com.sb.model;

import javax.persistence.*;

@Entity
@Table(name = "users_contact2")
public class UsersContact {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ORACLE_DB_SEQ_ID")
    private Integer id;
    private Integer phoneNo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users users;

    public UsersContact() {
    }

    public Users getUsers() {
        return users;
    }

    public UsersContact setUsers(Users users) {
        this.users = users;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public UsersContact setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public UsersContact setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
}
