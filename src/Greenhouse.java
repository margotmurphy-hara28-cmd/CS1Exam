import java.sql.SQLOutput;

public class Greenhouse {
    String name;
    boolean sprinklersOn;
    int numberOfFlowers;

    public Greenhouse(){
        System.out.println("Hello World! Good luck on your exams!");
        name = "Planting Parameters at the CSG";
        sprinklersOn = true;
        numberOfFlowers = 31;
        System.out.println("Welcome to " +name+ "! It is " +sprinklersOn+ " that we are watering the plants right now. We have " +numberOfFlowers+ " flowers!");
        numberOfFlowers = 64;
        System.out.println("Welcome to " +name+ "! It is " +sprinklersOn+ " that we are watering the plants right now. We have " +numberOfFlowers+ " flowers!");
        randomReplant();
        veggieOfTheDay("tomato");
        countFlowers();
        changeTemperature();
        Plant kimPlant = new Plant(3,"orange",true);
        kimPlant.printInfo();
        Plant myPlant = new Plant(4,"purple", true);
        myPlant.printInfo();
        starTriangle(5);
        perimeterTriangle(6);
    }

    public void randomReplant(){
        int randomInt = (int)(Math.random()*15);
        System.out.println("We are replanting " +randomInt+ " vegetables today!");
    }

    public void veggieOfTheDay(String veggie){
        System.out.println("Today's chosen veggie is " +veggie);
    }

    public void countFlowers(){
        for(int i = 2; i <= 6; i = i+1){
            System.out.println(i);
        }
        for(int i = 20; i <= 110; i=i+30) {
            System.out.println(i);
        }
        for(int i=8; i>=0; i=i-1){
            System.out.println(i);
        }
    }

    public void changeTemperature(){
        double randomNum = (Math.random());
        if(randomNum<.25){
            System.out.println("The temperature has decreased by 2 degrees");
        }
        if(randomNum>=.25 && randomNum<.5){
            System.out.println("The temperature has decreased by 1 degree");
        }
        if(randomNum>=.5 && randomNum<.75){
            System.out.println("The temperature has increased by 1 degree");
        }
        if(randomNum>=.75){
            System.out.println("The temperature has increased by 2 degrees");
        }
    }

    public void starTriangle(int size){
            if (size < 2) {
                System.out.println("*");
            }
            else if (size>1 && size<3) {
                System.out.println("*");
                System.out.println("* *");
            }
            else if (size>2 && size<4) {
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
            }
            else if (size>3 && size<5) {
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * *");
            }
            else if (size>4 && size<6) {
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * * ");
                System.out.println("* * * * *");
            }
            else if (size>5 && size<7) {
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * * ");
                System.out.println("* * * * *");
                System.out.println("* * * * * *");
            }
            else if (size>6 && size<8) {
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * * ");
                System.out.println("* * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * * *");
            }
    }

    public void perimeterTriangle(int size){
        if (size < 2) {
            System.out.println("-");
        }
        else if (size>1 && size<3) {
            System.out.println("-");
            System.out.println("- -");
        }
        else if (size>2 && size<4) {
            System.out.println("-");
            System.out.println("- -");
            System.out.println("- - -");
        }
        else if (size>3 && size<5) {
            System.out.println("-");
            System.out.println("- -");
            System.out.println("- * - ");
            System.out.println(" - - - -");
        }
        else if (size>4 && size<6) {
            System.out.println("-");
            System.out.println("- -");
            System.out.println("- * -");
            System.out.println("- * * -");
            System.out.println("- - - - -");
        }
        else if (size>5 && size<7) {
            System.out.println("-");
            System.out.println("- -");
            System.out.println("- * -");
            System.out.println("- * * - ");
            System.out.println("- * * * -");
            System.out.println("- - - - - -");
        }
        else if (size>6 && size<8) {
            System.out.println("-");
            System.out.println("- -");
            System.out.println("- * -");
            System.out.println("- * * - ");
            System.out.println("- * * * -");
            System.out.println("- * * * * -");
            System.out.println("- - - - - - -");
        }
    }



    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();
    }
}
