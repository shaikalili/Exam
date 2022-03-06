package Q1;

public class ChainiesCitizen {
    private String name;
    private String id;

    public ChainiesCitizen(String name, String id) {
        this.name = name;
        setId(id);
    }

    public String setId(String id){
        String newid="";
        int numOfAsarot=Integer.parseInt(""+id.charAt(id.length()-2));
        int numOfAchadot=Integer.parseInt(""+id.charAt(id.length()-1));
        for(int i=0;i<id.length()-numOfAsarot;i++){
            newid+=id.charAt(i);

        }
        newid+=""+numOfAchadot;
        for (int i=id.length()-numOfAsarot;i<id.length();i++){
            newid+=id.charAt(i);
        }
        return this.id=newid;
    }

    @Override
    public String toString() {
        return "Q1.ChainiesCitizen{" +
                "name='" + this.name + '\'' +
                ", The new ID is: '" + this.id + '\'' +
                '}';
    }
}
