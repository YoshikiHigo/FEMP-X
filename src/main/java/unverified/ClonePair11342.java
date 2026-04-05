package unverified;

public class ClonePair11342 {

    int method1(String base,String str){
      int result=0, temp=0;
      result=temp=base.indexOf(str);
      while (temp != -1) {
        result=temp;
        temp=base.indexOf(str,result + 1);
      }
      return result;
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
