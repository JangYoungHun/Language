#include<stdio.h>
#include<string.h>
#include <malloc.h>

typedef struct Nodes
{
	char* data;
	struct Nodes* next;

}Node;

typedef struct listStack
{
	Node* peek;
	int size;
}listStack;

void createStack(listStack** stack) {
	(*stack) = (listStack*)malloc(sizeof(listStack));
	(*stack)->peek = NULL;
	(*stack)->size = 0;

}

Node* createNode(char* data) {

	Node* newNode = (Node*)malloc(sizeof(Nodes));
	newNode->data = (char*)malloc(sizeof(strlen(data) + 1 ));  //null 문자 + 1
	strcpy_s(newNode->data, sizeof(strlen(data)+1) , data);

	return newNode;
}


void push(listStack* stack, Node* node) {

	if (stack->size == 0) {
		stack->peek = node;
	}
	else {
		node->next = stack->peek;
		stack->peek = node;
	}
	stack->size++;
}

Node* pop(listStack* stack) {

	Node* topNode;
	//Stack이 비어있을때 
	if (stack->size == 0) {
		printf("!!! Stack is  Empty");
		topNode = NULL;
	}
	else {
		topNode = stack->peek;
		stack->peek = stack->peek->next;
		stack->size--;
	}

	return topNode;

}

void deleteNode(Node* node) {

	free(node->data);
	free(node);

}

void deleteStack(listStack* stack) {

	int size = stack->size;
	Node* tempNode;

	for (int i = 0; i < size; i++) {
		tempNode = pop(stack);
		deleteNode(tempNode);
	}
		
	free(stack);

}


int main() {
	
	listStack* stack;
	createStack(&stack);

	push(stack, createNode((char*)"a"));
	push(stack, createNode((char*)"b"));
	push(stack, createNode((char*)"c"));
	push(stack, createNode((char*)"d"));
	printf("push\n");
	Node* topNode = stack->peek;
	for (int i = 0; i < stack->size; i++) {
		printf("%s\n",topNode->data);
		topNode = topNode->next;

	}
	printf("pop\n");
	topNode = pop(stack);
	topNode = stack->peek;
	for (int i = 0; i < stack->size; i++) {
		printf("%s\n", topNode->data);
		topNode = topNode->next;

	}


}