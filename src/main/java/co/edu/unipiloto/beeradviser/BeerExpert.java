package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color){
        List<String> beers = new ArrayList<>();

        switch (color){
            case "Reglamentarias":
                beers.add("Pare");
                beers.add("No pase");
                break;
            case "preventivas":
                beers.add("resalto");
                beers.add("desvio");
                break;
            case "informativas":
                beers.add("Sitio de Parqueo");
                beers.add("Aproximacion de obra en la via");
                break;
            case "transitorias":
                beers.add("inicio de obra");
                beers.add("fin de la obra");
                break;
        }
        return beers;
    }
}
