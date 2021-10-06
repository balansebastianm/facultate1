import java.util.Scanner;

public class Produse {
    private String numeProdus = "";
    private Double pretProdus = 0.0;
    private String categorieProdus = "";
    private int codProdus = 0;
    Scanner sc = new Scanner(System.in);
    public void adaugareProdus(Produse[] obj){
        System.out.println("Product code (Integer): ");
        Integer cod = sc.nextInt();
        System.out.println("Product name: ");
        String nume = sc.next();
        System.out.println("Product price (Integer / Float): ");
        Double pret = sc.nextDouble();
        System.out.println("Product category: ");
        String categorie = sc.next();
        obj[total.nrTotalProduse] = new Produse();
        obj[total.nrTotalProduse].setCodProdus(cod);
        obj[total.nrTotalProduse].setPretProdus(pret);
        obj[total.nrTotalProduse].setNumeProdus(nume);
        obj[total.nrTotalProduse].setCategorieProdus(categorie);
        System.out.println("Product successfully added to the list.");
        total.nrTotalProduse++;
        total.pretTotalProduse = total.pretTotalProduse + pret;
        String s = obj[total.nrTotalProduse - 1].toString();
        System.out.println(s);
    }

    public void modificareProdus(Produse[] obj){
        int schimb = 0;
        if(total.nrTotalProduse == 0)
        {
            System.out.println("Product list is empty");
        }
        else{
            System.out.println("Enter product code: ");
            int codSchimb = sc.nextInt();
            int pozitie = 0;
            for(int i = 0; i<total.nrTotalProduse; i++){
                int codProdus = obj[i].getCodProdus();
                if (codProdus == codSchimb) {
                    schimb = 1;
                    pozitie = i;
                }

                if(schimb == 1){
                    System.out.println("Enter new attributes: ");
                    System.out.println("Product code (Integer): ");
                    Integer cod = sc.nextInt();
                    System.out.println("Product name: ");
                    String nume = sc.next();
                    System.out.println("Product price (Integer / Float): ");
                    Double pret = sc.nextDouble();
                    total.pretTotalProduse = total.pretTotalProduse - (obj[pozitie].getPretProdus() - pret);
                    System.out.println("Product category: ");
                    String categorie = sc.next();
                    obj[pozitie].setCodProdus(cod);
                    obj[pozitie].setNumeProdus(nume);
                    obj[pozitie].setPretProdus(pret);
                    obj[pozitie].setCategorieProdus(categorie);
                    System.out.println("Product successfully modified.");
                    String s = obj[pozitie].toString();
                    System.out.println(s);
                }
                else{
                    System.out.println("Product code not found.");
                }
            }
        }
    }

    public void listareProduse(Produse[] obj){
        System.out.println("Product list: ");
        if(total.nrTotalProduse == 0){
            System.out.println("Product list is empty.");
        }
        else{
            for(int i=0; i<total.nrTotalProduse; i++){
                String s = obj[i].toString();
                System.out.println(s);
            }
        }
    }

    public void detaliiProdus(Produse[] obj){
        if(total.nrTotalProduse == 0) {
            System.out.println("Product list is empty.");
        }
        else{
            System.out.println("Enter product code: ");
            int cod = sc.nextInt();
            int gasit = 0;
            int pozitie = 0;
            for(int i=0; i<total.nrTotalProduse; i++){
                if(cod == obj[i].getCodProdus()){
                    gasit = 1;
                    pozitie = i;
                }
            }
            if(gasit == 1){
                System.out.println("Choose what to display: \n1.) Product name.\n2.) Product price.\n3.) Product category.\n4.) All of the above.");
                int choice = sc.nextInt();
                if(choice == 1){
                    System.out.println("Product name: " + obj[pozitie].getNumeProdus());
                }
                else if(choice == 2){
                    System.out.println("Product price: " + obj[pozitie].getPretProdus());
                }
                else if(choice == 3){
                    System.out.println("Product category: " + obj[pozitie].getCategorieProdus());
                }
                else if(choice == 4){
                    String s = obj[pozitie].toString();
                    System.out.println(s);
                }
                else{
                    System.out.println("Wrong input.");
                }
            }
            else{
                System.out.println("Product code not found.");
            }
        }
    }

    @Override
    public String toString() {
        return "Products{" +
                "Product name: '" + numeProdus + '\'' +
                ", Product price: " + pretProdus +
                ", Product category: '" + categorieProdus + '\'' +
                ", Product code: " + codProdus +
                '}';
    }

    public Integer getCodProdus() {
        return codProdus;
    }

    public void setCodProdus(Integer codProdus) {
        this.codProdus = codProdus;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public Double getPretProdus() {
        return pretProdus;
    }

    public void setPretProdus(Double pretProdus) {
        this.pretProdus = pretProdus;
    }

    public String getCategorieProdus() {
        return categorieProdus;
    }

    public void setCategorieProdus(String categorieProdus) {
        this.categorieProdus = categorieProdus;
    }

}
