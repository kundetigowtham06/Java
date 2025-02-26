import java.util.*;
public class EditDistance{
    public static int minDistance(String X,String Y){
        int n=X.length();
        int m=Y.length();
        int c[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            c[i][0]=i;
        }
        for(int j=0;j<=m;j++){
            c[0][j]=j;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(X.charAt(i-1)==Y.charAt(j-1)){
                    c[i][j]=c[i-1][j-1];
                }
                else{
                    c[i][j]=Math.min(c[i-1][j-1]+2,Math.min(c[i][j-1]+1,c[i-1][j]+1));
                }
            }
        }
        return c[n][m];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String X:");
        String x=sc.nextLine();
        System.out.println("Enter String Y:");
        String y=sc.nextLine();
        System.out.println("Minimum cost:"+minDistance(x, y));
    }
}
