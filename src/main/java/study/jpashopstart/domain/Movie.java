package study.jpashopstart.domain;

import lombok.Getter;

import javax.persistence.Entity;

@Entity
@Getter
public class Movie extends Item {

    private String director;
    private String actor;

    public void CreateMovie(String director, String actor) {
        this.director = director;
        this.actor = actor;
    }
}
