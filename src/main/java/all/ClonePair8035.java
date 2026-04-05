package all;

public class ClonePair8035 {

    int method1(String[] supported,String expertise){
      if (supported == null)   return 0;
      if (expertise == null)   return -1;
      for (int i=0; i < supported.length; i++)   if (supported[i].toUpperCase().endsWith(expertise.toUpperCase()))   return i;
      return -1;
    }

    int method2(String[] supported,String expertise){
      if (supported == null)   return 0;
      if (expertise == null)   return -1;
      for (int i=0; i < supported.length; i++)   if (supported[i].toUpperCase().startsWith(expertise.toUpperCase()))   return i;
      return -1;
    }
}
