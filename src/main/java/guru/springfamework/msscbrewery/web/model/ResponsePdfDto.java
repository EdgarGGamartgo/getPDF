package guru.springfamework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponsePdfDto {
    private String respuesta;
    private String descripcion;
    private String archivoFirmado;
}
