package com.aldrin.foodfam.model.recipe;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.OptimisticLocking;


import java.io.Serializable;
import java.util.Date;
import org.springframework.data.jpa.repository.Temporal;


@Setter
@Getter
@DynamicUpdate
@MappedSuperclass
@OptimisticLocking
public class Base implements Serializable {
//
////    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "created_date")
//    public Date createdDate;
//
////    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "updated_date")
//    public Date updatedDate;
//
//    @PrePersist
//    public void prePersist() {
//        createdDate = new Date();
//        updatedDate = new Date();
//    }
//
//    @PreUpdate
//    public void preUpdate() {
//        updatedDate = new Date();
//    }
}
