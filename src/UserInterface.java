import java.util.List;
import java.util.Scanner;

public class UserInterface {

    static private UserInterface instance;

    private UserInterface(){

    }
    public static synchronized UserInterface getInstance(){
        if(instance == null){
            instance = new UserInterface();
        }
        return instance;
    }

    public void printAllBirds(List<Bird> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void printAllSwimmableBirds(List<Bird> list) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).isFlyable) {
                System.out.println(list.get(i));
            }
        }
    }

    public void printAllFlyableBirds(List<Bird> list){
        list.stream().filter(bird -> bird.isFlyable).forEach(bird -> System.out.println(bird));
    }

    public void printEatBehaviour(List<Bird> list){
        list.stream().forEach(Bird ::eat);
    }

    public int showMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option \n " +
                "1.Add Birds\n " +
                "2.Remove Birds\n " +
                "3.Update the Birds\n " +
                "4.Print Birds\n " +
                "5.Print swimmable Birds \n " +
                "6.Print Flyable Birds \n " +
                "7. printEatBehaviour \n " +
                "8. EXIT_VALUE \n " );
        return (sc.nextInt());
    }
}
