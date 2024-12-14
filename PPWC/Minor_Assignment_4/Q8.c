#include <stdio.h>

int main(void){
    int arr[10] = {0, 10, 20,30, 40, 50,60, 70, 80,90};
    int size = sizeof(arr) / sizeof(arr[0]);
    for (int i = 0; i < size; i++){
        printf("%u -> %d\n", &arr[i], arr[i]);
    }
}

/*
Output--
6422256 -> 0
6422260 -> 10
6422264 -> 20
6422268 -> 30
6422272 -> 40
6422276 -> 50
6422280 -> 60
6422284 -> 70
6422288 -> 80
6422292 -> 90
*/