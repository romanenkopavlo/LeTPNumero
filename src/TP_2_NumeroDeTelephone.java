import clavier.In;

public class TP_2_NumeroDeTelephone {
    public static void main(String[] args) {
        String numero = null, indicatif = null, laZoneDepartementale = null;
        String region = null, zone = null, operateur = null;

        System.out.print("Entrez votre numero: ");
        numero = new String(In.readString());
        indicatif = new String(numero.substring(0, 2));
        laZoneDepartementale = new String(numero.substring(0, 4));


        switch (indicatif) {
            case "01":
                region = new String("Parisienne");
                break;
            case "02":
                region = new String("Nord Ouest");
                break;
            case "03":
                region = new String("Nord Est");
                break;
            case "04":
                region = new String("Sud Est");
                break;
            case "05":
                region = new String("Sud Ouest");
        }
        switch (laZoneDepartementale) {
            case "0134":
                zone = new String("Yyvelines ou Val-d'Oise");
                break;
            case "0139":
                zone = new String("Yyvelines");
                break;
            case "0140":
            case "0142":
            case "0143":
            case "0144":
            case "0145":
            case "0146":
                zone = new String("Paris");
                break;
            case "0141":
                zone = new String("Hautes-de-Seines ou Val d'Oise");
                break;
            case "0214":
                zone = new String("Calvados ou Manche ou Orne");
                break;
            case "0231":
                zone = new String("Calvados");
                break;
            case "0238":
                zone = new String("Loiret");
                break;
            case "0320":
                zone = new String("Nord");
                break;
            case "0322":
                zone = new String("Somme");
                break;
            case "0351":
            case "0352":
                zone = new String("Ardennes");
                break;
            case "0415":
                zone = new String("Allier");
                break;
            case "0426":
            case "0427":
                zone = new String("Ain");
                break;
            case "0456":
            case "0457":
                zone = new String("Isere");
                break;
            case "0516":
            case "0517":
                zone = new String("Charente");
                break;
            case "0533":
                zone = new String("Dordogne");
                break;
            case "0556":
            case "0557":
                zone = new String("Gironde");
                break;
            case "0590":
                zone = new String("Guadeloupe");
                break;
            case "0596":
                zone = new String("Martinique");
                break;
            case "0594":
                zone = new String("Guyane");
                break;
        }
        switch (laZoneDepartementale) {
            case "0601":
                operateur = new String("Neuf Cegetel");
                break;
            case "0605":
                operateur = new String("Auchan Telecom");
                break;
            case "0609":
            case "0610":
            case "0611":
            case "0612":
            case "0613":
            case "0614":
            case "0615":
            case "0616":
            case "0617":
            case "0618":
            case "0619":
            case "0620":
            case "0621":
            case "0622":
            case "0623":
            case "0624":
            case "0626":
            case "0627":
            case "0628":
            case "0629":
            case "0635":
            case "0646":
            case "0655":
                operateur = new String("SFR");
                break;
            case "0607":
            case "0608":
            case "0630":
            case "0631":
            case "0632":
            case "0633":
            case "0634":
            case "0637":
            case "0642":
            case "0643":
            case "0645":
            case "0654":
            case "0670":
            case "0671":
            case "0672":
            case "0673":
            case "0674":
            case "0675":
            case "0676":
            case "0677":
            case "0678":
            case "0679":
            case "0680":
            case "0681":
            case "0682":
            case "0683":
            case "0684":
            case "0685":
            case "0686":
            case "0687":
            case "0688":
            case "0689":
                operateur = new String("Orange");
                break;
            case "0650":
            case "0653":
            case "0658":
            case "0659":
            case "0660":
            case "0661":
            case "0662":
            case "0663":
            case "0664":
            case "0665":
            case "0666":
            case "0667":
            case "0668":
            case "0669":
            case "0698":
            case "0699":
                operateur = new String("Bouygues Telecom");
                break;
        }

        if (indicatif.equals("06")) {
            System.out.print("Votre operateur: " + operateur);
        } else if (indicatif.equals("07")) {
            System.out.print("C'est un numero portable");
        } else {
            System.out.print("Vous etes dans la region " + region + ". Votre zone est: " + zone);
        }
    }
}
