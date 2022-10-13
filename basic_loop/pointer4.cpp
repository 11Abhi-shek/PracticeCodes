#include<iostream>
using namespace std;
// factorial of a number
//int main()
//{
//	int n1=1,n2;
//	int *fact=&n1;
//	cout<<"enter N2=";
//	cin>>n2;
//		cout<<"factorial of "<<n2<<"is =";
//	while(n2>0)
//	{
//		*fact=*fact*n2;
//		n2--;
//	}
//cout<<*fact<<endl;
//	
//	return 0;
//}
	
	int main()
	{
		int n,rev=0;
		cin>>n;
		int *p=&n;
		int *p1=&rev;
		while(n>0)
		{
			int rem=*p%10;
			rev=rev*10+rem;
			*p=*p/10;
			//cout<<n;
		}
		
		cout<<rev;
		return 0;
	}
	
