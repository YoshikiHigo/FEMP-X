package all;

import java.util.Date;

public class ClonePair12897 {

    boolean method1(Date from,Date to,Date ref){
      if (ref.equals(from)) {
        return true;
      }
     else   if (ref.equals(to)) {
        return true;
      }
     else {
        return from.before(ref) && to.after(ref);
      }
    }

    boolean method2(Date dataInicial,Date dataFinal,Date dataReferencia){
      Boolean set=false;
      if ((dataInicial.equals(dataReferencia) || dataInicial.before(dataReferencia)) && (dataFinal.equals(dataReferencia) || dataReferencia.before(dataFinal))) {
        set=true;
      }
      return set;
    }
}
