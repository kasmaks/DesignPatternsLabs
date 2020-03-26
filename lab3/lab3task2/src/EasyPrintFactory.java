
public class EasyPrintFactory implements ICompanyFactory {
    public static int colors = 4;
    public Certificate createCertificate(Pupil p , String competitionName, int place) {
        Certificate c = new Certificate();
        String substring1 = p.getName() + " " + p.getSurname() + " from " + p.getSchool() + " " + p.getClassName() +  "! You are the best!\n";;
        String substring2 = "You have achieved " + place + " place in " + competitionName + "!\n";
        String substring3 = "Keep it up!";
        String text = substring1 + substring2 + substring3;
        int maxLength = substring1.length();
        if(substring2.length() > maxLength) maxLength = substring2.length();
        if(substring3.length() > maxLength) maxLength = substring3.length();
        text = "\n" + text;
        for(int i = 0; i < maxLength; i++) {
            text = "-" + text;
        }
        text += "\n";
        for(int i = 0; i < maxLength; i++) {
            text += "-";
        }
        c.setText(text);
        return c;
    }

    public int getPrice() {
        return colors * 3;
    }
}
