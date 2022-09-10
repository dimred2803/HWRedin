package JsonParser;

import JsonParser.Consts;

import java.util.HashMap;

class JSONObj {
    private final static char specialChar;
    private final static char commaChar;
    private HashMap<String, String> objects;

    static
    {
        specialChar = String.valueOf(Consts.SPECIAL).toCharArray()[0];
        commaChar = String.valueOf(Consts.COMMA).toCharArray()[0];
    }
    public JSONObj (String arg) {
        getJSONObj(arg);
    }

    public void getJSONObj (String arg) {
        objects = new HashMap<String, String> ();
        if (arg.startsWith(String.valueOf(Consts.CURLY_OPEN_BRACKETS))&&
                arg.endsWith(String.valueOf(Consts.CURLY_CLOSE_BRACKETS))) {
            StringBuilder builder = new StringBuilder(arg);
            builder.deleteCharAt(0);
            builder.deleteCharAt(builder.length()-1);
            builder = replaceCOMMA(builder);

            for (String objects : builder.toString().split(String.valueOf(Consts.COMMA))){
                String[] objectValue = objects.split(String.valueOf(Consts.COLON), 2);
                if (objectValue.length == 2)
                    this.objects.put(
                            objectValue[0].replace("'","")
                                    .replace("\"", ""),
                            objectValue[1].replace("'", "")
                                    .replace("\"", ""));
            }
        }
    }

    public StringBuilder replaceCOMMA (StringBuilder arg){
        boolean isJsonArray = false;
        for (int i = 0;i<arg.length();i++) {
            char a = arg.charAt(i);
            if (isJsonArray) {
                if (String.valueOf(a).compareTo(String.valueOf(Consts.COMMA))==0) {
                    arg.setCharAt(i, specialChar);
                }
            }
            if (String.valueOf(a).compareTo(String.valueOf(Consts.SQUARE_OPEN_BRACKETS))==0)
                isJsonArray = true;
            if (String.valueOf(a).compareTo(String.valueOf(Consts.SQUARE_CLOSE_BRACKETS))==0)
                isJsonArray = false;
        }
        return arg;
    }

    public String getValue (String key) {
        if (objects != null) {
            return objects.get(key).replace(specialChar, commaChar);
        }
        return  null;
    }

    public  JSONArray getJSONArray (String key) {
        if (objects != null)
            return new JSONArray(objects.get(key).replace('|', ','));
        return null;
    }

}