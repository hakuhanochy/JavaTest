public class Ex4 {

   public static int substringCount(String predl, String slovo) {
  
        int result = 0;
        for (int i = 0; i < predl.length(); i++) {
            if (predl.substring(i, i + slovo.length()).equalsIgnoreCase(slovo)) {
                result++;
                i += slovo.length();
            }
        }
        return result;
    }
   
    public static void main (String[] args) {
        String predl = "�����������!- ����� ����, ����� ������� � ���� ��� �����!";
        String slovo = "�����";
        System.out.println("� ����������� " + predl + " ����� " + slovo + " ����������� " + substringCount(predl, slovo) + " ���(�).");
    }
}