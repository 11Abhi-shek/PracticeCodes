#include<iostream>
#include<math.h>
using namespace std;

int main()
{
	cout<<"enter N=";
	int n;
	cin>>n;
	int f=0;
	if(n<2){
		cout<<"No prime number";
	}
	else{
		for(int i=2;i<sqrt(n);i++)
		{
			if(n%i==0)
			{
				f=1;
			}
		}
		if(f==0)
		{
			cout<<"number "<<n<<"is prime."<<endl;
		}
		else{
			cout<<"number "<<n<<"is not peime."<<endl;
		}
		
	}	
return 0;
}
