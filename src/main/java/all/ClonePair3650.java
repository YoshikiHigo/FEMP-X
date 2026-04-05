package all;

public class ClonePair3650 {

    int method1(Object o1,Object o2){
      if ((o1 instanceof Comparable) && (o2 instanceof Comparable)) {
        return ((Comparable)o1).compareTo(o2);
      }
      return 0;
    }

    int method2(Object opra,Object oprb){
      if (opra instanceof String && oprb instanceof String) {
        String a=(String)opra;
        String b=(String)oprb;
        a=a.toLowerCase();
        b=b.toLowerCase();
        return a.compareTo(b);
      }
      if (opra instanceof Integer && oprb instanceof Integer) {
        Integer a=(Integer)opra;
        Integer b=(Integer)oprb;
        return a.compareTo(b);
      }
      if (opra instanceof Boolean && oprb instanceof Boolean) {
        Boolean a=(Boolean)opra;
        Boolean b=(Boolean)oprb;
        return a.compareTo(b);
      }
      if (opra instanceof Comparable && oprb instanceof Comparable) {
        Comparable a=(Comparable)opra;
        Comparable b=(Comparable)oprb;
        return a.compareTo(b);
      }
      return 0;
    }
}
