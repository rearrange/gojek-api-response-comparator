package com.gojek;

import java.io.IOException;
import java.util.HashMap;

public interface HTTPClientGET {
    StringBuilder fireGETRequest(String url) throws IOException;
    String returnContentType();
    Integer returnHTTPStatus();

    HashMap<String, String> responseContent = new HashMap<>();
}
