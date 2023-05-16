package org.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainList {
    private List<Train> trains = new ArrayList<>();
    private int size=0;
    public List<Train> getTrains(){return trains;}
    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}
    public void setTrainList(List<Train> train1) {
        trains=train1;
    }
    public void addTrain(Train train){
        trains.add(train);
    }
    public void deleteTrainID(int id) {
       trains.removeIf(e -> (e.getId() == id));
    }
    public ArrayList<Train> sortShippingTime(String destination){
        ArrayList<Train> destinationList= new ArrayList<>();
        for (Train train:trains){
            if (train!=null){
                if (train.getDestination().equals(destination)){
                    destinationList.add(train);
                }
            }
        }
        destinationList.sort(Comparator.comparing(Train::getShippingTime).thenComparing(Train::getTrainNumber));
        return destinationList;
    }
    public List<Train> printTrainDestinAndTime(List<Train> trains, String destination1, LocalTime time) {
        ArrayList<Train> trains1 = new ArrayList<>();
        for (Train train : trains) {
            if(train==null)continue;
            if(train.getDestination().equals(destination1)){System.out.println(train);}
             if (train.getShippingTime().isAfter(time)){System.out.println(train);}
                trains1.add(train);
        }
        return trains1;
    }

    public List<Train> printTrainDestinAndNumSeats( String destination2, int numberoOfsets) {
        ArrayList<Train> trains2=new ArrayList<>();
        for (Train train:trains){
            if(train==null)continue;
            if (train.getDestination().equals(destination2)){System.out.println(train);}
            if (train.getNumberOfSeats()<= numberoOfsets){System.out.println(train);}
        }
        return trains2;
    }
    public List<Train> sortCommonSeats(String destination){
        ArrayList<Train> destinationList= new ArrayList<>();
        for (Train train:trains){
            if (train!=null){
                if (train.getDestination().equals(destination)){
                    destinationList.add(train);
                }
            }
        }
       destinationList.sort(Comparator.comparing(Train::getNumberOfSeats));
        return destinationList;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(trains).append(",\n");
        }
        return sb.toString();
    }
}

