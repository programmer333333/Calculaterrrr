class Roman {
    static String[] romanArray = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
            "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV","XLV" ,"XLVI", "XLVII", "XLVIII", "XLIX", "L"};
    public  static boolean isRoman(String val) {
        for (int i = 0; i < romanArray.length; i++){
            if(val.equals(romanArray[i])){return true;}
        }
        return false;
    }
    public static int convertToArabian(String roman) {
        for (int i = 0; i < romanArray.length; i++) {
            if (roman.equals(romanArray[i])) {
                return i;}
        }
        return -1;
    }
    public static String convertToRoman(int arabian) {
       if (arabian > 0){return romanArray[arabian];}
       else {return null;}
    }
}
