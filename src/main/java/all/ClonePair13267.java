package all;

public class ClonePair13267 {

    int method1(String si){
      if (si == null || si.length() == 0) {
        return 0;
      }
     else {
        return Integer.parseInt(si,10);
      }
    }

    int method2(String number){
      if (number == null || number.equals("")) {
        return 0;
      }
      return Integer.parseInt(number.trim());
    }
}
