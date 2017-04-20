package Switch;

public class Main {
    public static void main(String[] args) {

        char c = 'B';

        switch (c) {
            case 'A':
                case 'B':
                    case 'C':
                        case 'D':
                            case 'E':
                                System.out.println("Found your letter!");
                                break;
            default:
                System.out.println("Didn't find your letter");
                break;

        }
    }
}
