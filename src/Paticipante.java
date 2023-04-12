import java.util.ArrayList;
import java.util.List;

public class Paticipante {

  private  String nombre;
   private int puntos;
  private  List<Pronostico> pronosticoParticipante;

    public Paticipante(String nombre) {
        this.nombre = nombre;
         pronosticoParticipante = new ArrayList<>();
    }
}
