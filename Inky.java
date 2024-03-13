
//ITBIN-2211-0135  Aberathna A.H.M M S


public class Inky {
    public Inky(String alpha) {
        System.out.println(alpha);
    }

    public Inky(String alpha, String beta, String gamma) {
        System.out.println(beta + " " + alpha);
        System.out.println(alpha + " " + gamma);
        System.out.println(beta + " " + alpha + " " + gamma);
    }

    public static void main(String args[]) {
        String alpha = "Donky";
        String beta = "Pinky";
        String gamma = "Monkey";

        Inky ponky = new Inky(alpha);

        Inky ponky2 = new Inky(alpha, beta, gamma);
    }
}
