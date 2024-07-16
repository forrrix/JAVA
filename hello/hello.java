public class MyLoops {
    
    public static void main(String[] args) {
        
        //TODO: Créez une boucle "for" qui affiche la phrase "I am having so much fun!" 5 fois
        int i = 0 ;
        while (i < 5){
        	i += 1;
            if  (i ==4){
            continue;
        }
            System.out.println("I am having so much fun!");
        }
    }
}