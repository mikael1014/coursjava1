package coursjava;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class CoursJava {

    /**
     * @param args the command line arguments
     */
    //public static Scanner sc = new Scanner(System.in);

    public static String[] ajoutePersoneAuTableau(String nomPersonne, String[] tableauGroupNom) {
        String[] newtableauGroupNom;
        newtableauGroupNom = new String[tableauGroupNom.length + 1];
        if (0 < tableauGroupNom.length) {
            for (int i = 0; i < tableauGroupNom.length; i++) {
                newtableauGroupNom[i] = tableauGroupNom[i];
            }
        }
        newtableauGroupNom[newtableauGroupNom.length - 1] = nomPersonne;
        //tableauGroupNom = newtableauGroupNom;
        return newtableauGroupNom;
    }

    public static void afficherTableau(String[] tableauGroupNom2) {
        for (String ligne : tableauGroupNom2) {
            System.out.print(ligne + " ,\n");
        }
        System.out.println("");
    }

    public static boolean choixuser(Scanner sc) {
        System.out.println("Voulez vous enter un nouveau nom? \n 0 : oui \n N : Non");
        //Scanner sc = new Scanner(System.in);
        String reponse = sc.nextLine();
        char choixu = reponse.charAt(0);
        boolean boolu = true;
        boolu = choixu == 'O' || choixu == 'o';
        String ajoutNom;
        ajoutNom = boolu ? "\nSasir un nouveau nom" : "\nFin de la saisie de nom";
        System.out.println("Votre reponse est : " + choixu + " " + ajoutNom);
        return reponse.toUpperCase().charAt(0) == 'O';
    }

    public static void lancementAppli() {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        String nom;
        //String ajoutNom; //= bool ? "Sasir un nouveau nom" : "Fin de la saisie de nom";

        //String reponse;// = sc.nextLine();
        //char choix = ' ';// = reponse.charAt(0);
        //Declarons les groupes vouyelle et consonne
        //int nbrGroupe1 = 0;
        //int nbrGroupe2 = 0;
        String[] groupe1;
        groupe1 = new String[0];
        String[] groupe2;
        groupe2 = new String[0];
        //String[] newgroupe1;
        //String[] newgroupe2;
        //newgroupe1 = new String[groupe1.length+ 1];
        //newgroupe2 = new String[groupe2.length+ 1];
        //char premierelettre = nom.toLowerCase().charAt(0);
        do {
            System.out.println("Comment vous appellez vous?");
            nom = sc.nextLine();

            System.out.println("Bonjour " + nom + " :");
            char premierelettre = nom.toLowerCase().charAt(0);
            switch (premierelettre) {

                case 'a','e','i','o','u','y':

                    //nbrGroupe1++;
                    //groupe1 = new String[nbrGroupe1];
                    groupe1 = ajoutePersoneAuTableau(nom, groupe1);
                    /*newgroupe1 = new String[groupe1.length + 1];
                    for (int i = 0; i < groupe1.length; i++) {
                        newgroupe1[i] = groupe1[i];
                    }

                    newgroupe1[groupe1.length] = nom;
                    groupe1 = newgroupe1;*/
                    System.out.println("Vous etes du groupe 1 car votre nom commence par une voyelle");
                    break;

                //case 2:
                default:
                    groupe2 = ajoutePersoneAuTableau(nom, groupe2);

                    /*newgroupe2 = new String[groupe2.length + 1];
                    for (int i = 0; i < groupe2.length; i++) {
                        newgroupe2[i] = groupe2[i];
                    }

                    newgroupe2[groupe2.length] = nom;
                    groupe2 = newgroupe2;*/
                    System.out.println("Vous etes du groupe 2 car votre nom commence par une consone");
                    break;

            }
            bool = choixuser(sc);            
            System.out.println(" ");
            //System.out.println("Voulez vous enter un nouveau nom? \n 0 : oui \n N : Non");
            //reponse = sc.nextLine();
            //choix = reponse.charAt(0);
            //bool = choix == 'O' || choix == 'o';
            //ajoutNom = bool ? "\nSasir un nouveau nom" : "\nFin de la saisie de nom";
            //System.out.println("Votre reponse est : " + choix + " " + ajoutNom);

        } while (bool);

        //Affichons les membres des 2 groupes
        System.out.println("Voici la composition des groupes");
        System.out.println("Groupe 1 pour les voyelles :");
        afficherTableau(groupe1);

        System.out.println("Groupe 2 pour les consones :");
        afficherTableau(groupe2);

        /*        System.out.println(nom + " Quel est votre age?");
        //String age= ag.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String majorite;
        if (age >= 18) {
            majorite = "majeur";
        } else {
            majorite = "mineur";
        }
        System.out.println(nom + " vous etes " + majorite + " car votre age est de " + age + " ans");

        System.out.println("Voulez-vous aller en pause? \n 0 : oui \n N : Non");
        reponse = sc.nextLine();
        choix = reponse.charAt(0);
        System.out.println("Réponse : " + choix);

        //System.out.println("FIN ! ");
        bool = choix == 'O' || choix == 'o';

        String statutCours = bool ? "En pause" : "En cours";

        if (bool) {
            //Execution si condition rempli
            System.out.println("Ok debut de la pause ");
            System.out.println("Statut du Cours : " + statutCours);
        } else {
            //condition non rempli
            System.out.println("Continions le cours ! ");
            System.out.println("Statut du cours : " + statutCours);

        }

         */
 /*public static void lireDansUnFichierLigneParLigne() throws FileNotFoundException, IOException {
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("fichier1.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        
        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            
            line = br.readLine();
        }
        
//créer le fichier en UTF8
            PrintWriter writer = creerFichierUtf8("fichier1.txt");
            
            char choix = 'O';
            do {
                System.out.print("Veuillez-saisir le nom à enregistrer : ");
                String nom = sc.nextLine();

                //écrire dans le fichier
                ecrireUnNomDansUnFichier(writer, nom);
                
                System.out.println("Voulez-vous continuer la saisie ?\n   O : oui\n   N : Non");
                choix = sc.nextLine().toUpperCase().charAt(0);
            }
            while(choix != 'N');
            
            //fermer le fichier
            fermerFichier(writer);
            
            //lire le fichier pour vérifier
            lireDansUnFichierLigneParLigne();
         */
    }

    public static void main(String[] args) {
        lancementAppli();
        /*test
        String[] groupei;
        groupei = new String[3];
        groupei=ajoutePersoneAuTableau("nom", groupei);
         groupei=ajoutePersoneAuTableau("nom2", groupei);
         groupei=ajoutePersoneAuTableau("nom3", groupei);
        afficherTableau(groupei);
         */
        // Je vais apprendre du java
        //byte temperature;
        //temperature = 64;
        //System.out.println(temperature);
        //char Caractere = 'B';
        //int a = 15;
        //int b = 2;
        //double resultat = a / b;
        //double resultat2 = (double) a / b;
        //a += 3;
        //System.out.println(a);
        //a++;
        //++a;
        //System.out.println(a++);
        //System.out.println(a);
        // d'abord a est affiché puis il fait incrementation contraiment a ++a
        //1 les operateur sont converti sur type le plus fort puis
        //2 operation faite sur type le plus fort puis                                                                    
        //3 type du resultat resultat 
        // donc division
        //System.out.println(resultat);
        //System.out.println(resultat2);

        /*int taleauEntier[] = {0,1,2,3,4,5,6,7,8,9,10};
         int lesNombres[][] = { 
                {0,2,4,6,8},
                {1,3,5,7,9},
                {1,0,0,2,0},
            };
         */
    }

}
