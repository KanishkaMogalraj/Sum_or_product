#include<iostream>
using namespace std;

int main() {
	// Write your code here
	int n,choice,sum=0,pro=1;
    cin>>n;
    cin>>choice;
    if((n>=1) && (n<=12))
    {
    if(choice==1)
    {
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        cout<<sum;
    }
    else if(choice==2)
    {
        for(int i=1;i<=n;i++)
        {
            pro=pro*i;
        }
        cout<<pro;
    }
    else
    {
        cout<<"-1";
    }
    }
}
