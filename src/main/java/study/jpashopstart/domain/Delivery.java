package study.jpashopstart.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    private String city;
    private String street;
    private String zipcode;

    private DeliveryStatus status;

    /*@OneToOne(mappedBy = "delivery")
    private Order order;*/
}
