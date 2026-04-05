package all;

public class ClonePair8176 {

    int method1(String s,int i,int ai[]){
      int j=0;
      int k=i;
      for (int l=s.length(); j < l; ) {
        int i1=s.charAt(j++);
        int j1=s.charAt(j++);
        j1--;
        do     ai[k++]=j1;
     while (--i1 > 0);
      }
      return k;
    }

    int method2(String s,int i,int ai[]){
      int j=0;
      int k=i;
      for (int l=s.length(); j < l; ) {
        int i1=s.charAt(j++);
        char c=s.charAt(j++);
        do     ai[k++]=c;
     while (--i1 > 0);
      }
      return k;
    }
}
