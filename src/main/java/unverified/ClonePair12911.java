package unverified;

import java.util.Date;

public class ClonePair12911 {

    boolean method1(Date dataInicial,Date dataFinal,Date dataReferencia){
      Boolean set=false;
      if ((dataInicial.equals(dataReferencia) || dataInicial.before(dataReferencia)) && (dataFinal.equals(dataReferencia) || dataReferencia.before(dataFinal))) {
        set=true;
      }
      return set;
    }

    boolean method2(Date start,Date end,Date between){
      final long min=start.getTime();
      final long max=end.getTime();
      final long index=between.getTime();
      if ((min <= index) && (index <= max)) {
        return true;
      }
     else {
        return false;
      }
    }
}
