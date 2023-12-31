package com.cba.ecommuter.model;
// Generated Jun 20, 2023 2:49:48 PM by Hibernate Tools 4.3.1


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


/**
 * Status generated by hbm2java
 */
@Entity
@Table(name = "status"
)
public class Status implements java.io.Serializable {

    private String statusCode;
    private String statusDescription;
    private String statusCategory;
    private Set<User> users = new HashSet<User>(0);
    private Set<Role> roles = new HashSet<Role>(0);
    private Set<UserRole> userRoles = new HashSet<UserRole>(0);
    private Set<UserType> userTypes = new HashSet<UserType>(0);

    public Status() {
    }

    public Status(String statusCode) {
        this.statusCode = statusCode;
    }

    @Id
    @Column(name = "status_code", unique = true, nullable = false, length = 10)
    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Column(name = "status_description", length = 100)
    public String getStatusDescription() {
        return this.statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    @Column(name = "status_category", length = 10)
    public String getStatusCategory() {
        return this.statusCategory;
    }

    public void setStatusCategory(String statusCategory) {
        this.statusCategory = statusCategory;
    }
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
    public Set<User> getUsers() {
        return this.users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
    public Set<Role> getRoles() {
        return this.roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
    public Set<UserRole> getUserRoles() {
        return this.userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.roles = roles;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
    public Set<UserType> getUserTypes() {
        return userTypes;
    }

    public void setUserTypes(Set<UserType> userTypes) {
        this.userTypes = userTypes;
    }

}


