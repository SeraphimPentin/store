package online.store.models;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
    @Size(max = 40)
    private String nameProduct;

    @NotBlank
    private double price;

    @NotBlank
    @Size(max = Integer.MAX_VALUE)
    private byte[] image;

    @NotBlank
    private int quantity;

    @NotBlank
    @Column(columnDefinition="TEXT")
    private String description;
}