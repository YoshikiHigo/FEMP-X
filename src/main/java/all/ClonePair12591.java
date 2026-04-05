package all;

public class ClonePair12591 {

    boolean method1(int start,int end,int increment){
      if (increment == 0) {
        return false;
      }
      if (increment > 0 && start > end) {
        return false;
      }
      if (increment < 0 && start < end) {
        return false;
      }
      return true;
    }

    boolean method2(int start,int stop,int schritt){
      if (start < stop && schritt < 1) {
        System.err.println("FEHLER: ForLoop: start < stop und schritt < 1");
        System.err.println("FEHLER: start = " + start + ", stop = "+ stop+ ", schritt = "+ schritt);
        return false;
      }
      if (start > stop && schritt > -1) {
        System.err.println("FEHLER: ForLoop: start > stop und schritt > -1");
        System.err.println("FEHLER: start = " + start + ", stop = "+ stop+ ", schritt = "+ schritt);
        return false;
      }
      return true;
    }
}
