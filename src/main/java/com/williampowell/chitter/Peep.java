package com.williampowell.chitter;


import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Peep {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String content;

    protected Peep() {
    }

    public Peep(String comment) {
        this.content = comment;
    }

}