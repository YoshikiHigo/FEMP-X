package all;

public class ClonePair3123 {

    double method1(String str){
      try {
        return Double.parseDouble(str);
      }
     catch (  Exception e) {
      }
      String sdeg=null;
      String smin=null;
      String ssec=null;
      int asterisk=str.indexOf('*');
      if (asterisk < 0) {
        sdeg=str;
      }
     else {
        sdeg=str.substring(0,asterisk);
        String srest=str.substring(asterisk + 1);
        int pound=srest.indexOf('#');
        if (pound < 0) {
          smin=srest;
        }
     else {
          smin=srest.substring(0,pound);
          ssec=srest.substring(pound + 1);
        }
      }
      double deg=Double.parseDouble(sdeg);
      double min=Double.parseDouble(smin);
      double sec=Double.parseDouble(ssec);
      return deg + (min / 60) + (sec / 3600);
    }

    double method2(String instr){
      String s_tmp="";
      for (int i=0; i <= instr.length() - 1; i++) {
        if (instr.charAt(i) != ' ') {
          s_tmp=s_tmp + instr.charAt(i);
        }
        ;
      }
      Double Object_Of_Double=Double.valueOf(instr);
      double x=Object_Of_Double.doubleValue();
      return x;
    }
}
