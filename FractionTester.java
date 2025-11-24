
public class FractionTester {
public static void main(String[] args) {

        final double PI = 3.14159;
        
        // public void tryChange() {
        //     PI = 4;
        // }

        // System.out.println(tryChange);
        
        Fraction f = new Fraction(3, 4);
        Fraction g = new Fraction(f);  
        Fraction n = f; 
        Fraction h = new Fraction(6, 8); 

        System.out.println(f);
        System.out.println(g);
        System.out.println(n);
        System.out.println(h);
        System.out.println();

        System.out.println(f == g); 
        System.out.println(f == n); 
        System.out.println();

        System.out.println(f.equals(g)); 
        System.out.println(f.equals(h)); 
        System.out.println();


        Fraction sumStatic = Fraction.add(f, h);
        System.out.println("Statische Addition  = " + sumStatic);
        System.out.println();


        f.add(h);  
        System.out.println("Dynamische Addition = " + f);
        System.out.println();

        System.out.println("Anzahl Fraction-Objekte: " + Fraction.numberOfFractions);
        System.out.println(PI);
    }

    }


