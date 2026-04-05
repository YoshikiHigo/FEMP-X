package unverified;

public class ClonePair12862 {

    String method1(String StringIn,int MaxLength){
      if (StringIn == null || StringIn.length() <= MaxLength) {
        return StringIn;
      }
     else {
        return StringIn.substring(0,MaxLength);
      }
    }

    String method2(String source,int slength){
      String result=null;
      if (source != null) {
        if (source.length() > slength) {
          result=source.substring(0,slength);
        }
     else     result=source;
      }
      return result;
    }
}
