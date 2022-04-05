package pl.sebastianf;

public class Main {

    public static void main(String[] args) {

        char myChar='D';

        switch(myChar) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
