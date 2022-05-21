package study.jpashopstart.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class ItemTest {

    @PersistenceContext
    EntityManager em;

    @Test
    @Rollback(value = false)
    public void CreateItemTest() throws Exception{
        //given
        Movie movie = new Movie();
        movie.CreateItem("범죄도시", 20000, 10);
        movie.CreateMovie("snapDragon", "마동석");

        movie.CreatedInfo("heechul", LocalDateTime.now());

        //when
        em.persist(movie);

        //then
        Movie findMovie = em.find(Movie.class, movie.getId());
        System.out.println(findMovie.getActor());
        assertThat(findMovie.getActor()).isEqualTo("마동석");
    }

}