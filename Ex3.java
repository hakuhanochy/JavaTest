public class Ex3 {
  public static void main (String[] args) {

    
        String s = "���� ����� � �������"; 
     
        
        int len = s.split(" ").length;
        System.out.println( "����� ������ (" + s +") - " + len + " ����(�).");
       
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
     
