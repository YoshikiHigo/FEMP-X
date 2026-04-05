package unverified;

public class ClonePair3126 {

    double method1(String token){
      int st=0;
      int e1=Math.max(token.indexOf('e'),token.indexOf('E'));
      double d=Double.valueOf(token.substring(st,(e1 < 0 ? token.length() : e1))).doubleValue();
      if (e1 > 0)   d*=Math.pow(10d,Double.valueOf(token.substring(e1 + 1)).doubleValue());
      return d;
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
