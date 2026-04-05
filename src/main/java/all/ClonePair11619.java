package all;

public class ClonePair11619 {

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

    String method2(String data,String oldS,String newS){
      if (data == null)   return null;
      if (oldS == null || newS == null)   return data;
      StringBuffer buf=new StringBuffer(data.length());
      int pos=-1;
      int i=0;
      while ((pos=data.indexOf(oldS,i)) != -1) {
        buf.append(data.substring(i,pos)).append(newS);
        i=pos + oldS.length();
      }
      buf.append(data.substring(i));
      return buf.toString();
    }
}
