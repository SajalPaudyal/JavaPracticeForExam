package Maps;

public class Main {

    public static void main(String[] args){
        HashMaps hm = new HashMaps();
        hm.putToMaps("Nepal", "Kathmandu");
        hm.putToMaps("France", "Paris");
        hm.putToMaps("Germany", "Berlin");

        hm.showValues();
        hm.showKeyAndValue();


        try {
            hm.removeFromMaps("Germany");
        } catch (CountryNotInMapException ex) {
            System.out.println("Exception: "+ ex.getMessage());
        }
        hm.showValues();
        hm.showKeyAndValue();

    }
}
