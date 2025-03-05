import java.util.Scanner;

class CountVovels {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str=scanner.nextLine();
    int count=0;
    for(char c:str.toCharArray()){
        if(c=='a' || c=='e' || c=='i' || c== 'o' || c== 'u'){
            count++;
        }
    }
    System.out.println("Number of vowels in the given string: "+count);
    scanner.close();
}
}