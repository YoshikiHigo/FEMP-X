package unverified;

public class ClonePair11323 {

    String method1(String s,int places){
      int j=places - s.length();
      if (j > 0) {
        StringBuffer sb=null;
        sb=new StringBuffer(j);
        for (int k=0; k < j; k++) {
          sb.append(' ');
        }
        return sb.toString() + s;
      }
     else {
        return s;
      }
    }

    String method2(String value,int width){
      String result=value;
      if (value.length() < width) {
        StringBuffer sb=new StringBuffer();
        for (int idx=value.length() - 1; idx >= 0; idx--) {
          sb.append(value.charAt(idx));
        }
        for (int idx=0; idx < width - value.length(); idx++) {
          sb.append(' ');
        }
        sb=sb.reverse();
        result=sb.toString();
      }
      return result;
    }
}
