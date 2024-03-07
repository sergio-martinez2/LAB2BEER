package unipiloto.edu.co.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 {
    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("Mercancias Solidas")) {
            brands.add("Arroz");
            brands.add("Cuadernos");
            brands.add("Celulares");
        } else if (color.equals("Productos Agricolas")) {
            brands.add("Arroz");
            brands.add("Papa");
            brands.add("Yuca");
        }else if (color.equals("Productos Liquidos")) {
            brands.add("Hospital");
            brands.add("Restaurante");
            brands.add("Museo");
        }else {
            brands.add("Seleccione uno");

        }
        return brands;
    }
}
