package unverified;

public class ClonePair11250 {

    int method1(String text,String match){
      int lastIndex=-1;
      int index=text.indexOf(match);
      while (index != -1) {
        lastIndex=index;
        index=text.indexOf(match,lastIndex + 1);
      }
      return lastIndex;
    }

    int method2(String dans,String cherche){
      int lastTrouve=-1;
      int trouve=-1;
      while ((trouve=dans.indexOf(cherche,trouve + 1)) != -1) {
        lastTrouve=trouve;
      }
      return lastTrouve;
    }
}
