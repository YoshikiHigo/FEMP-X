package all;

import java.util.Date;

public class ClonePair12913 {

    boolean method1(Date ponto,Date inicio,Date fim){
      if (inicio.compareTo(ponto) <= 0 && fim.compareTo(ponto) >= 0) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(Date fecha,Date FechaInicio,Date fechaFin){
      if ((FechaInicio.before(fecha) || FechaInicio.equals(fecha)) && (fechaFin.after(fecha) || fechaFin.equals(fecha)))   return true;
     else   return false;
    }
}
