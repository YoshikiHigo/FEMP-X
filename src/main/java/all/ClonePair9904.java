package all;

public class ClonePair9904 {

    String[] method1(String[] a,int pos){
      if (pos < 0 || pos >= a.length)   return a;
      String[] aa=new String[a.length - 1];
      if (pos > 0)   System.arraycopy(a,0,aa,0,pos);
      if (pos < a.length - 1)   System.arraycopy(a,pos + 1,aa,pos,aa.length - pos);
      return aa;
    }

    String[] method2(String[] src,int index){
      if (index < 0 || index >= src.length)   return src;
      String[] newArr=new String[src.length - 1];
      int minus=0;
      for (int i=0; i < src.length; i++) {
        if (i == index)     minus=1;
     else     newArr[i - minus]=src[i];
      }
      return newArr;
    }
}
