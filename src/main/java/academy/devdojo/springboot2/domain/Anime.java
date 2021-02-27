package academy.devdojo.springboot2.domain;

public class Anime {
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
    }

    //erro: No serializer found for class academy.devdojo.springboot2.domain.Anime
    //pq nao tinha os getter and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
