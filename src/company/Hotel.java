package company;

public class Hotel extends Family  {


    public Hotel(String familyName, String address, int people, Person[] family) {
        super(familyName, address, people, family);
    }

    @Override
    public void rent() {
        System.out.println("rent is "+860+" ruble a day");
    }

    @Override
    public void taxes() {

    }

}
