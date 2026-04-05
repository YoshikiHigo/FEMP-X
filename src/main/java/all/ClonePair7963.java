package all;

import java.util.*;

public class ClonePair7963 {

    Vector method1(String value,String delimitatore){
      Vector ris=new Vector();
      String strAppoggio=value;
      int index=0;
      String strSottoStringa="";
      if ((value != null) && (!value.equals(""))) {
        while (index >= 0) {
          index=strAppoggio.indexOf(delimitatore);
          if (index < 0) {
            strSottoStringa=strAppoggio;
          }
     else {
            strSottoStringa=strAppoggio.substring(0,index);
            strAppoggio=strAppoggio.substring(index + 1,strAppoggio.length());
          }
          if (!(strSottoStringa.trim()).equals("")) {
            ris.add(strSottoStringa);
          }
        }
      }
      return ris;
    }

    Vector method2(String value,String delimitatore){
      Vector ris=new Vector();
      String strAppoggio=value;
      int index=0;
      String strSottoStringa="";
      if ((value != null) && (!value.equals(""))) {
        while (index >= 0) {
          index=strAppoggio.indexOf(delimitatore);
          if (index < 0) {
            strSottoStringa=strAppoggio;
          }
     else {
            strSottoStringa=strAppoggio.substring(0,index);
            strAppoggio=strAppoggio.substring(index + 1,strAppoggio.length());
          }
          ris.add(strSottoStringa);
        }
      }
      return ris;
    }
}
