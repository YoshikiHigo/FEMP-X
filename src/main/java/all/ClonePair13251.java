package all;

public class ClonePair13251 {

    String method1(String lv,String rv){
      if (lv != null && rv != null) {
        do {
          int ix=lv.indexOf(rv);
          if (ix >= 0) {
            int len=lv.length();
            lv=lv.substring(0,ix) + lv.substring(ix + rv.length(),len);
          }
     else       break;
        }
     while (true);
      }
      return lv;
    }

    String method2(String _fileName,String _dirPrefix){
      if (_fileName == null) {
        return _fileName;
      }
      if (_dirPrefix == null) {
        return _fileName;
      }
      if (_fileName.startsWith(_dirPrefix)) {
        _fileName=_fileName.substring(_dirPrefix.length());
      }
      if (_fileName.startsWith("/")) {
        _fileName=_fileName.substring(1);
      }
      return _fileName;
    }
}
