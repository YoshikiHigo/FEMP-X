package all;

public class ClonePair13258 {

    int method1(String si){
      if (si == null || si.length() == 0) {
        return 0;
      }
     else {
        return Integer.parseInt(si,10);
      }
    }

    int method2(String text){
      if (text == null || text.equals("")) {
        System.out.println("Wert 0:" + text);
        return 0;
      }
     else {
        System.out.println("Wert text:" + text);
        return Integer.parseInt(text);
      }
    }
}
