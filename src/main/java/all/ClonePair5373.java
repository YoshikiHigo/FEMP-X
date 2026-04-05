package all;

public class ClonePair5373 {

    int method1(String str,String charSet,int fromIdx){
      int i;
      for (i=fromIdx; i < str.length(); i++)   if (charSet.indexOf(str.charAt(i)) != -1)   break;
      return i - fromIdx;
    }

    int method2(String str,String charSet,int fromIdx){
      int i;
      for (i=fromIdx; i < str.length(); ++i)   if (charSet.indexOf(str.charAt(i)) != -1)   break;
      return i - fromIdx;
    }
}
