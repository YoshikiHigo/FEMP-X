package unverified;

public class ClonePair38348 {

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

    String method2(String value,int length){
      String zero="";
      if (!value.equals("") && value.length() < length)   for (int i=0; i < (length - value.length()); i++) {
        zero+="0";
      }
      return zero + value;
    }
}
