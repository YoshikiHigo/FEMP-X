package unverified;

public class ClonePair4859 {

    String method1(String s,int index,int length){
      String returnVal="";
      if (index < s.length()) {
        int RightIndex=index + length;
        if (RightIndex >= s.length()) {
          returnVal=s.substring(index);
        }
     else {
          returnVal=s.substring(index,RightIndex);
        }
      }
      return returnVal;
    }

    String method2(String cad,int start,int length){
      if (cad != null && cad.length() >= start + length)   return (cad.substring(start,start + length));
     else   if (cad.length() > start) {
        return (cad.substring(start,cad.length()));
      }
     else {
        return "";
      }
    }
}
