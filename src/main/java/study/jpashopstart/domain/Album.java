package study.jpashopstart.domain;

import lombok.Getter;

import javax.persistence.Entity;

@Entity
@Getter
public class Album extends Item {

    private String artist;
    private String etc;

    public void creatAlbum(String artist, String etc) {
        this.artist = artist;
        this.etc = etc;
    }
}
