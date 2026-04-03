package equivalent;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClonePair9042 {
    int method1(Date dStart, Date dEnd) {
        GregorianCalendar now = new GregorianCalendar();
        now.setTime(dEnd);
        int curYear = now.get(Calendar.YEAR);
        int curMonth = now.get(Calendar.MONTH) + 1;
        int curDay = now.get(Calendar.DAY_OF_MONTH);
        GregorianCalendar birthDate = new GregorianCalendar();
        birthDate.setTime(dStart);
        int birthYear = birthDate.get(Calendar.YEAR);
        int birthMonth = birthDate.get(Calendar.MONTH) + 1;
        int birthDay = birthDate.get(5);
        int ageInYears = curYear - birthYear;
        if (curMonth > birthMonth || curMonth == birthMonth && curDay >= birthDay) {
            ageInYears = curYear - birthYear;
        } else {
            ageInYears = curYear - birthYear - 1;
        }
        return ageInYears;
    }

    int method2(Date FechaInicio, Date FechaFin) {
        int difAnos = 0;
        Calendar calFechaFin = Calendar.getInstance();
        Calendar calFechaInicio = Calendar.getInstance();
        calFechaFin.setTime(FechaFin);
        calFechaInicio.setTime(FechaInicio);
        int anosInicio = calFechaInicio.get(Calendar.YEAR);
        int anosFin = calFechaFin.get(Calendar.YEAR);
        difAnos = anosFin - anosInicio;
        int mesInicio = calFechaInicio.get(Calendar.MONTH);
        int mesFin = calFechaFin.get(Calendar.MONTH);
        int difMeses = mesFin - mesInicio;
        int diaInicio = calFechaInicio.get(Calendar.DATE);
        int diaFin = calFechaFin.get(Calendar.DATE);
        int difDias = diaFin - diaInicio;
        if ((difMeses < 0) || (difMeses == 0 && difDias < 0)) {
            difAnos--;
        }
        return difAnos;
    }
}
