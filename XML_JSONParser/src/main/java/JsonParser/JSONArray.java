package JsonParser;

import java.util.ArrayList;
import java.util.Collections;

public class JSONArray {
    private  final static char specialChar;
    private final static char commaChar;
    private ArrayList <String> objects;

    static {
        specialChar = String.valueOf(Consts.SPECIAL).toCharArray()[0];
        commaChar = String.valueOf(Consts.COMMA).toCharArray()[0];
    }

    public JSONArray (String arg) {
        getJSONObjects(arg);
    }
    public void getJSONObjects (String arg) {
        objects = new ArrayList<String>();

        if (arg.startsWith(String.valueOf(
                Consts.SQUARE_OPEN_BRACKETS))
                && arg.endsWith(String.valueOf(
                Consts.SQUARE_CLOSE_BRACKETS))) {

            StringBuilder builder = new StringBuilder(arg);

            builder.deleteCharAt(0);
            builder.deleteCharAt(builder.length() - 1);

            builder = replaceCOMMA(builder);

            Collections.addAll(
                    objects,
                    builder.toString().split(
                            String.valueOf(Consts.COMMA)));
        }
    }

    private StringBuilder replaceCOMMA(StringBuilder arg) {
        boolean isArray = false;

        for (int i = 0; i < arg.length(); i++) {
            char a = arg.charAt(i);
            if (isArray) {

                if (String.valueOf(a).compareTo(
                        String.valueOf(Consts.COMMA))
                        == 0) {
                    arg.setCharAt(i, specialChar);
                }
            }

            if (String.valueOf(a).compareTo(String.valueOf(
                    Consts.CURLY_OPEN_BRACKETS))
                    == 0)
                isArray = true;

            if (String.valueOf(a).compareTo(String.valueOf(
                    Consts.CURLY_CLOSE_BRACKETS))
                    == 0)
                isArray = false;
        }

        return arg;
    }

    public String getObject (int index) {
        if (objects != null) {
            return objects.get(index).replace(specialChar, commaChar);
        }
        return null;
    }
    public JSONObj getJSONObject (int index) {
        if (objects != null) {
            return new JSONObj(objects.get(index).replace('|', ','));
        }
        return null;
    }
}