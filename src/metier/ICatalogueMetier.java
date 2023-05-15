package src.metier;

import java.util.List;

public interface ICatalogueMetier {
    public List<Produit> produitsParMC(String mc);
    public void addProduit(Produit p);
}
