package unverified;

public class ClonePair12818 {

    String method1(String[] ss,int idx){
      if (ss.length > idx)   return ss[idx];
     else   return "";
    }

    String method2(String[] values,int index){
      String returnValue="";
      if (values.length > index) {
        returnValue=values[index];
      }
      return returnValue;
    }
}
