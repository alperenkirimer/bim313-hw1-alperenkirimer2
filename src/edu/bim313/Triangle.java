package edu.bim313;

import java.util.List;

import static edu.bim313.TurkishNetwork.cities;
import static edu.bim313.TurkishNetwork.distance;

public class Triangle {
    int c1, c2, c3;

    public Triangle(List<Integer> list) {
        if(list.size()!=3){
            throw new IllegalArgumentException("Not 3 vertices?");
        }

        c1= list.get(0);
        c2= list.get(1);
        c3= list.get(2);
    }

    @Override
    public String toString() {


        return  cities[c1]+ " " +cities[c2]+" "+cities[c3];
    }

    public boolean checkInEquality() {

        return distance[c2][c1] + distance[c2][c3] >= distance[c1][c3];
    }
}
