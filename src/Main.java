import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bishkek bishkek = new Bishkek(new String[]{"Октябрь","Первомай","Аламедин"});
        Talas talas = new Talas(new String[]{"Талас","Кара-Буура","Бакай-Ата"});
        Toktogul toktogul = new Toktogul(new String[]{"Токтогул", "Торкент","Толук"});
        Orlovka orlovka = new Orlovka(new String[]{});
        Ozgorush ozgorush = new Ozgorush(new String[]{});

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите руководителя:");
        String search = scan.next();
        if(bishkek.Leader().equals(search)){
            System.out.println(bishkek);
        }
        else if(ozgorush.Leader().equals(search)){
            System.out.println(ozgorush);
        }
        else if(orlovka.Leader().equals(search)){
            System.out.println(orlovka);
        }
        else if(talas.Leader().equals(search)){
            System.out.println(talas);
        }
        else if(toktogul.Leader().equals(search)){
            System.out.println(toktogul);
        }
        else {
            System.out.println("Нет такого руководителя");
        }

    }
}
