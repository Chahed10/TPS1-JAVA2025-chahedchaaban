import java.util.*;
public class ex1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
// partie A
        ArrayList<Integer>notes=new ArrayList<>();
        int n;
        do { 
            System.out.println("donner la note n");
             n=sc.nextInt();
        } while (n<0);

        for (int i = 0; i < n; i++) {
            int note;
            do {
                System.out.print("Donner la note " + (i + 1));
                note = sc.nextInt();
            } while (note < 0 || note > 20);
            notes.add(note);
        }

         System.out.println(" Liste des notes ");
        Iterator<Integer> itNotes = notes.iterator();
        while (itNotes.hasNext()) {
            System.out.print(itNotes.next() + " ");
        }

        System.out.println("La note maximale = "+Collections.max(notes));


        System.out.print("Donner la note a supprimer : ");
        int supp = sc.nextInt();
        if (notes.contains(supp)) {
            notes.remove((Integer)supp);
            System.out.println("Note supprimee.");
        } else {
            System.out.println("Note non trouvée.");
        }

         System.out.println("Notes apres suppression : " + notes);

        Collections.sort(notes);
        System.out.println("Notes triees : " + notes);

        System.out.println("Notes superieures a 18 :");
        Iterator<Integer> it2 = notes.iterator();
        while (it2.hasNext()) {
            int note = it2.next();
            if (note > 18) {
                it2.remove();
            System.out.print(note + " ");
        }
        }
        System.out.print("Donner une note a rechercher : ");
        int ch = sc.nextInt();
        int pos = notes.indexOf(ch);
        if (pos != -1){
            System.out.println("Note trouvee a la position : " + pos);
        }else{
            System.out.println("Note non trouvee.");
        }
 
       


       // partie B
       ArrayList<String> etudiants = new ArrayList<>();
        etudiants.add("Alia");
        etudiants.add("Samira");
        etudiants.add("Amira");

        System.out.print("Ajouter un nom d'étudiant : ");
        String nom = sc.nextLine();
        etudiants.add(nom);

        if (etudiants.contains("Samira")){
            System.out.println("Samira existe dans la liste.");
        }else{
            System.out.println("Samira n'existe pas.");
        }

        int oldnom = etudiants.indexOf("Alia");
        if (oldnom != -1)
            etudiants.set(oldnom, "Alia Ben Salah");

        System.out.print("Donner le nom a supprimer : ");
        int suppr = sc.nextInt();
        if (notes.contains(suppr)) {
            notes.remove(suppr);
            System.out.println("nom supprimee.");
        } else {
            System.out.println("nom non trouvée.");
        }
         System.out.println(" Liste des étudiants");
        for (String e : etudiants) {
            System.out.println(e);
        }
        Collections.sort(etudiants);
        System.out.println("Étudiants triés : " + etudiants);

    }

}