package janani;

public class Amstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,sum=0,a,count=0;
for(i=360;i<380;i++){
	n=i;
	while(n!=0){
		a=n%10;
		sum=sum+(a*a*a);
		n=n/10;
		count ++;
	}
	if(sum==i){
		System.out.println(i+" ");
	}
	//else{
		sum=0;
	}
}
	}


