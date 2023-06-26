package online.store.models;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 255)
    private String name;

    @NotBlank
    @Column(columnDefinition="TEXT")
    private String description;


    @NotBlank
    @Size(max = Integer.MAX_VALUE)
    private byte[] image;


    @NotBlank
    private int quantity;

    @NotBlank
    private double price;
    private double discountPrice;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable( name = "product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> idCategory;

    @OneToMany(mappedBy = "productReview")
    private List<Reviews> reviews;
}