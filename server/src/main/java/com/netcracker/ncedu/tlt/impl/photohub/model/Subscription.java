package com.netcracker.ncedu.tlt.impl.photohub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String emailSubscriber;

    private String subscribeTo;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getEmailSubscriber() {
        return emailSubscriber;
    }

    public void setEmailSubscriber(String emailSubscriber) {
        this.emailSubscriber = emailSubscriber;
    }

    public String getSubscribeTo() {
        return subscribeTo;
    }

    public void setSubscribeTo(String subscribeTo) {
        this.subscribeTo = subscribeTo;
    }
}
