package online.store.models;


import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data@Table(name = "reviews")

public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @Column(columnDefinition="TEXT")
    private String comment;

    @Size(max = Integer.MAX_VALUE)
    private byte[] image;

    @Size(max = 5)
    private int mark;

    @ManyToOne
    @JoinColumn(name = "review_id", referencedColumnName = "id")
    private Product review;


}
