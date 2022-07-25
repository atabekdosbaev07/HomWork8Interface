package company;

import java.util.Arrays;

public abstract class Family implements Payable {
    private Person[] family;
    private String familyName;
    private String address;
    private int people;

    public Family(String familyName, String address, int people,Person[] family) {
        this.familyName = familyName;
        this.address = address;
        this.people = people;
        this.family = family;
    }



    @Override
    public String toString() {
        return "Family{" +"\n"+
                "FamilyName = '" + familyName + '\'' +"\n"+
                "Address = '" + address + '\'' +"\n"+
                "People = " + people +"\n"+
                "Persons"+ Arrays.toString(family)+
                '}';
    }
}
