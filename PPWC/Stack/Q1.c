#include <stdio.h>
#include <stdlib.h>
struct Stack{
    int top;
    int size;
    int *arr;
};

void push(struct Stack *s, int data);
int pop(struct Stack *s);
int peek(struct Stack s);
int isEmpty(struct Stack s);
int isFull(struct Stack s);
int count(struct Stack s);
void display(struct Stack s);
 

int main(void){
    struct Stack s;
    printf("Enter the size of the stack: ");
    scanf("%d",&s.size);
    s.arr = (int *)malloc(s.size*sizeof(int));
    s.top = -1;
    int ch=1,val;
    while (ch){
        printf("1. Push\n2. Pop\n3. Peek\n4. Count\n5. Display\n6. Exit\n");
        int choice;
        printf("Enter your choice: ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                printf("Enter the element to push: ");
                int data;
                scanf("%d",&data);
                push(&s,data);
                break;
            case 2:
                val = pop(&s);
                if(val!=-1)
                    printf("Popped element is: %d\n",val);
                break;
            case 3:
                printf("Top element is: %d\n",peek(s));
                break;
            case 4:
                printf("Number of elements in the stack is: %d\n",count(s));
                break;
            case 5:
                display(s);
                break;
            case 6:
                ch=0;
                break;
            default:
                printf("Invalid choice\n");
        }
    }
    return 0;
}

int isEmpty(struct Stack s){
    if(s.top==-1){
        return 1;
    }
    return 0;
}

int isFull(struct Stack s){
    if(s.top==s.size-1){
        return 1;
    }
    return 0;
}

void push(struct Stack *s, int data){
    if(isFull(*s)){
        printf("Stack Overflow\n");
    }
    else{
        (*s).top++;
        (*s).arr[(*s).top] = data;
    }
}

int pop(struct Stack *s){
    if(isEmpty(*s)){
        printf("Stack Underflow\n");
        return -1;
    }
    else{
        int val = (*s).arr[(*s).top];
        (*s).top--;
        return val;
    }
}

int peek(struct Stack s){
    if(isEmpty(s)){
        printf("Stack Underflow\n");
        return -1;
    }
    else{
        return s.arr[s.top];
    }
}

int count(struct Stack s){
    return s.top+1;
}

void display(struct Stack s){
    if(isEmpty(s)){
        printf("Stack is empty\n");
    }
    else{
        for(int i=s.top;i>=0;i--){
            printf("%d ",s.arr[i]);
        }
        printf("\n");
    }
}

// Enter the size of the stack: 5
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 1
// Enter the element to push: 1
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 1
// Enter the element to push: 2
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 1
// Enter the element to push: 3
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 1
// Enter the element to push: 4
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 1
// Enter the element to push: 5
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 1
// Enter the element to push: 6
// Stack Overflow
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 5
// 5 4 3 2 1
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 4
// Number of elements in the stack is: 5
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 3
// Top element is: 5
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 2
// Popped element is: 5
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 2
// Popped element is: 4
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 2
// Popped element is: 3
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 2
// Popped element is: 2
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 2
// Popped element is: 1
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 2
// Stack Underflow
// 1. Push
// 2. Pop
// 3. Peek
// 4. Count
// 5. Display
// 6. Exit
// Enter your choice: 6