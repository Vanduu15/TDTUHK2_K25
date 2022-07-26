public class Student {
    private int id;
    private String fistName;
    private String lastName;

    public Student(int id, String fistName, String lasName){
        this.id=id;
        this.fistName=fistName;
        this.lastName=lasName;
    }
    public int getID(){
        return this.id;
    }
    public String getFistName(){
        return this.fistName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setID(int id){
        this.id=id;
    }
    public void setFistName(String fistName){
        this.fistName=fistName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getName(){
        return this.fistName+" "+this.lastName;
    }
    @Override
    public String toString(){
        return String.format("Strudent[id=%d, fistName= %s, lastName= %s]",this.id, this.fistName, this.lastName);
    }
}
