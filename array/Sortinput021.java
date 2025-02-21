package array;

public class Sortinput021 {
    public static void main(String[] args) {
    int arr[]={1,1,1,1,0,0,0,2,2,2,2,1,1,1,0,0,0,0,0,1,2};
    int zeroCount=0;
    int oneCount=0;
    int twoCount=0;
    int arrnew[]= new int[arr.length];

    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            zeroCount++;
        }
        else if(arr[i]==1){
            oneCount++;
        }
        else if(arr[i]==2){
            twoCount++;
        }

        for(int j=0;j<zeroCount;j++){
            arr[j]=0;
        }
    }

    int count=0;
    for(int j=0;j<zeroCount;j++){
        arrnew[count++]=0;
    }
    for(int k=0;k<twoCount;k++){
        arrnew[count++]=2;
    }
    
    for(int l=0;l<oneCount;l++){
        arrnew[count++]=1;
    }

    for(int p:arrnew){
        System.out.print(p+" ");
    }
    

    
}
}