public class StringMethod {
    public static void main (String[] args){
        String name = "Hello Everyone, How was your day?";

        // 1. length
        System.out.println("Hasilnya dari method length adalah :" + name.length());

        // 2. substring
        System.out.println("Hasilnya dari method substring adalah :" + name.substring(5,8));
        System.out.println("Hasilnya dari method substring adalah :" + name.substring(5, name.length()));
        
        // 3. charAt
        System.out.println("Hasilnya dari method charArt adalah huruf :" + name.charAt(7));
        
        // 4. toLowerCase
        System.out.println("Hasilnya dari method toLowerCase adalah :" + name.toLowerCase());
        
        // 5. toUpperCase
        System.out.println("Hasilnya dari method toUPperCase adalah :" + name.toUpperCase());
        
        // 6. replace
        System.out.println("Hasilnya dari method replace (karakter) adalah :" + name.replace('a','u'));
        System.out.println("Hasilnya dari method replace (kata) adalah :" + name.replace("your","my"));
        
        // 7. contains
        System.out.println("Hasilnya dari method contains (was)  adalah :" + name.contains("was"));
        System.out.println("Hasilnya dari method contains (were) adalah :" + name.contains("were"));
        
        // 8. equals
        System.out.println("Hasilnya dari method equals (semua karakter sama huruf besar dan kecilnya) adalah :" + name.equals("Hello Everyone, How was your day?"));
        System.out.println("Hasilnya dari method equals (semua karakter tidak sama huruf besar dan kecilnya) adalah :" + name.equals("Hello Everyone How was your day?"));
        
        // 9. equalsIgnoreCase
        System.out.println("Hasilnya dari method equalsIgnoreCase adalah :" + name.equalsIgnoreCase("Hello EverYone, How wAs your day?"));
        
        // 10. endsWith
        System.out.println("Hasilnya dari method endsWith adalah :" + name.endsWith("?"));
        System.out.println("Hasilnya dari method endsWith adalah :" + name.endsWith("s"));
        System.out.println("Hasilnya dari method endsWith adalah :" + name.endsWith("your"));

    }
}