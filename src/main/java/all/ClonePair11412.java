package all;

public class ClonePair11412 {

    String method1(String str,int limit){
      if (str.length() <= limit)   return str;
      String s0=str.substring(0,limit);
      s0+="...";
      return s0;
    }

    String method2(String stringToTranslate,int maxLength){
      if (stringToTranslate.length() > maxLength) {
        String shortStringToTranslate=stringToTranslate.substring(0,maxLength);
        String reparedStringToTranslate=shortStringToTranslate.replaceAll("\\W[^\\W]+$","").trim() + "...";
        if (reparedStringToTranslate.length() > 1)     stringToTranslate=reparedStringToTranslate;
     else     stringToTranslate=shortStringToTranslate + "...";
      }
      return stringToTranslate;
    }
}
