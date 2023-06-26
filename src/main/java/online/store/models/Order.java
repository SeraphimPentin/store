package online.store.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue
    private long id;

    @Email
    private String email;

    @NotBlank
    private Double total;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable( name = "order_wrapper",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "wrapper_id"))
    private List<Wrapper> cart;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private User bayer;

}