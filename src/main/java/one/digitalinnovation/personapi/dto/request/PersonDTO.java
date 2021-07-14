package one.digitalinnovation.personapi.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty(message = "Name may not be empty")
    @Size(min = 2, max = 50, message = "Please insert a valid number.")
    private String firstName;

    @NotEmpty(message = "Lastname may not be empty")
    @Size(min = 2, max = 100, message = "Please insert a valid number.")
    private String lastName;

    @NotEmpty(message = "Insert a valid cpf")
    @CPF(message = "Insert a valid cpf")
    private String cpf;

    private String birthDate;

    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;

}
