package all;

public class ClonePair11861 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String originalString,int size){
      if (originalString.length() <= size) {
        return originalString;
      }
      String vowels="AaEeIiOoUu";
      StringBuffer newStringBufferTmp=new StringBuffer(originalString.length());
      int counter=originalString.length() - size;
      for (int index=(originalString.length() - 1); index >= 0; index--) {
        if (vowels.indexOf(originalString.charAt(index)) == -1) {
          newStringBufferTmp.append(originalString.charAt(index));
        }
     else {
          counter--;
          if (counter == 0) {
            StringBuffer newStringBuffer=new StringBuffer(size);
            newStringBuffer.append(originalString.substring(0,index));
            newStringBuffer.append(newStringBufferTmp.reverse().toString());
            return newStringBuffer.toString();
          }
        }
      }
      return newStringBufferTmp.reverse().toString().substring(0,size);
    }
}
