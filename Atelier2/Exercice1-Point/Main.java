package Point;
public class Main {
    public static void main(String[] args){
        //exercice1 -- Point.
        Point A=new Point(2,3);
        A.afficher();
        A.deplacer(1,1);
        A.afficher();
        A.setX(4);
        A.setY(6);
        A.afficher();
        System.out.println(A.distance() +" "+ A.getX() +" "+ A.getY());
        A.rotation(45);
        A.afficher();
        A.homothetie(2);
        A.afficher();

    }
}
