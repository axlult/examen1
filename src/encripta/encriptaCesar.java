package encripta;

public class encriptaCesar implements Encripta{
    public void encripta(String s){
        StringBuilder encritado = new StringBuilder();
        int codigo = 5 % 26;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if ((s.charAt(i) + codigo) > 'z') {
                    encritado.append((char) (s.charAt(i) + codigo - 26));
                } else {
                    encritado.append((char) (s.charAt(i) + codigo));
                }
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                if ((s.charAt(i) + codigo) > 'Z') {
                    encritado.append((char) (s.charAt(i) + codigo - 26));
                } else {
                    encritado.append((char) (s.charAt(i) + codigo));
                }
            }
        }

        System.out.println(encritado.toString());

    }
    public void desencripta(String s){
        StringBuilder desencriptado = new StringBuilder();
        int codigo = 5 % 26;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if ((s.charAt(i) - codigo) < 'a') {
                    desencriptado.append((char) (s.charAt(i) - codigo + 26));
                } else {
                    desencriptado.append((char) (s.charAt(i) - codigo));
                }
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                if ((s.charAt(i) - codigo) < 'A') {
                    desencriptado.append((char) (s.charAt(i) - codigo + 26));
                } else {
                    desencriptado.append((char) (s.charAt(i) - codigo));
                }
            }
        }

        System.out.println(desencriptado.toString());

    }
}
