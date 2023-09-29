package hexlet.code.dto;

import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskStatusDTO {
    
    @NotBlank(message = "Status name cannot be blank")
    private String name;
    
}
