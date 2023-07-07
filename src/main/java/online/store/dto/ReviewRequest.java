package online.store.dto;

import lombok.Data;


@Data
public class ReviewRequest {
    private Long id;

    private String email;

    private String comment;

    private byte[] image;

    private int mark;
}
