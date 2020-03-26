
public class Main {
    public static void main(String[] args) {
        int budget = 7;

        Pupil p = new Pupil("Vasia", "Pupkin", "Bestiariki", "8A");

        ICompanyFactory companyFactory = chooseCompany(budget);

        Certificate certificate = new Certificate();
        if(companyFactory != null) {
            certificate = companyFactory.createCertificate(p , "Football competition", 3);
            printCertificate(certificate);
            budget -= companyFactory.getPrice();
        }
        else System.out.println("You don't have enough money");
    }

    public static void printCertificate(Certificate c) {
        System.out.println(c.getText());
    }

    public static ICompanyFactory chooseCompany(int budget) {
        ICompanyFactory companyFactory;
        if(budget >= new BestPrintFactory().getPrice()) {
            companyFactory = new BestPrintFactory();
        }
        else if(budget >= new EasyPrintFactory().getPrice()) {
            companyFactory = new EasyPrintFactory();
        }
        else if(budget >= new CheapPrint().getPrice()) {
            companyFactory = new CheapPrint();
        }
        else {
            return null;
        }
        return companyFactory;
    }
}
