package all;

public class ClonePair11627 {

    String method1(String s,String oldPart,String newPart){
      if ((s == null) || (oldPart == null) || (newPart == null)) {
        return s;
      }
      int i=s.indexOf(oldPart);
      if (i < 0) {
        return s;
      }
      return s.substring(0,i) + newPart + s.substring(i + oldPart.length());
    }

    String method2(String string,String from,String to){
      if (null == string || null == from || null == to) {
        return string;
      }
      if (string.length() == 0 || from.length() == 0) {
        return string;
      }
      StringBuilder sb=new StringBuilder();
      int pos=0;
      int index=string.indexOf(from);
      int patLen=from.length();
      while (index >= 0) {
        sb.append(string.substring(pos,index));
        sb.append(to);
        pos=index + patLen;
        index=string.indexOf(from,pos);
      }
      sb.append(string.substring(pos));
      return sb.toString();
    }
}
