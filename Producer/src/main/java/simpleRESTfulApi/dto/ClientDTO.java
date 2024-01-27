package simpleRESTfulApi.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {
    private Integer id;
    @Email(message = "Введите валидный email")
    private String name;
    private String email;
    private String phone;
}
