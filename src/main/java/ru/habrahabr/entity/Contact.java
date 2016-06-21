package ru.habrahabr.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Date: 27.08.15
 * Time: 12:58
 *
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 * @author http://mruslan.com
 */
@Entity
@Table
public class Contact implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column(unique = true)
    private String phone;

    @Column(unique = true)
    private String email;

    @Column
    private Date birth;

    public Contact() {
    }

    public Contact(String name, String phone, String email,Date birth) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birth = birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {return birth;}
    public void SetBirth(Date d) {birth = d;}
}
