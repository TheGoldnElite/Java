class Node
{
    constructor(value)
    {
        this.next=undefined;
        this.value=value;
    }
};

class List
{
    constructor()
    {
        this.head=undefined;
    }

    /* Determine whether the list is empty. */
    IsEmpty()
    {
        return this.heads==undefined
    }

    /* Insert a node with the given value to the end of the list */
    PushBack(value)
    {
        if(!this.head)
        {
            this.head=new Node(value);
            return;
        }
        let node=this.head;
        while(node.next)
        {
            node=node.next;
        }node.next=new Node(value)
    }   

    /* Insert an array of nodes with the given values to the end of the list. */
    PushBackN(arr)
    {
        /* Your Code Here */
    }

    Iterate(fn)
    {
        for(let node=this.head;node;node=node.next){fn(node.value);}
    }
};

let test_data1=123;
let test_data2=234;
let test_data3=345;
let test_data4=[111,222,333,444,555];

/* Create our list */
let list=new List();
/* Insert nodes into the list: */
list.PushBack(test_data1);
list.PushBack(test_data2);
list.PushBack(test_data3);
/* Insert array of nodes into the list: */
list.PushBackN(test_data4);
/* Iterate our list, so we can see our node values */
list.Iterate(value=>console.log(value));
/* Expected output: */
/*
    123
    234
    345
    111
    222
    333
    444
    555
*/


class Node
{
    constructor(value)
    {
        this.next=undefined;
        this.value=value;
    }
};

class List
{
    constructor()
    {
        this.head=undefined;
    }

    Iterate(fn)
    {
        for(let node=this.head;node;node=node.next){fn(node.value);}
    }

    /* Return the second to last node's value in the list */
    SecondToLast()
    {
        let node=this.head;
        while(node.next.next){
            node=node.next;
        } return node.value;
    } 

    /* Remove a node whose value matches the given value */
    /* ( You will need to fix .next pointers too! ) */
    RemoveValue(value)
    {
        let node=this.head;
        let prev=null;
        while(node){
            if(node.value==value){

                return;
            }
            prev=node;
            node=node.next;
            
        }
    }

    /* Inserts a new node before a node whose value is the search_value. */
    /* Example: */
    /*
        Before:
        10
        30
        40

        Prepend(20,30)

        After:
        10
        20
        30
        40
    */
    Prepend(new_value,search_value)
    {
        let node=this.head;
        while(node) {
            if(node.value==search_value)
        }
    }
};
/*****************************************************************************/
/* Code Tests Below */
/*****************************************************************************/

/* Creates our list */
let list=new List();

/* ( Use your solution from day 1 for this to work! ) */
/* Remember, it just shoves all of these into our list! */
list.PushBackN([111,222,333,444,555,666]);

console.log(list.SecondToLast()) /* Expected: 555 */

list.RemoveValue(333); /* No Output */

/* I'm a freebie, don't delete me! */
list.Iterate(value=>console.log(value));
/*
    Expected Output after RemoveValue(333):
    111
    222
        <-- this was 333
    444
    555
    666
*/

list.Prepend(333,444);

/* I'm a freebie, don't delete me! */
list.Iterate(value=>console.log(value));
/*
    Expected Output after Prepend(333,444):
    111
    222
    333 <- 333 should be back
    444
    555
    666
*/





class BSTNode
{
	constructor(value)
	{
		this.left=undefined;
		this.right=undefined;
		this.value=value;
	}
};

class BST
{
	constructor()
	{
		this.root=undefined;
	}

	/* I'm just here to print your BST In-Order. */
	Log(node,fmt="")
	{
		if(!node) return fmt;
		fmt=this.Log(node.left,fmt);
		fmt+=node.value+"->";
		fmt=this.Log(node.right,fmt);
		return fmt;
	}

	/* Time Complexity: O(N) */
	/* Ordering: Node, Left, Right */
	/* Description: Traverse / Iterate the tree Pre-Order. */
	/* console.log(node.value) each node's value */
	/* When To Use: When you need to explore ROOTS before LEAVES */
	PreOrder(node)
	{
		if(!node) return;
		/* Call me recursively */
		/* Call me recursively */
	}

	/* Ordering: Left, Node, Right */	
	/* Time Complexity: O(N) */
	/* Description: Traverse / Iterate the tree In-Order. */
	/* console.log(node.value) each node's value */
	/* When To Use: When you need to explore the tree INORDER */
	InOrder(node)
	{
		if(!node) return;
		/* Call me recursively */
		/* Call me recursively */
	}

	/* Left, Right, Node */
	/* Time Complexity: O(N) */
	/* Description: Traverse / Iterate the tree Post-Order. */
	/* console.log(node.value) each node's value */
	/* When To Use: When you need to explore LEAVES before ROOTS */
	PostOrder(node)
	{
		if(!node) return;
		/* Call me recursively */
		/* Call me recursively */
	}
};
/*****************************************************************************/
/* Code Tests Below */
/*****************************************************************************/
let bst=new BST();
bst.root=new BSTNode(100);
bst.root.left=new BSTNode(50);
bst.root.left.left=new BSTNode(25);
bst.root.left.right=new BSTNode(75);
bst.root.right=new BSTNode(150);
bst.root.right.left=new BSTNode(125);
bst.root.right.right=new BSTNode(175);

console.log(bst.PreOrder(bst.root)); 	/* Expected: 100 50 25 75 150 125 175 */
console.log(bst.InOrder(bst.root)); 	/* Expected: 25 50 75 100 125 150 175 */
console.log(bst.PostOrder(bst.root));   /* Expected: 25 75 50 125 175 150 100 */