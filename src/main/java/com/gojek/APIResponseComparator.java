package com.gojek;

public class APIResponseComparator implements ResponseComparator {

    @Override
    public boolean compare(String json1, String json2) {
        boolean compareAnswer = false;

        if(json1.equals(json2))
            compareAnswer = true;

        return compareAnswer;
    }
}
