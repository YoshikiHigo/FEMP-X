package all;

public class ClonePair3195 {

    String method1(double d,int places){
      String result=String.valueOf(d);
      int pos=result.indexOf('.');
      if (pos < 0) {
        if (places > 0) {
          result+=".";
          for (int i=0; i < places; i++) {
            result+="0";
          }
        }
      }
     else {
        if (places == 0) {
          result=result.substring(0,pos);
        }
     else     if (pos + places + 1 < result.length()) {
          result=result.substring(0,pos + places + 1);
        }
      }
      return result;
    }

    String method2(double number,int precision){
      String text=Double.toString(number);
      if (precision >= text.length()) {
        return text;
      }
      int start=text.indexOf(".") + 1;
      if (start == 0)   return text;
      if (precision == 0) {
        return text.substring(0,start - 1);
      }
      if (start <= 0) {
        return text;
      }
     else   if ((start + precision) <= text.length()) {
        return text.substring(0,(start + precision));
      }
     else {
        return text;
      }
    }
}
