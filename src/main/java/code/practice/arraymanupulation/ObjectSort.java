package code.practice.arraymanupulation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ObjectSort {
int id;
String name;
double salary;

public ObjectSort(int id ,String name,Double salary){
    this.id =id;
    this.name =name;
    this.salary =salary;
}
public int getId(){return id;}
    public String getName() {return name;}
    public double getSalary() {return  salary;}

    @Override
    public String toString(){
    return id + " "+name + " "+salary;
    }

    public static void main(String[] args) {
        List<ObjectSort> lis = new ArrayList<>();
        lis.add(new ObjectSort(2,"santu",12304d));
        lis.add(new ObjectSort(3,"annappa",235d));
        lis.add(new ObjectSort(4, "ram",23456d));
        System.out.println(lis);
        lis.sort(Comparator.comparing(ObjectSort::getId));
        lis.sort(Comparator.comparing(ObjectSort::getName).reversed());
        System.out.println(lis);
    }
}

