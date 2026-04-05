package unverified;

public class ClonePair2822 {

    double method1(String x){
      if (x.length() <= 1 || !x.contains(",")) {
        return Double.parseDouble(x);
      }
     else {
        return Double.parseDouble(x.replace(",","."));
      }
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
