public class Etudiant {
    private String nom;
    private String prenom;
    private int note;
    public Etudiant(String nom, String prenom, int note) {
        this.nom = nom;
        this.prenom = prenom;
        this.note = note;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        if (note >=0 && note <= 20){
        this.note = note;}else {
            System.out.println(" enter Le note  entre 0 est 20");
        }
    }
    public void affiche() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Note: " + note);

    }



















}
