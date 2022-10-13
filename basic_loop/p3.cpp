#include<iostream>
using namespace std;

int main()
{
	cout<<"enter N=";
	int n;
	cin>>n;
	int fact=1;
	if(n<0)
	{
		cout<<"factorial doesnot exits";
	}
	else if(n==0 || n==1)
	{
		cout<<1;
	}
	else{
		
			for(int i=n;i>=1;i--)
			{
				fact=fact*i;
			}
//			while(n>1)
//			{
//				fact=fact*n;
//				n--;
//				//cout<<fact;
//			}
			cout<<"factorial of"<<n<<"="<<fact<<endl;
	}
	return 0;

}
