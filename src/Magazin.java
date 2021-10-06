import java.util.Arrays;
import java.util.Scanner;

public class Magazin {
    public static void alegere(){
        Produse[] obj = new Produse[100];
        Produse mod = new Produse();
        Furnizori[] objFurnizori = new Furnizori[100];
        Furnizori modFurnizori = new Furnizori();
        while(true){
            System.out.println("Select action:\n1.) Add new product.\n2.) Change existing product.\n3.) Add new provider.\n4.) Change existing provider.\n5.) Total number of products.\n6.) Total price of products.\n7.) Total number of providers.\n8.) List all products.\n9.) List all providers.\n10.) Product information(code).\n11.) Exit");
            Scanner sc = new Scanner(System.in);
            int alegere = sc.nextInt();
            if(alegere == 1){
                mod.adaugareProdus(obj);
            }
            else if(alegere == 2){
                mod.modificareProdus(obj);
            }
            else if(alegere == 3){
                modFurnizori.adaugareProvider(objFurnizori);
            }
            else if(alegere == 4){
                modFurnizori.modificareProvider(objFurnizori);
            }
            if(alegere == 5){
                System.out.println("Total number of registered products: " + total.nrTotalProduse);
            }
            if(alegere == 6){
                System.out.println("Total price of registered products: " + total.pretTotalProduse);
            }
            if(alegere == 7){
                System.out.println("Total number of providers: " + total.nrTotalFurnizori);
            }
            if(alegere == 8){
                mod.listareProduse(obj);
            }
            else if(alegere == 9){
                modFurnizori.listareProvideri(objFurnizori);
            }
            else if(alegere == 10){
                mod.detaliiProdus(obj);
            }
            else if(alegere == 11){
                System.exit(1);
            }
        }
    }
    public static void main(String[] args){
        alegere();
    }
}
