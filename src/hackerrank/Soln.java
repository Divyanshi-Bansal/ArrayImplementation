package hackerrank;

public class Soln {
    public static void solution (int n,int s, int []arr,int[]arr1,int []arr2) {
        int j=0;
        for(int i=0;i<s;i++){
            if(arr[i]==n){
                arr1[j]=arr[i];
                j++;
            }
        }
        for(int z=0;z<s;z++){
            for(int o=0;o<arr1.length;o++){
                if (arr[z]!=arr1[o]){
                    arr2[z]=arr[z];
                }
            }
        }
        int r=0;
        for(int w=j;w<s-j-1;w++){
            for(int u=0;u<j;u++){
                arr[u]=arr1[u];
            }
            arr[j]=arr2[r];
            r++;
        }
        for(int q=0;q<s;q++){
            System.out.print(arr2[q]+" ");
        }
    }
}
