package by.gsu.pms.Client;

import by.gsu.pms.tariff.Species;


    public class Client {

    private String clientName;
    private String clientPhoneNumbers;
    private Species species;
    public Client(String clientName, String clientPhoneNumbers, Species species){
        this.clientName=clientName;
        this.clientPhoneNumbers=clientPhoneNumbers;
        this.species = species;
    }
    public void setClientName(String clientName){
        this.clientName=clientName;
    }
    public String getClientName(){
        return clientName;
    }
    public void setClientPhoneNumbers(String clientPhoneNumbers){
        this.clientPhoneNumbers=clientPhoneNumbers;
    }
    public String getClientPhoneNumbers(){
        return clientPhoneNumbers;
    }
    public Species getSpecies() {
        return species;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }
    @Override
    public String toString(){
        return "\nClient Name: "+clientName+" |PhoneNumbers: "+clientPhoneNumbers +" |Tariff plan: "+species ;
    }
}