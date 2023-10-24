public class Pet {
    String name;
    int age;
    String species;
    Person owner;
    public Pet(String nameInput, int ageInput, String speciesInput){
        this.name = nameInput;
        this.age = ageInput;
        this.species = speciesInput;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSpecies(){
        return this.species;
    }
    public Person getOwner(){
        return this.owner;
    }
    public void setName(String nameInput){
        this.name = nameInput;
    }
    public void setAge(int ageInput){
        this.age = ageInput;
    }
    public void setSpecies(String speciesInput){
        this.species = speciesInput;
    }
    public void setOwner(Person ownerInput){
        this.owner = ownerInput;
        if(!ownerInput.getPets().contains(this)){
            ownerInput.addPet(this);
        }
    }
}
