#include<iostream>
using namespace std;
//call by reference 

//int swap(int *a,int *b) // swapping by pointer reference 

void swapReferenceVar(int &a,int &b)

{
//	int temp=*a;
//	*a=*b;
//	*b=temp;
int temp=a;
a=b;
b=temp;
}
int main()
{
	int x,y;
	cout<<"enter X="<<endl;
	cin>>x;
	cout<<"enter Y="<<endl;
	cin>>y;
	
	cout<<"values before swap="<<x<<","<<y<<endl;
	//swap(&x,&y);// swapping by pointer reference
	swapReferenceVar(x,y);
	cout<<"values after swap="<<x<<","<<y<<endl;
}
