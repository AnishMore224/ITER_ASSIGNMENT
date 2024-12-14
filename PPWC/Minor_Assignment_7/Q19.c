#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct address_t{
    int xx,yy,zz,mm;
    char nick[10];
};
int scan_address(struct address_t a[]){
    int i=0;
    while(1){
        scanf("%d.%d.%d.%d %s",&a[i].xx,&a[i].yy,&a[i].zz,&a[i].mm,a[i].nick);
        if(a[i].xx==0 && a[i].yy==0 && a[i].zz==0 && a[i].mm==0){
            break;
        }
        i++;
    }
    return i;
}

void print_address(struct address_t a[],int n){
    for(int i=0;i<n;i++){
        printf("%d.%d.%d.%d %s\n",a[i].xx,a[i].yy,a[i].zz,a[i].mm,a[i].nick);
    }
}

int local_address(struct address_t a1,struct address_t a2){
    if(a1.xx==a2.xx && a1.yy==a2.yy){
        return 1;
    }
    return 0;
}

int main(){
    struct address_t a[100];
    int n=0;
    n=scan_address(a);
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(local_address(a[i],a[j])){
                printf("Machines %s and %s are on the same local network.\n",a[i].nick,a[j].nick);
            }
        }
    }
    printf("Complete list of addresses and nicknames:\n");
    print_address(a,n);
    return 0;
}

/*
Output--
111.22.3.44 platte
555.66.7.88 wabash
111.22.5.66 green
0.0.0.0 none
Machines platte and green are on the same local network.
Complete list of addresses and nicknames:
111.22.3.44 platte
555.66.7.88 wabash
111.22.5.66 green
*/