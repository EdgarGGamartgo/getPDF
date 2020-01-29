package guru.springfamework.msscbrewery.web.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class RequestDto {

    private String archivo;
    private String cert;
    private String keyPri;
    private String contra;

}
