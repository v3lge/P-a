import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Data number1 = new Data("Олег", "Попов", "89997775544");
        Data number2 = new Data("Никита", "Иванов", "80003332266");
        Data number3 = new Data("Олег", "Попов", "89997775544");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        Set<Data> set = new HashSet<>();
        set.add(number1);
        set.add(number2);
        set.add(number3);
        System.out.println(set);
    }
}
