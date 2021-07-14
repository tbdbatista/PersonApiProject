package one.digitalinnovation.personapi.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {


    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty(message = "Name may not be empty")
    @Size(min = 13, max = 14, message = "Please insert a valid number.")
    private String number;

}
