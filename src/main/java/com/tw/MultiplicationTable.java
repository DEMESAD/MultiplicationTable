package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {

        int result = start * end;
        if (start != end) {
            return null;
        }else
            return start + "*" + end + "=" + result;
    }
    public Boolean isValid(int start, int end) {
        return (start >= 4 && end <= 100)? true:false;
    }
    public Boolean isInRange(int number) {
        return null;

    }
    public Boolean isStartNotBiggerThanEnd(int start, int end) {

        return null;
    }

    public String generateTable(int start, int end) {
        return null;
    }

    public String generateLine(int start, int row) {
        return null;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return null;
    }
}
