package all;

public class ClonePair11539 {

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

    String method2(int number){
      String res=Integer.toString(number);
      if (res.endsWith("1")) {
        return (res.endsWith("11")) ? res + "th" : res + "st";
      }
     else   if (res.endsWith("2")) {
        return (res.endsWith("12")) ? res + "th" : res + "nd";
      }
     else   if (res.endsWith("3")) {
        return (res.endsWith("13")) ? res + "th" : res + "rd";
      }
     else {
        return res + "th";
      }
    }
}
