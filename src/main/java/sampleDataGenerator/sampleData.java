package sampleDataGenerator;

import java.util.List;

public interface sampleData<T> {

    //gets list of desired size of sample data
    List<T> getList(int size);

}
