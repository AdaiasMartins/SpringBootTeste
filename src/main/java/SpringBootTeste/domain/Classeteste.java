package SpringBootTeste.domain;

public class Classeteste {

    private String name;

    public Classeteste(String name){
        this.name = name;
    }

    public Classeteste(){
        this.name = "";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
