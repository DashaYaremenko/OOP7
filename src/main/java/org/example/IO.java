package org.example;

import java.util.List;
import java.util.Map;

public interface IO {
    public List<Train> readObject(String filePath);
    public void writeObject(TrainList trains,String filePath);
    public void writeObjectJSON(TrainList trains,String filePath);

    public List<Train> readObjectJSON(String filePath) ;
}
