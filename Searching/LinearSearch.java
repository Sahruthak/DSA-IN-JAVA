
class linearSearch{
public static int linear(int []arr,int target){
int n=arr.length;
for(int i=0;i<n;i++){
if(arr[i]==target) return i;
}
return -1;
}
}