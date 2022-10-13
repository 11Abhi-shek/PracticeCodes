#include<iostream>
using namespace std;

int main()
{
	int i,j,n;
	cout<<"enter N=";
	cin>>n;
//	for(i=0;i<n;i++)
//	{
//		for(j=0;j<=i;j++)
//		{
//			cout<<"*";
//		}
//		cout<<endl;
//	}
//
for(i=1;i<=n;i++)
	{
		for(j=i;j<=2*i-1;j++)
		{
			cout<<j;
		}
		cout<<endl;
	}

//int n1=1;
//for(i=1;i<=n;i++)
//{
//	for(j=1;j<=i;j++)
//	{
//		cout<<n1;
//		n1++;
//	}
//	cout<<endl;
//}
	return 0;
}

