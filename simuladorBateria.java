package desafios;

public class simuladorBateria {

    public static void main(String[] args) {

        int bateria = 100;
        int minutos = 0;
        
        while (bateria > 0) {
            bateria -= 7;
            minutos++;
        }
        
        System.out.println("Sua bateria durou " + minutos + " minutos usando o TikTok.");
    }
}