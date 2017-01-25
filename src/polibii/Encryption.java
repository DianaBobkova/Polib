package polibii;

public class Encryption {

    private String text = "";
    private String encText = "";

    public Encryption(String text) {

        this.text = text;
        findInArr(this.text);
    }

    public String getEncText() {
        return this.encText;
    }

    public void findInArr(String text) {

        for (int i = 0; i < text.length(); ++i) {
            this.encText += charIn(text.charAt(i));
        }
    }

    public void finalEncrypt(String text) {
        String spaceDel = text.replaceAll(" ", "");
        System.out.println(spaceDel);
        String rez = "";

        rez += spaceDel.charAt(spaceDel.length());

        for (int i = 0; i < (spaceDel.length() - 1); ++i) {
            rez += spaceDel.charAt(i + 1);
        }

        this.encText = rez;
    }

    public String charIn(char c) {
        String rez = "";
        for (int i = 0; i < Main.key.length; ++i) {
            for (int j = 0; j < Main.key[i].length; ++j) {
                if (Main.key[i][j] == c) {
                    rez = rez + (i + "" + j + " ");
                }
            }
        }
        return rez;
    }
}
