package com.dacelonid.reverseorrotate;

class RevRot {

    static String revRot(String strng, int sz) {
        if(strng == null || strng.length() == 0 || strng.length() == sz || sz == 0)
            return "";
        int index = 0;
        StringBuilder result = new StringBuilder();
        while(index <= strng.length()-sz){
            String temp = strng.substring(index, index + sz);
            if(evenSum(temp)){
                result.append(new StringBuilder(temp).reverse().toString());
            }else {
                result.append(new StringBuilder(temp).delete(0, 1).append(temp.substring(0, 1)).toString());
            }
            index += sz;
        }

        return result.toString();
    }

    private static boolean evenSum(final String temp) {
        int sum = 0;
        for(char t :temp.toCharArray()){
            sum += Integer.parseInt(String.valueOf(t));
        }
        return sum % 2 == 0;
    }

}