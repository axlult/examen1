package encripta;

import java.util.Locale;

public class encriptaVignere implements Encripta{
    String Charset= "abcdefghijklmnopqrstuvwxyz";
    String clave= "lima";
    public void encripta(String s){
      String encriptado ="";
      String smenor=s.toLowerCase();
        for(int n = 0,c=0;n<s.length();n++,c = (c+1)%clave.length()){
            if(Charset.indexOf(smenor.charAt(n))!=-1){
                int tmp = (Charset.indexOf(smenor.charAt(n))+Charset.indexOf(clave.charAt(c)))%Charset.length();
                encriptado+=(Charset.indexOf(s.charAt(n))!=-1)?Charset.charAt(tmp):String.valueOf(Charset.charAt(tmp)).toUpperCase();
            }
            else {
                c-=1;
                encriptado+=s.charAt(n);
            }
        }
        System.out.println(encriptado);

    }
    public void desencripta(String s){
        String desencriptado = "";
        String smenor = s.toLowerCase();
        for(int n = 0,c=0;n<smenor.length();n++,c=(c+1)%clave.length()){
            if(Charset.indexOf(smenor.charAt(n))!=-1){
                int tmp = (Charset.indexOf(smenor.charAt(n))-Charset.indexOf(clave.charAt(c)));
                tmp = (tmp<0)?(tmp+Charset.length()):tmp;
                desencriptado+=(Charset.indexOf(s.charAt(n))!=-1)?Charset.charAt(tmp):String.valueOf(Charset.charAt(tmp)).toUpperCase();
            }
            else {
                c-=1;
                desencriptado+=s.charAt(n);
            }
        }


        System.out.println(desencriptado);

    }
}
