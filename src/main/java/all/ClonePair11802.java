package all;

public class ClonePair11802 {

    String method1(String src,int length){
      if (src.length() <= length) {
        return src;
      }
     else {
        String tmp=src.substring(0,length);
        tmp=tmp + "...";
        return tmp;
      }
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
