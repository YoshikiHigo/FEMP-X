package all;

public class ClonePair5969 {

    float method1(String languageString){
      float result=0f;
      if (languageString != null) {
        languageString=languageString.trim();
        int semicolon=languageString.indexOf(';');
        if (semicolon != -1 && languageString.length() > semicolon + 2) {
          result=Float.parseFloat(languageString.substring(semicolon + 1).trim().substring(2));
        }
     else     result=1.0f;
      }
      return result;
    }

    float method2(String languageString){
      float result=0f;
      if (languageString != null) {
        int semicolumn=languageString.indexOf(';');
        if (semicolumn != -1 && languageString.length() > semicolumn + 2) {
          result=Float.parseFloat(languageString.substring(semicolumn + 3));
        }
     else     result=1.0f;
      }
      return result;
    }
}
