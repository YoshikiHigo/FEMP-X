package all;

public class ClonePair4923 {

    int method1(String str1,String str2,String motif){
      int num=0;
      int i=0;
      while (str1.indexOf(motif,i) != -1) {
        i=str1.indexOf(motif,i);
        if (str2.substring(i,i + motif.length()).equals(motif)) {
          num++;
        }
        i++;
      }
      return num;
    }

    int method2(String seq1,String seq2,String motif){
      int count=0;
      int ii=-1;
      while (seq1.indexOf(motif,ii) != -1) {
        ii=seq1.indexOf(motif,ii);
        if (seq2.substring(ii,ii + motif.length()).equals(motif)) {
          count++;
        }
        ii++;
      }
      return count;
    }
}
