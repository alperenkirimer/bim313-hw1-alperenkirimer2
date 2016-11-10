package edu.bim313;
import org.paukov.combinatorics3.Generator;
import java.util.ArrayList;
import java.util.List;

public class Hw1
{
    public static void main( String[] args )
    {
        int count=0;
        ArrayList<Integer> cityList = new ArrayList<>();
        List<Triangle> triangleList= new ArrayList<>();

        for(int i=0;i<81;i++){
            cityList.add(i);
        }

        Generator.combination(cityList)
                .simple(3)
                .stream()
                .forEach((t)->triangleList.add(new Triangle(t)));

        triangleList
                .stream()
                .filter(((t) ->t.checkInEquality() ))
                .forEach(System.out::println);

    }
}
