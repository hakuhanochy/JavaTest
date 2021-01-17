public class Ex3 {
  public static void main (String[] args) {

    
        String s = "Мама пошла в магазин"; 
     
        
        int len = s.split(" ").length;
        System.out.println( "Длина строки (" + s +") - " + len + " слов(а).");
       
    char[] chars = s.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        s = new String(chars);
        System.out.println(s);
   
}
}
     
