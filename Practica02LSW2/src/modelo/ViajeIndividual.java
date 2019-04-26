package modelo;
import java.util.Date;

/**
 * Integrantes:   Hurtado Pedraza Gisel
 *                Inagan Pinchao Leyder
 */
public class ViajeIndividual extends Viaje {
    
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) 
    {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
    
    // Constructor
    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }

    //No se sobreescribe cualquierMetodo2()  
}