package com.gojek;

import com.gojek.InputData;
import org.apache.commons.io.FilenameUtils;

public class FileInputData implements InputData {

    private final String fileNameOne;
    private final String fileNameTwo;

    public FileInputData(String firstFileName, String secondFileName) {
        this.fileNameOne = firstFileName;
        this.fileNameTwo = secondFileName;
    }

    @Override
    public void processInput() {

    }

    @Override
    public boolean isValidInput() {
        boolean result = false;

        // Check filename extensions
        String file1ext = FilenameUtils.getExtension(this.fileNameOne);
        String file2ext = FilenameUtils.getExtension(this.fileNameTwo);

        if (file1ext.equals("txt") && file2ext.equals("txt"))
            result = true;

        return result;
    }
}
