package com.testehan.effective.chpt3MethodsCommonToObjects.item12;

public final class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix   = prefix;
        this.lineNum  = lineNum;
    }

    /**
     * Returns the string representation of this phone number.
     * The string consists of twelve characters whose format is
     * "XXX-YYY-ZZZZ", where XXX is the area code, YYY is the
     * prefix, and ZZZZ is the line number. Each of the capital
     * letters represents a single decimal digit.
     *
     * If any of the three parts of this phone number is too small
     * to fill up its field, the field is padded with leading zeros.
     * For example, if the value of the line number is 123, the last
     * four characters of the string representation will be "0123".
     */
    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d",areaCode, prefix, lineNum);
    }

    public static void main(String[] args) {
        PhoneNumber jenny = new PhoneNumber((short)707, (short)867, (short)5309);
        System.out.println("Jenny's number: " + jenny);
    }
}
