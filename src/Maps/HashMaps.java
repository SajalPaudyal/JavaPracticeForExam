package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    HashMap <String, String> capitalCities = new HashMap<>();

    public void putToMaps(String _countryName, String _countryCapital){
        capitalCities.put(_countryName, _countryCapital);
    }
    Set<Map.Entry<String,String>> capitalSet = capitalCities.entrySet();

    public void showKeyAndValue(){
        for(Map.Entry<String, String> entry: capitalSet){
            System.out.println("The key is: "+ entry.getKey()+ " And the value is: " + entry.getValue());
        }
    }


    public void removeFromMaps (String _countryName) throws CountryNotInMapException {
        boolean checkIfExists = capitalCities.containsKey(_countryName);
        if(checkIfExists){
            capitalCities.remove(_countryName);
        }
        if(!checkIfExists){
            throw new CountryNotInMapException("There is no country in the list");
        }
    }

    public void showValues(){
        System.out.println(capitalCities.values());
    }
}
