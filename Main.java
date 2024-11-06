//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Etudiant[] T_etudiants = new Etudiant[5];
        T_etudiants[0]= new Etudiant("alice","ali",14);
        T_etudiants[1]= new Etudiant("bob","bob",16);
        T_etudiants[2]= new Etudiant("carla","jane",12);
        T_etudiants[3]= new Etudiant("david","david",15);
        T_etudiants[4]= new Etudiant("emma","john",18);

        for (int i = 0; i < T_etudiants.length; i++) {
            T_etudiants[i].affiche();
        }
       int nbr_etudiants = T_etudiants.length;
        System.out.println("nbre de etudiant est:"+nbr_etudiants);
        for (int i = 0; i < nbr_etudiants; i++) {
            if (T_etudiants[i].getNom().equals("carla")){
                T_etudiants[i].setNote(13);
            }
        }
        T_etudiants[2].affiche();
        boolean misajour = false;
        for (int i = 0; i < T_etudiants.length; i++) {
            if (T_etudiants[i].getNom().equals("alice")){
                T_etudiants[i].setNote(19);
            }

        }
        misajour = true;
        System.out.println("Mise a jour:"+misajour);
        Etudiant e1=new Etudiant("lucqs","marc",17);
        System.out.println("les information de etudiant e1 est ");
        e1.affiche();
        Etudiant e2=new Etudiant("chloe","lea",10);
System.out.println("le prenom de l  etudiant e2 est "+e2.getPrenom());





    }
}