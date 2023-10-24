import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    String middleName;
    String lastName;
    String sex;
    int age;
    Person mother;
    Person father;
    List<Person> siblings;
    List<Person> children;
    List<Pet> pets;
    public Person(String nameInput, String lastNameInput, int ageInput, String sexInput){
        this.name = nameInput;
        this.lastName = lastNameInput;
        this.age = ageInput;
        this.sex = sexInput;
        this.siblings = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pets = new ArrayList<>();
    }
    public Person(String nameInput, String middleNameInput, String lastNameInput, int ageInput, String sexInput){
        this.name = nameInput;
        this.middleName = middleNameInput;
        this.lastName = lastNameInput;
        this.age = ageInput;
        this.sex = sexInput;
        this.siblings = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pets = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSex(){
        //return false
        return this.sex;
    }
    public int getAge(){
        return this.age;
    }
    public Person getMother() {
        return this.mother;
    }
    public Person getFather() {
        return this.father;
    }
    public List<Person> getSiblings(){
        return this.siblings;
    }
    public List<Person> getChildren() {
        return this.children;
    }
    public List<Pet> getPets() {
        return this.pets;
    }
    public void setName(String nameInput) {
        this.name = nameInput;
    }
    public void setMiddleName(String middleNameInput) {
        this.middleName = middleNameInput;
    }
    public void setLastName(String lastNameInput) {
        this.lastName = lastNameInput;
    }
    public void setSex(String sexInput) {
        this.sex = sexInput;
    }
    public void setAge(int ageInput) {
        this.age = ageInput;
    }

    public void addParents(Person motherInput, Person fatherInput){
        this.mother = motherInput;
        if(!motherInput.getChildren().contains(this)){
            motherInput.addChild(this);
        }
        this.father = fatherInput;
        if(!fatherInput.getChildren().contains(this)){
            fatherInput.addChild(this);
        }
    }
    public void addChild(Person childInput){
        this.children.add(childInput);
    }
    public void addPet(Pet petInput){
        this.pets.add(petInput);
        if(petInput.owner != this){
            petInput.setOwner(this);
        }
    }
    public void addSibling(Person siblingInput){
        this.siblings.add(siblingInput);
        if(!siblingInput.getSiblings().contains(this)){
            siblingInput.addSibling(this);
        }
    }

    public List<Person> getGrandChildren(){
        List<Person> grandChildren = new ArrayList<>();
        List<Person> children = this.getChildren();
        for (Person child : children) {
            List<Person> thisChildsChildren = child.getChildren();
            for (Person grandChild : thisChildsChildren) {
                grandChildren.add(grandChild);
            }
        }
        return grandChildren;
    }

    public List<Pet> getGrandChildrensPets(){
        List<Pet> grandChildrensPets = new ArrayList<>();
        List<Person> grandChildren = this.getGrandChildren();
        for (Person grandChild : grandChildren){
            List<Pet> childsPets = grandChild.getPets();
            for(Pet childsPet : childsPets){
                grandChildrensPets.add(childsPet);
            }
        }
        return grandChildrensPets;
    }

    public List<Person> getNephews(){
        List<Person> nephews = new ArrayList<>();
        List<Person> siblings = this.getSiblings();
        for (Person sibling : siblings) {
            List<Person> thisSiblingsChildren = sibling.getChildren();
            for (Person nephew : thisSiblingsChildren) {
                nephews.add(nephew);
            }
        }
        return nephews;
    }
}
