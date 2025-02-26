public class Average {
    public static void main(String[] args) {
        int averageOfTenMembers= new Average().tenPersonAverage(5,4,72,26,24,73,83,14,1,4);
        System.out.println(averageOfTenMembers);

    }
    int tenPersonAverage(int n1,int n2,int n3,int n4,int n5,int n6,int n7,int n8,int n9,int n10){
        int averageOfTenMembers=(n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10;
        return averageOfTenMembers;
    }
}
