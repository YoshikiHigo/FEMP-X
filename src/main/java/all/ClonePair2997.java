package all;

public class ClonePair2997 {

    double method1(String valueString){
      if (valueString.contains(",")) {
        valueString=valueString.replace(',','.');
      }
      return Double.parseDouble(valueString);
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
