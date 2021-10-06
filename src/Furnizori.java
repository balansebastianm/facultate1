import java.util.Arrays;
import java.util.Scanner;

public class Furnizori {
    private String numeFurnizor = "";
    private Integer numarComenziFurnizor = 0;
    private String categorieFurnizor = "";
    private Integer codFurnizor = 0;

    Scanner sc = new Scanner(System.in);

    public void adaugareProvider(Furnizori[] objFurnizori){
        System.out.println("Input provider data: ");
        System.out.println("Provider code (Integer): ");
        Integer cod = sc.nextInt();
        System.out.println("Provider name: ");
        String nume = sc.next();
        System.out.println("Provider category: ");
        String categorie = sc.next();
        System.out.println("Number of orders:");
        Integer nrComenzi = sc.nextInt();
        objFurnizori[total.nrTotalFurnizori] = new Furnizori();
        objFurnizori[total.nrTotalFurnizori].setCodFurnizor(cod);
        objFurnizori[total.nrTotalFurnizori].setNumeFurnizor(nume);
        objFurnizori[total.nrTotalFurnizori].setCategorieFurnizor(categorie);
        objFurnizori[total.nrTotalFurnizori].setNumarComenziFurnizor(nrComenzi);
        System.out.println("Provider successfully added");
        String s = objFurnizori[total.nrTotalFurnizori].toString();
        System.out.println(s);
        total.nrTotalFurnizori++;
    }

    public void modificareProvider(Furnizori[] objFurnizori){

        if(total.nrTotalFurnizori == 0){
            System.out.println("Providers list is empty.");
        }
        else{
            System.out.println("Enter provider code: ");
            int cod = sc.nextInt();
            int schimb = 0;
            int pozitie = 0;
            for(int i=0; i<total.nrTotalFurnizori; i++){
                if(cod == objFurnizori[0].getCodFurnizor()){
                    schimb = 1;
                    pozitie = i;
                }
            }
            if(schimb == 1){
                System.out.println("Enter new provider data: ");
                System.out.println("Provider code: ");
                Integer codNou = sc.nextInt();
                System.out.println("Provider name: ");
                String numeNou = sc.next();
                System.out.println("Provider category: ");
                String categorieNoua = sc.next();
                System.out.println("Number of orders: ");
                Integer nrComenzi = sc.nextInt();
                objFurnizori[pozitie].setCodFurnizor(codNou);
                objFurnizori[pozitie].setNumeFurnizor(numeNou);
                objFurnizori[pozitie].setCategorieFurnizor(categorieNoua);
                objFurnizori[pozitie].setNumarComenziFurnizor(nrComenzi);
                System.out.println("Provider successfully modified.");
                String s = objFurnizori[pozitie].toString();
                System.out.println(s);
            }
            else{
                System.out.println("Provider code not found.");
            }
        }
    }

    public void listareProvideri(Furnizori[] objFurnizori){
        if(total.nrTotalFurnizori == 0){
            System.out.println("Providers list is empty.");
        }
        else{
            System.out.println("Providers list: ");
            String s = Arrays.toString(objFurnizori);
            System.out.println(s);
        }
    }

    public Integer getCodFurnizor() {
        return codFurnizor;
    }

    public void setCodFurnizor(Integer codFurnizor) {
        this.codFurnizor = codFurnizor;
    }

    public String getNumeFurnizor() {
        return numeFurnizor;
    }

    public void setNumeFurnizor(String numeFurnizor) {
        this.numeFurnizor = numeFurnizor;
    }

    public Integer getNumarComenziFurnizor() {
        return numarComenziFurnizor;
    }

    public void setNumarComenziFurnizor(Integer numarComenziFurnizor) {
        this.numarComenziFurnizor = numarComenziFurnizor;
    }

    public String getCategorieFurnizor() {
        return categorieFurnizor;
    }

    public void setCategorieFurnizor(String categorieFurnizor) {
        this.categorieFurnizor = categorieFurnizor;
    }

    @Override
    public String toString() {
        return "Providers{" +
                "Provider code: '" + codFurnizor + '\'' +
                ", Provider name: '" + numeFurnizor + '\'' +
                ", Number of orders: '" + numarComenziFurnizor + '\'' +
                ", Provider category: '" + categorieFurnizor + '\'' +
                '}';
    }
}
