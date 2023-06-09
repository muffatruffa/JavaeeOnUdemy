package com.pedantic.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected String userEmail;
    
    protected LocalDateTime createdOn;
    
    

    public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	@Version
    protected Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
