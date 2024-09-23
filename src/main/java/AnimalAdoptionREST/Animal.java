package AnimalAdoptionREST;

import java.time.LocalDate;
import java.util.Objects;

public class Animal {

    private String id;
    private String name;
    private String species;
    private String breed;
    private int age;
    private String gender;
    private double weight;
    private String color;
    private LocalDate dateArrived;
    private String healthStatus;
    private boolean isVaccinated;
    private boolean isNeutered;
    private String temperament;
    private String specialNeeds;
    private double adoptionFee;

    public Animal(String id, String name, String species, String breed, int age, String gender, double weight,
                  String color, LocalDate localDate, String healthStatus, boolean isVaccinated, boolean isNeutered, String temperament, String specialNeeds, double adoptionFee) {
        setId(id);
        setName(name);
        setSpecies(species);
        setBreed(breed);
        setAge(age);
        setGender(gender);
        setWeight(weight);
        setColor(color);
        setDateArrived(LocalDate.now());
        setHealthStatus(healthStatus);
        setVaccinated(isVaccinated);
        setNeutered(isNeutered);
        setTemperament(temperament);
        setSpecialNeeds(specialNeeds);
        setAdoptionFee(adoptionFee);
        setDateArrived(localDate);

    }


    public String toString() {
        return "Animal{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", species='" + getSpecies() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                ", dateArrived=" + getDateArrived() +
                ", healthStatus='" + getHealthStatus() + '\'' +
                ", isVaccinated=" + isVaccinated() +
                ", isNeutered=" + isNeutered() +
                ", temperament='" + getTemperament() + '\'' +
                ", specialNeeds='" + getSpecialNeeds() + '\'' +
                ", adoptionFee=" + getAdoptionFee() +
                '}';
    }

    //getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getDateArrived() {
        return dateArrived;
    }

    public void setDateArrived(LocalDate dateArrived) {
        this.dateArrived = dateArrived;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public boolean isNeutered() {
        return isNeutered;
    }

    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(String specialNeeds) {
        if (Objects.equals(specialNeeds, "")) {
            this.specialNeeds = "None";
        } else {
            this.specialNeeds = specialNeeds;
        }
    }

    public double getAdoptionFee() {
        return adoptionFee;
    }

    public void setAdoptionFee(double adoptionFee) {
        this.adoptionFee = adoptionFee;
    }


}
