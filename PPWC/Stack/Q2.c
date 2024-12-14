#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *next;
};

int isEmpty(struct Node *top);
void push(struct Node **top, int data);
int pop(struct Node **top);
void display(struct Node *top);

int main(void){
    struct Node *top = NULL;
    int ch=1,val;
    while (ch){
        printf("1.Push\n2.Pop\n3.Display the Stack\n4.Exit\n");
        int choice;
        printf("Enter your choice: ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                printf("Enter the element to push: ");
                int data;
                scanf("%d",&data);
                push(&top,data);
                break;
            case 2:
                val=pop(&top);
                if(val!=-1)
                    printf("Popped element is: %d\n",val);
                break;
            case 3:
                display(top);
                break;
            case 4:
                ch=0;
                break;
            default:
                printf("Invalid choice\n");
        }
    }
    return 0;
}

int isEmpty(struct Node *top){
    if(top==NULL){
        return 1;
    }
    return 0;
}

void push(struct Node **top, int data){
    struct Node *n = (struct Node *)malloc(sizeof(struct Node));
    (*n).data = data;
    (*n).next = *top;
    *top = n;
}

int pop(struct Node **top){
    if(isEmpty(*top)){
        printf("Stack underflow\n");
        return -1;
    }
    struct Node *n = *top;
    *top = (*n).next;
    return (*n).data;
}


void display(struct Node *top){
    if(isEmpty(top)){
        printf("Stack is empty\n");
        return;
    }
    struct Node *temp = top;
    printf("Stack elements are: ");
    while(temp!=NULL){
        printf("%d ",(*temp).data);
        temp = (*temp).next;
    }
    printf("\n");
}