package AnimalAdoptionREST;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;
import java.util.*;

@Path("/animaladopt")
public class AnimalResource {

    @Path("/json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<String, Animal> getAnimals() {
        return createAnimalMap();
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String displayHTMLCarInfo() {
        return "<html><body> <h1>Animal Details</h1> <table border=\"1\"> <tr>"
                + " <th>id</th>"
                + " <th>name</th>"
                + " <th>species</th>"
                + " <th>breed</th>"
                + " <th>age</th>"
                + " <th>gender</th>"
                + " <th>weight</th>"
                + " <th>color</th>"
                + " <th>dateArrived</th>"
                + " <th>healthStatus</th>"
                + " <th>isVaccinated</th>"
                + " <th>isNeutered</th>"
                + " <th>temperament</th>"
                + " <th>specialNeeds</th>"
                + " <th>adoptionFee</th>"
                + "</tr>"
                + getmeatable(createAnimalMap()) +
                "</table></body></html>";
    }


    @Path("/search/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Animal searchCar(@PathParam("id") String id) {
        return createAnimalMap().get(id);
    }


    private HashMap<String, Animal> createAnimalMap() {
        HashMap<String, Animal> animalMap = new HashMap<>();
        animalMap.put("A001", new Animal("A001", "Buddy", "Dog", "Labrador", 3, "Male",
                25.5, "Golden", LocalDate.of(2023, 1, 15), "Healthy",
                true, true, "Friendly", "", 150.0));
        animalMap.put("A002", new Animal("A002", "Whiskers", "Cat", "Siamese", 2, "Female",
                4.2, "Cream", LocalDate.of(2023, 3, 20), "Healthy",
                true, false, "Shy", "", 100.0));
        animalMap.put("A003", new Animal("A003", "Hoppy", "Rabbit", "Dutch", 1, "Male",
                1.8, "Black and White", LocalDate.of(2023, 5, 10), "Healthy",
                true, false, "Active", "", 80.0));
        animalMap.put("A004", new Animal("A004", "Max", "Dog", "German Shepherd", 7, "Male",
                35.0, "Black and Tan", LocalDate.of(2022, 11, 5), "Arthritis",
                true, true, "Calm", "Needs joint supplements", 120.0));
        return animalMap;
    }

    public String getmeatable(HashMap<String, Animal> animalHashMap) {
        StringBuilder html = new StringBuilder();

        for (Animal a1 : animalHashMap.values()) {
            html.append("<tr>");
            html.append("<td>").append(a1.getId()).append("</td>");
            html.append("<td>").append(a1.getName()).append("</td>");
            html.append("<td>").append(a1.getSpecies()).append("</td>");
            html.append("<td>").append(a1.getBreed()).append("</td>");
            html.append("<td>").append(a1.getAge()).append("</td>");
            html.append("<td>").append(a1.getGender()).append("</td>");
            html.append("<td>").append(a1.getWeight()).append("</td>");
            html.append("<td>").append(a1.getColor()).append("</td>");
            html.append("<td>").append(a1.getDateArrived()).append("</td>");
            html.append("<td>").append(a1.getHealthStatus()).append("</td>");
            html.append("<td>").append(a1.isVaccinated()).append("</td>");
            html.append("<td>").append(a1.isNeutered()).append("</td>");
            html.append("<td>").append(a1.getTemperament()).append("</td>");
            html.append("<td>").append(a1.getSpecialNeeds()).append("</td>");
            html.append("<td>").append(a1.getAdoptionFee()).append("</td>");
            html.append("</tr>");
        }
        return html.toString();

    }
}
