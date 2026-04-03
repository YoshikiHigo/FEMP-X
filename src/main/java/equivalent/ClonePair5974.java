package equivalent;

public class ClonePair5974 {
    float method1(String _data) {
        try {
            if (_data == null || _data.length() <= 0) return 0;
            return Float.parseFloat(_data);
        } catch (Exception err) {
            return 0;
        }
    }

    float method2(String str) {
        String loghead = "TypeConver:str2float:";
        float ret = 0;
        try {
            boolean flag = (null == str);
            flag = flag || (str.trim().length() < 1);
            if (flag) {
                ret = 0;
            } else {
                ret = Float.parseFloat(str);
            }
        } catch (NumberFormatException e) {
            ret = 0;
        }
        return ret;
    }
}
