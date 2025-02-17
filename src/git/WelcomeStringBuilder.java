package git;

    // Знакомство с StringBuilder
public class WelcomeStringBuilder {

    private StringBuilder sb = new StringBuilder();

    void makeBuilder(){
        sb.append("lol");
        sb.append("hhtps://");
        sb.reverse(); //Перевенуть стринг в обратную сторону
        String str = sb.toString();
        System.out.println("StringBuilder: " + str);
    }

}
    // Знакомство с StringBuilder