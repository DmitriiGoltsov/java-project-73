package hexlet.code.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginDTO {

    @Email(message = "Invalid email")
    @NotBlank(message = "Email/username cannot be blank")
    private String email;
    @NotBlank(message = "Password cannot be blank")
    @Size(min = 5, max = 35, message = "Password has to contain from 5 to 35 characters!")
    private String password;

}
