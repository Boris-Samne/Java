package Atelier1;

public class Exercices {
    public static void main(String[] args) {
        // Ex1();
        // Ex2();
        // Ex3();
        // Ex4();
        // Ex6();
        // Ex6_1();
        // Ex7();
        // int tab[] = { 0, 20, 1, 2, 3, 4, 5, 6, 7 };
        // Ex8(tab);
        // Ex9();
        // Ex11();
        // Ex12();
        // Ex13();
        Ex13_1();

    }

    public static void Ex1() {
        System.out.println("Ex1\n");
        int a = 1, b = 2, c = 3, x = 4, y = 5, z = 6, n = 7, p = 8;
        // la Première expression est celle reformulée..
        // sans les parenthèses et la deuxieme est celle de base
        System.out.println((a + b - 2 * c) == ((a + b) - (2 * c)));
        System.out.println((2 * x / (y * z)) == ((2 * x) / (y * z)));
        System.out.println(((x + 3) * (n % p)) == ((x + 3) * (n % p)));
        System.out.println((a / (b + c)) == (-a) / (-(b + c)));
        System.out.println((-(x / y) % z) == (x / y) % (-z));
        System.out.println((-x / (y % z)) == x / (y % (-z)));
        System.out.println("\n");
    }

    public static void Ex2() {
        System.out.println("Ex2\n");
        byte b1 = 10, b2 = 20;
        short p = 200;
        int n = 500;
        long q = 100;
        float x = 2.5f;
        // double y = 5.25;
        System.out.println("1- b1 + b2=" + (b1 + b2));
        printType((b1 + b2));

        System.out.println("2- p + b1=" + (p + b1));
        printType((p + b1));

        System.out.println("3- b1 * b2 =" + (b1 * b2));
        printType(b1 * b2);

        System.out.println("4- q + p * (b1 + b2) =" + (q + p * (b1 + b2)));
        printType((q + p * (b1 + b2)));

        System.out.println("5- x + q * n=" + (x + q * n));
        printType((x + q * n));

        System.out.println("6- b1 * q / x =" + (b1 * q / x));
        printType(b1 * q / x);

        System.out.println("7- b1 * q * 2. / x =" + (b1 * q * 2. / x));
        printType(b1 * q * 2. / x);

        System.out.println("8-b1 * q * 2.f / x =" + (b1 * q * 2.f / x));
        printType(b1 * q * 2.f / x);
    }

    public static void printType(Object variable) {
        Class<?> type = variable.getClass();
        System.out.println("Type: " + type.getName() + "\n");
    }

    public static void Ex3() {
        System.out.println("Ex3");
        char c = 60, ce = 'e', cg = 'g';
        byte b = 10;

        System.out.println("1- c + 1=" + (c + 1));
        printType((c + 1));

        System.out.println("2- 2 * c=" + (2 * c));
        printType((2 * c));

        System.out.println("3- cg - ce=" + (cg - ce));
        printType((cg - ce));

        System.out.println("4- b * c =" + (b * c));
        printType((b * c));

        System.out.println("\n");
    }

    public static void Ex4() {
        int i = 10, j = 5;
        if (i < 5 && j++ < 10)
            System.out.println("&&1 vrai");
        else
            System.out.println("&&1 faux");
        System.out.println("i = " + i + " j = " + j);
        if (i < 5 & j++ < 10)
            System.out.println("& vrai");
        else
            System.out.println("& faux");
        System.out.println("i = " + i + " j = " + j);
        if (i < 15 && j++ < 10)
            System.out.println("&&2 vrai");
        else
            System.out.println("&&2 faux");
        System.out.println("i = " + i + " j = " + j);
        if (i < 15 || j++ < 10)
            System.out.println("|| vrai");
        else
            System.out.println("|| faux");
        System.out.println("i = " + i + " j = " + j);
    }

    public static void Ex5() {
        int n = 10, p = 5, q = 10;
        System.out.println("A: n = " + n + " p = " + p + " q = " + q);
        n = p = q = 5;
        System.out.println("A: n = " + n + " p = " + p + " q = " + q);
        n += p += q;
        System.out.println("A: n = " + n + " p = " + p + " q = " + q);
        q = n < p ? n++ : p++;
        System.out.println("B: n = " + n + " p = " + p + " q = " + q);
        q = n > p ? n++ : p++;
        System.out.println("C: n = " + n + " p = " + p + " q = " + q);
    }

    public static void Ex6() {
        int heure = Integer.parseInt(System.console().readLine("Entrer le nombre d'heures\n"));
        float minutes = Integer.parseInt(System.console().readLine("Entrer le nombre de minutes svp\n"));
        float heure_dec = heure + minutes / 60;
        System.out.println("Le nombre decimal d'heures est " + heure_dec);
        printType(heure_dec);
    }

    public static void Ex6_1() {
        float heure_dec = Float
                .parseFloat(System.console().readLine("Entrer la valeur decimale de l'heure avec les minutes\n"));
        int heures = (int) heure_dec;
        float minutes = (heure_dec - heures) * 60;
        System.out.println("Le nombre d'heures est " + heures + " et le nombre de minutes " + minutes);
        printType(heure_dec);
    }

    public static void Ex7() {
        float Deg_celcius = Float.parseFloat(System.console().readLine("Entrer la température en deg celcius svp\n"));
        float Deg_Fahrenheit = Deg_celcius * 9 / 5 + 32;
        System.out.println(Deg_celcius + " Celcius = " + Deg_Fahrenheit + " Fahrenheit ");

    }

    public static void Ex8(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        System.out.println("Le maximun du tableau est " + max);
    }

    public static void Ex9() {
        String car = System.console().readLine("Entrer le caractère en minuscules svp.\n");
        char car_maj = (char) (car.charAt(0) - 32);
        System.out.println("Le caractère en majuscules est " + car_maj);
    }

    public static void Ex10() {
        System.out.println("OpérationsArithmetiques");
        int nombre1 = Integer.parseInt(System.console().readLine("Entrer le premier nombre svp."));
        int nombre2 = Integer.parseInt(System.console().readLine("Entrer le second nombre svp. "));
        int operator = Integer.parseInt(System.console().readLine(
                "Faites le choix de l'opération svp\n 1-Addition\n 2-Soustraction \n 3-Multiplication \n 4-division"));

        switch (operator) {
            case 1:
                System.out.println(nombre1 + " + " + nombre2 + " = " + (nombre1 + nombre2));
                break;
            case 2:
                System.out.println(nombre1 + " - " + nombre2 + " = " + (nombre1 - nombre2));
                break;
            case 3:
                System.out.println(nombre1 + " * " + nombre2 + " = " + (nombre1 * nombre2));
                break;
            case 4:
                System.out.println(nombre1 + "/" + nombre2 + " = " + (nombre1 / nombre2));
                break;
            default:
                break;
        }
    }

    public static void Ex10_1() {
        System.out.println("OpérationsArithmetiques\n");
        int nombre1 = Integer.parseInt(System.console().readLine("Entrer le premier nombre svp.\n"));
        int nombre2 = Integer.parseInt(System.console().readLine("Entrer le second nombre svp. \n"));
        int operator = Integer.parseInt(System.console().readLine(
                "Faites le choix de l'opération svp\n 1-Addition\n 2-Soustraction \n 3-Multiplication \n 4-division\n"));

        if (operator == 1) {
            System.out.println(nombre1 + " + " + nombre2 + " = " + (nombre1 + nombre2));
        } else if (operator == 2) {
            System.out.println(nombre1 + " - " + nombre2 + " = " + (nombre1 - nombre2));
        } else if (operator == 3) {
            System.out.println(nombre1 + " * " + nombre2 + " = " + (nombre1 * nombre2));
        } else if (operator == 4) {
            System.out.println(nombre1 + " / " + nombre2 + " = " + (nombre1 / nombre2));
        } else {
            System.out.println("Veuillez choisir une opération valide entre 1 et 4\n");
        }
    }

    public static void Ex11() {
        final int TAILLE = 5;
        int sum = 0, max = 0, min = 0, moy = 0;
        int[] tab = new int[TAILLE];
        for (int i = 0; i < TAILLE; i++) {
            tab[i] = Integer.parseInt(System.console().readLine(i + 1 + "-Entrer un nombre svp\n"));
        }

        for (int i = 0; i < TAILLE; i++) {
            min = tab[0];
            if (tab[i] < min)
                min = tab[i];

            sum += tab[i];

            moy = sum / (i + 1);

            if (tab[i] > max)
                max = tab[i];

        }
        System.out.println("Moyenne = " + moy + " Somme = " + sum + " Minimum = " + min + " Maximum = " + max);
    }

    public static void Ex12() {
        int nombre = Integer
                .parseInt(System.console().readLine("Entrer le nombre svp.\nTaper -1 pour stopper le programme\n"));
        if (nombre == -1) {
            System.exit(0);
        } else {
            for (int i = 2; i < nombre; i++) {
                if (nombre % i == 0) {
                    System.out.println(nombre + " est un multiple de " + i);
                }
            }
        }
    }

    public static void Ex13() {
        int taille = Integer.parseInt(System.console().readLine("Entrer la taille du tableau svp\n"));
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(".");
            }
            System.out.println("\n");
        }

    }

    public static void Ex13_1() {
        int taille;
        do {
            taille = Integer.parseInt(System.console().readLine("Entrer la taille de la Pyramide svp\n"));
        } while (taille % 2 == 0);

        int milieu = taille / 2;

        // Affichage du motif de pyramide
        for (int i = 0; i <= milieu; i++) {
            for (int j = 0; j < milieu - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}