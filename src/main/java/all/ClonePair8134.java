package all;

public class ClonePair8134 {

    boolean method1(int min,int max,String string){
      int length=string.length();
      if (length < min || length > max) {
        return false;
      }
     else {
        return true;
      }
    }

    boolean method2(int rangoInicial,int rangoFinal,String text){
      if (text.length() >= rangoInicial && text.length() <= rangoFinal) {
        return true;
      }
      return false;
    }
}
