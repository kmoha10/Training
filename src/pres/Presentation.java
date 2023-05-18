package src.pres;

import src.metier.CatalogueMetierImpl;
import src.metier.Produit;

import java.util.List;
import java.util.Scanner;

public class Presentation {
    public static void main(String[]args) {
         Scanner clavier = new Scanner(System.in);
        CatalogueMetierImpl metier = new CatalogueMetierImpl();
        System.out.print("Nom Produit:"); String nom=clavier.next();
        System.out.print("Prix"); double prix = clavier.nextDouble();
        System.out.println("Quantite:"); int quantite=clavier.nextInt();
        Produit pr = new Produit(nom, prix, quantite);
        metier.addProduit(pr);
        System.out.print("Mot cle:");
        String mc = clavier.next();
        List<Produit> prods = metier.produitsParMC(mc);
        for (Produit p:prods){
            System.out.println(p.getIdProduit()+"\t"+p.getNomProduit()
                    +"\t"+p.getPrix()
                    +"\t"+p.getQuantite());
        }
    }
}
