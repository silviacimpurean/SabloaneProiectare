package Elements;

import Useri.DocumentVisitor;

public class Main {

    public static void main(String args[]){

    	
       
        Carte carte = new Carte("Fratii Jderi");
        
       
        Sectiune sectiune = new Sectiune("Sectiune : SF");
        sectiune.add(new Paragraf("Paragraf 1", "Inceputuri"));
        sectiune.add(new Tabel("Tabel"));
        sectiune.add(new Paragraf("Paragraf 2", "Pe la mijloc"));
       
        sectiune.add(new Paragraf("Paragraf 3", "Alea alea"));
        Imagine imagine = new Imagine("Imagine1");
        Imagine image2 = new Imagine("Imagine2");
        ImageProxy imageProxy = new ImageProxy("ImagProxy");
        
        
        SpecialArt special = new SpecialArt("ACESTA ESTE TEXTUL SPECIAL");
        carte.addElement(special);

       
        
        carte.addElement(sectiune);
       
        //carte.addElement();
        carte.addElement(imagine);
        carte.addElement(image2);
        carte.addElement(imageProxy);


        DocumentVisitor dsv = new DocumentVisitor();
        carte.acceptVisitor(dsv);
        dsv.printStatistics();
        carte.print();
    }
    

}
