package all;

public class ClonePair4860 {

    String method1(String w,int length,int index){
      if (w.length() < length)   return w;
     else {
        String newValue=w.substring(w.length() - length,w.length());
        return newValue;
      }
    }

    String method2(String w,int length,int index){
      if (w.length() < length)   return w;
     else {
        return w.substring(0,length);
      }
    }
}
