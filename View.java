import java.util.Scanner;
import java.util.stream.Stream;

public class View {

    Scanner sc = new Scanner(System.in);
    Stream<LapTopBase> lapTopStream;
    public View() {
        LapTopSet lapTopSet = new LapTopSet();
        lapTopStream = Stream.of(lapTopSet.lapTops);
    }

    public void Request(){
        System.out.println("Enter a criterion: 1. Mark \n 2. RAM \n 3. Operating system \n 4. Color \n 5. Price");
        int request = sc.nextInt();
        sc.nextLine();
        switch (request){
            case 1:
                System.out.println("Enter a mark: ");
                String req1 = sc.nextLine();
                lapTopStream.filter(lapTop -> lapTop.getMark().equals(req1)).forEach(lapTop -> System.out.println(lapTop.toString()));
                break;
            case 2:
                System.out.println("Enter a RAM: ");
                int req2 = sc.nextInt();
                lapTopStream.filter(lapTop -> lapTop.getRam() == (req2)).forEach(lapTop -> System.out.println(lapTop.toString()));
                break;
            case 3:
                System.out.println("Enter a Operating system: ");
                String req3 = sc.nextLine();
                lapTopStream.filter(lapTop -> lapTop.getOperatingSystem().equals(req3)).forEach(lapTop -> System.out.println(lapTop.toString()));
                break;
            case 4:
                System.out.println("Enter a color: ");
                String req4 = sc.nextLine();
                lapTopStream.filter(lapTop -> lapTop.getColor().equals(req4)).forEach(lapTop -> System.out.println(lapTop.toString()));
                break;
            case 5:
                System.out.println("Enter a price: ");
                int req5 = sc.nextInt();
                lapTopStream.filter(lapTop -> lapTop.getPrice() == req5).forEach(lapTop -> System.out.println(lapTop.toString()));
                break;
            default:
                System.out.println("Enter a correct number! ");
                break;
        }
    }
}
