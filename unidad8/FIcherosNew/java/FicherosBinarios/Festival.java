package FicherosBinarios;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@AllArgsConstructor
@Setter

public class Festival implements Serializable {
    private String nombre;
    private transient Date fecha;
    private transient int aforo;
    private String lugar;

}
