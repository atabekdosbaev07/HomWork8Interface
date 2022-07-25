package company;

public class Apartment extends Family {


    public Apartment(String familyName, String address, int people, Person[] family) {
        super(familyName, address, people, family);
    }

    @Override
    public void rent() {

    }

    @Override
    public void taxes() {
        System.out.println("taxes is "+3622+" ruble a month");
    }
}



