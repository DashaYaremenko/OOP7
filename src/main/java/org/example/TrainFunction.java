package org.example;

import java.util.List;
import java.util.Scanner;

public interface TrainFunction {
    void printSortShippingTime(TrainList trains, Scanner scanner);
    void printDestinAndTime(TrainList trains,Scanner scanner);
    void printDestinAndCommonSeats(TrainList trains,Scanner scanner);
    void addTrain(TrainList trains, Scanner scanner);
    void printDestinAndNumSeats(TrainList trains, Scanner scanner);
    void deleteTrainID(TrainList trains, Scanner scanner);
    void printTrainList(List<Train> trains);
    void createTrainArr(TrainList trains);
}
