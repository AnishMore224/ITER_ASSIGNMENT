#include <stdio.h>
#include <stdlib.h>
typedef struct node{
    int data;
    struct node *next;
}Node;

Node *head=NULL;

void sort(){
    Node *p=head;
    while(p!=NULL){
        Node *q=p->next;
        while(q!=NULL){
            if(p->data>q->data){
                int temp=p->data;
                p->data=q->data;
                q->data=temp;
            }
            q=q->next;
        }
        p=p->next;
    }
}

void display(){
    Node *p=head;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
    printf("\n");
}

int main(){
    int n;
    printf("Enter the number of nodes: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        Node *temp=(Node*)malloc(sizeof(Node));
        printf("Enter the data for node %d: ",i+1);
        scanf("%d",&temp->data);
        temp->next=NULL;
        if(head==NULL){
            head=temp;
        }
        else{
            Node *p=head;
            while(p->next!=NULL){
                p=p->next;
            }
            p->next=temp;
        }
    }
    printf("Before sorting: ");
    display();
    sort();
    printf("After sorting: ");
    display();
    return 0;
}

/*
Output--
Enter the number of nodes: 5
Enter the data for node 1: 3
Enter the data for node 2: 2
Enter the data for node 3: 7
Enter the data for node 4: 1
Enter the data for node 5: 2
Before sorting: 3 2 7 1 2 
After sorting: 1 2 2 3 7
*/