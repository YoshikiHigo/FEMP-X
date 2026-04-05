package unverified;

public class ClonePair11327 {

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

    String method2(String f1,int f1size){
      int pad=f1size - f1.length();
      if (pad < 0)   pad=0;
      String result="";
      for (int i=0; i < pad; i++)   result+=" ";
      return (f1 + result);
    }
}
