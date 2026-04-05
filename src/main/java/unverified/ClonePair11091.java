package unverified;

public class ClonePair11091 {

    String method1(String str,String oldVal,String newVal){
      String res=str;
      if (str.length() > 0) {
        int pos=str.indexOf(oldVal);
        if (pos >= 0) {
          res=str.substring(0,pos);
          res=res.concat(newVal);
          res=res.concat(str.substring(pos + oldVal.length()));
          return res;
        }
      }
      return res;
    }

    String method2(String text,String find,String replace){
      int findLength=find.length();
      StringBuffer buffer=new StringBuffer();
      int i;
      for (i=0; i < text.length() - find.length() + 1; i++) {
        String substring=text.substring(i,i + findLength);
        if (substring.equals(find)) {
          buffer.append(replace);
          i+=find.length() - 1;
        }
     else {
          buffer.append(text.charAt(i));
        }
      }
      buffer.append(text.substring(text.length() - (text.length() - i)));
      return buffer.toString();
    }
}
