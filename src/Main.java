import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần đọc, từ 0 đến 999:");
        int number = scanner.nextInt();
        String numberName = "";
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundres = (number / 100) % 10;

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {

            switch (hundres) {
                case 1:
                    numberName += "one hundred ";
                    break;
                case 2:
                    numberName += "two hundred ";
                    break;
                case 3:
                    numberName += "three hundred ";
                    break;
                case 4:
                    numberName += "four hundred ";
                    break;
                case 5:
                    numberName += "five hundred ";
                    break;
                case 6:
                    numberName += "six hundred ";
                    break;
                case 7:
                    numberName += "seven hundred ";
                    break;
                case 8:
                    numberName += "eight hundred ";
                    break;
                case 9:
                    numberName += "nine hundred ";
                    break;
                default:
                    break;
            }
            switch (tens) {
                case 1: {
                    switch (ones) {
                        case 0:
                            numberName += "ten ";
                            break;
                        case 1:
                            numberName += "eleven ";
                            break;
                        case 2:
                            numberName += "twelve ";
                            break;
                        case 3:
                            numberName += "thirteen ";
                            break;
                        case 4:
                            numberName += "fourteen ";
                            break;
                        case 5:
                            numberName += "fifteen ";
                            break;
                        case 6:
                            numberName += "sixteen ";
                            break;
                        case 7:
                            numberName += "seventeen ";
                            break;
                        case 8:
                            numberName += "eighteen ";
                            break;
                        case 9:
                            numberName += "nineteen ";
                            break;
                        default:
                            break;
                    }
                }
                case 2:
                    numberName += "twenty ";
                    break;
                case 3:
                    numberName += "thirty ";
                    break;
                case 4:
                    numberName += "forty ";
                    break;
                case 5:
                    numberName += "fifty ";
                    break;
                case 6:
                    numberName += "sixty ";
                    break;
                case 7:
                    numberName += "seventy ";
                    break;
                case 8:
                    numberName += "eighty ";
                    break;
                case 9:
                    numberName += "ninety ";
                default:
                    break;
            }
            switch (ones) {
                case 0:
                    numberName += "zero";
                    break;
                case 1:
                    numberName += "one";
                    break;
                case 2:
                    numberName += "two";
                    break;
                case 3:
                    numberName += "three";
                    break;
                case 4:
                    numberName += "four";
                    break;
                case 5:
                    numberName += "five";
                    break;
                case 6:
                    numberName += "six";
                    break;
                case 7:
                    numberName += "seven";
                    break;
                case 8:
                    numberName += "eight";
                    break;
                case 9:
                    numberName += "nice";
                    break;
                default:
                    break;
            }
            System.out.println(numberName);
        }

    }
}