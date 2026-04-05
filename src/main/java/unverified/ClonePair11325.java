package unverified;

public class ClonePair11325 {

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

    String method2(String str,int size){
      String newstr=new String(str);
      int numfill=size - str.length();
      if (numfill > 0) {
        for (int cnt=0; cnt < numfill; cnt++) {
          newstr+=" ";
        }
      }
      return newstr;
    }
}
