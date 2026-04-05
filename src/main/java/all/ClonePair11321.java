package all;

public class ClonePair11321 {

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

    String method2(String text,int size){
      int numSpaces=size - text.length();
      if (numSpaces <= 0)   return text;
      StringBuffer buf=new StringBuffer(size);
      for (int i=0; i < numSpaces; i++)   buf.append(' ');
      for (int i=numSpaces; i < size; i++)   buf.append(text.charAt(i - numSpaces));
      return buf.toString();
    }
}
