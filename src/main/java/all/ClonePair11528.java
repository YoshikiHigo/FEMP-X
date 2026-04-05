package all;

public class ClonePair11528 {

    String method1(int n){
      StringBuffer s=new StringBuffer(String.valueOf(n));
      if (s.length() > 1) {
        if (s.charAt(s.length() - 2) == '1') {
          s.append("th");
          return s.toString();
        }
      }
      char last=s.charAt(s.length() - 1);
    switch (last) {
    case '1':    s.append("st");
      break;
    case '2':s.append("nd");
    break;
    case '3':s.append("rd");
    break;
    default:s.append("th");
    }
    return s.toString();
    }

    String method2(int val){
      String valStr=String.valueOf(val);
      if (valStr.endsWith("1") && !valStr.endsWith("11")) {
        return valStr + "st";
      }
      if (valStr.endsWith("2") && !valStr.endsWith("12")) {
        return valStr + "nd";
      }
      if (valStr.endsWith("3") && !valStr.endsWith("13")) {
        return valStr + "rd";
      }
      return valStr + "th";
    }
}
