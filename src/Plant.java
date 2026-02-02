public class Plant {
    int numWeeksOld;
    String color;
    boolean isEdible;

    public Plant(int numWeeksOldInput,String colorInput, boolean isEdibleInput){
        numWeeksOld = numWeeksOldInput;
        color = colorInput;
        isEdible = isEdibleInput;
    }

    public void printInfo(){
        System.out.println("This plant is " +numWeeksOld+ " weeks old. It is " +color+ " and it is " +isEdible+ " that it is edible!");
    }

    public static void main(String[] args) {

    }
}
