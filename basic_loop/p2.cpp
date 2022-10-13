#include<iostream>
using namespace std;

int main()
{
	int i=1,n,sum=0;
	cout<<"enter the value of n=";
	cin>>n;
	while(i<=10)
	{
		cout<<n<<"*"<<i<<"="<<n*i<<endl;
		i++;
		sum+=n*i;
	}
	cout<<"sum="<<sum;
	
//cout<<"sum of first 10 N numbers=";
//while(i<=10)
//{
//	sum+=i;
//	i++;
//}
//cout<<sum;
//
//do{
//	sum+=i;
//	i++;
//}while(i<=10);
//cout<<sum;

	return 0;
}
