package all;

public class ClonePair11628 {

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

    String method2(String str,String match,String to){
      if ((str == null) || (match == null) || (to == null)) {
        return str;
      }
      StringBuffer dest=new StringBuffer();
      int len=match.length();
      String org=str;
      int index=org.indexOf(match);
      while (index != -1) {
        dest.append(org.substring(0,index));
        dest.append(to);
        org=org.substring(index + len);
        index=org.indexOf(match);
      }
      dest.append(org);
      return dest.toString();
    }
}
