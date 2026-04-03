package equivalent;

import java.util.Date;

public class ClonePair12913 {
    boolean method1(Date ponto, Date inicio, Date fim) {
        return inicio.compareTo(ponto) <= 0 && fim.compareTo(ponto) >= 0;
    }

    boolean method2(Date fecha, Date FechaInicio, Date fechaFin) {
        return (FechaInicio.before(fecha) || FechaInicio.equals(fecha)) && (fechaFin.after(fecha) || fechaFin.equals(fecha));
    }
}
