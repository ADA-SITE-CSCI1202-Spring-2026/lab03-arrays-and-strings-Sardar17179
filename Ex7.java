public class Ex7 {
    public  static StringBuilder stringReverser(String string) {
        StringBuilder reversedString = new StringBuilder();
        for(int i=0;i<string.length();i++){
            reversedString.append(string.charAt(i));
        }
        return reversedString;

    }
}
