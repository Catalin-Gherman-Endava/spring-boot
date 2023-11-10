package endava.spring.boot.model;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StudentDTO {

    private Long id;

    @Size(max = 255)
    private String name;

    private Double mark;

}
