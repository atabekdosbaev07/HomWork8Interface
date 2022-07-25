package company;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jack",10);
        Person person2 = new Person("Roksana",32);
        Person person3 = new Person("Adam",34);
        Person person4 = new Person("Nargiza",23);
        Person person5 = new Person("Islam",26);
        Person person6 = new Person("Oleg",32);
        Person person7 = new Person("Cristina",27);

        Family family1 = new Apartment("Adams family",
                "г.Москва, ул.Костякова, д.8, э.6, кв.86",3,new Person[]{person,person2,person3});
        Family family2 = new Hostel("Ilyazov family",
                "г.Москва, ул.Ольховская, д.47, строение 2",2,new Person[]{person4,person5});
        Family family3 =new Hotel("Gavazov family",
                "г.Санкт-Петербург, Пироговская наб., д. 5/2",2,new Person[]{person6,person7});

        System.out.println(family1); family1.taxes();
        System.out.println("-------------");

        System.out.println(family2);family2.rent();
        System.out.println("-------------");

        System.out.println(family3);family3.rent();






    }
}