package com.example.grocery;

public class LoginUtils {
    /**
     * This method checks if provided string represents a valid email address and return true if it is.
     * @param email
     * @return
     */

    public boolean isValidEamilAddress(String email){
        boolean hashAtSign = email.indexOf("@") > -1;

        return  hashAtSign;
    }

    /**
     * This method returns the length of the local part email address,
     * which is the part that comes before "@" in the address
     * @param email
     * @return
     */
    public int getLocalPartLength(String email){
        int start = email.indexOf("@");
        String localPart = email.substring(0, start);
        return localPart.length();
    }

    /**
     * This method check whether the email and passwords are null or empty
     * @param email
     * @param pass
     * @return
     */
    public boolean checkEmailPass(String email, String pass){
        return (email != "null" && email!="" && pass != "null" && pass !="");
    }

    /**
     * This method checks the length of the password
     * @param pass
     * @return
     */
    public boolean checkPass(String pass){
        return pass.length() >= 6;
    }

    /**
     * This is used to check the valid promo code test
     * @param pCode
     * @param pDesc
     * @param pPrice
     * @param oPrice
     * @return
     */
    public boolean promoValidate(String pCode, String pDesc, String pPrice, String oPrice){
        return  pCode !="null" && pDesc !="null" && pPrice !="0.0" && oPrice != "0.0";
    }

    /**
     * This is used to check the length of the promo code for the security or strength of the promotion code
     * @param pcode
     * @return
     */
    public boolean pCodeLengthCheck(String pcode){
        return pcode.length() >= 6;
    }

    public boolean promoPriceCompare(Double pPrice, Double oPrice){
        return pPrice<oPrice;
    }


}
