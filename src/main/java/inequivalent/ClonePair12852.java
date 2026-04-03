package inequivalent;

public class ClonePair12852 {

    String method1(String StringIn, int MaxLength) {
        if (StringIn == null || StringIn.length() <= MaxLength) {
            return StringIn;
        } else {
            return StringIn.substring(0, MaxLength);
        }
    }

    String method2(String data, int length) {
        if (data != null) {
            if (data.length() <= length) {
                return data.replace('"', ' ').trim();
            } else {
                return data.substring(0, length).replace('"', ' ').trim();
            }
        } else {
            return null;
        }
    }
}
