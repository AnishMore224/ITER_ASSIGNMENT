/*
Binary search
*/
#include <stdio.h>
#include <stdbool.h>
int binary_search(int a[], int size, int key);
int main(void){
    int a[] = {1,2,3,4,5,6,7,8,9,10};
    int key = 7;
    bool found = false;
    int low = 0, high = 9,index=-1;
    while(low<=high && !found){
        int mid = (low+high)/2;
        if(a[mid]==key){
            found = true;
            index = mid;
        }
        else if(a[mid]<key){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    if(!found){
        printf("The key is not found\n");
    }    else{
        printf("The key is found at index %d\n",index);
    }
    return 0;
}

/*
Output--
The key is found at index 6
*/
