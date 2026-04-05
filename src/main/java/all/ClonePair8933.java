package all;

public class ClonePair8933 {

    String method1(String data,String name){
      int pos=data.indexOf(name);
      if (pos < 0)   return null;
      int start=data.indexOf('"',pos);
      int end=data.indexOf('"',start + 1);
      if (start >= 0 && end >= 0) {
        return data.substring(start + 1,end);
      }
      return null;
    }

    String method2(String str,String parm){
      int pos=str.indexOf(parm);
      if (pos < 0)   return null;
      str=str.substring(pos);
      pos=str.indexOf("\"");
      if (pos < 0)   return null;
      str=str.substring(pos + 1);
      pos=str.indexOf("\"");
      if (pos < 0)   return null;
      return str.substring(0,pos);
    }
}
