class car{
    String modle;
    int year;

    car(String modle, int year ){
        this.modle = modle;
        this.year = year;
    }

    void display(){
        System.out.println(modle + " " + year);
    }

}


public class class_object_constructor {
    public static void main(String [] args ){
        car mycar = new car("toyota",2020);
        mycar.display();
    }
    
}
