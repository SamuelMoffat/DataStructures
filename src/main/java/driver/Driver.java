package driver;

import sampleDataGenerator.sampleData;

import java.io.File;
import java.util.List;

public class Driver {

    public void start(File path) {

    }

    private void createData(sampleData<?> dataGenerator){
        int sampleSize = 20;
        List<?> sampleData = dataGenerator.getList(sampleSize);
    }
}
