package all;

public class ClonePair11249 {

    int method1(String text,String match){
      int lastIndex=-1;
      int index=text.indexOf(match);
      while (index != -1) {
        lastIndex=index;
        index=text.indexOf(match,lastIndex + 1);
      }
      return lastIndex;
    }

    int method2(String base,String str){
      int result=0, temp=0;
      result=temp=base.indexOf(str);
      while (temp != -1) {
        result=temp;
        temp=base.indexOf(str,result + 1);
      }
      return result;
    }
}
