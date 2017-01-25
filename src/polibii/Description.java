package polibii;

public class Description {
    public String parseText;
    public String descText;

    public Description(String text){
        delAllSpace(text);
        outString(this.parseText);
    }

    public String getDescText(){
        return this.descText;
    }

    public void delAllSpace(String s){
        String rez = s.replaceAll(" ", "");
        this.parseText = rez;
    }

    public String outString(String s){
        String rez = "";
        int x, y;

        for(int i=0; i<s.length(); ++i){
            if(i%2 == 0){
                x = Integer.parseInt(String.valueOf(s.charAt(i)));
                y = Integer.parseInt(String.valueOf(s.charAt(i+1)));

                rez += Encryption.key[x][y];
            }
        }

        this.descText = rez;
        return rez;
    }

}
