package company;

public class Hostel extends Family {


    public Hostel(String familyName, String address, int people, Person[] family) {
        super(familyName, address, people, family);
    }

    @Override
    public void rent() {
        System.out.println("rent is "+350+" ruble a day");
    }

    @Override
    public void taxes() {

    }

}




