package fr.WildCircus.WildCircus.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Tickets {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @OneToOne
  @JoinColumn(name = "reservation_id")
   private Reservation reservation;

   @OneToOne
   @JoinColumn(name = "price_id")
    private Price price;

  public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

  