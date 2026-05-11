package com.project.library.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roleId;

    @Column(nullable = false)
    private String roleName;

    @OneToMany(mappedBy = "role")
    private List<User> users;

    public Role() {

    }

    public Role(long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setUserId(long id) {
        this.roleId = id;
    }

    public String getIsAdmin() {
        return roleName;
    }

    public void setIsAdmin(String roleName) {
        this.roleName = roleName;
    }

}
